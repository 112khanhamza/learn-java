package com.dsa.binarysearch;

public class FindPositionInSortedInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int target = 12;
        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target) {
        // get the low and high range of arr
        int low = 0;
        int high = 1;
        while (target > arr[high]) {
            int newLow = high + 1;
            // high = previousHigh + sizeOfBox * 2
            high = high + (high - low + 1) * 2;
            low = newLow;
        }

        // apply binary search
        while (low <= high) {
            int mid = low + (high-low) / 2;
            if (target < arr[mid]) {
                high = mid - 1;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
