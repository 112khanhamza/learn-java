package com.dsa.binarysearch;

public class FloorOfNumber {
    public static void main(String[] args) {
        //           0, 1, 2, 3,  4,  5,  6
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int target = 3; // ans = 12
        System.out.println(floorSearch(arr, 0, arr.length-1, target));
        System.out.println(floor(arr, target));
    }

    static int floor(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (target == arr[mid]) return arr[mid];
            else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return arr[high];
    }

    static int floorSearch(int[] arr, int low, int high, int target) {
        // if the target is less than arr[0] then return -1
        if (target < arr[0]) {
            return -1;
        }

        // if the target is greater than or equal to the last element then return the last element
        if (target >= arr[high]) {
            return arr[high];
        }

        // get the middle index
        int mid = low + (high-low) / 2;

        // if the target is equal to arr[mid] then return arr[mid]
        if (target == arr[mid]) {
            return arr[mid];
        }

        // if the target is greater than arr[mid] then either the answer can be arr[mid] OR
        // it can lie between arr[mid+1]...high
        else if (target > arr[mid]) {
            if (mid+1 >= high && target > arr[mid+1]) {
                return arr[mid];
            } else {
                return floorSearch(arr, mid+1, high, target);
            }
        }

        // if the target is less than arr[mid] then wither the answer can be arr[mid-1] OR
        // it can lie between arr[low]...arr[mid-1]
        else {
            if (mid-1 <= low && target <= arr[mid-1]) {
                return arr[mid-1];
            } else {
                return floorSearch(arr, low, mid-1, target);
            }
        }
    }
}
