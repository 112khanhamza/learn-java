package com.dsa.binarysearch;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int target = 3;
        System.out.println(ceiling(arr, target));

        int[] arr1 = {1, 2, 8, 10, 10, 12, 19};
        int x = 3;
        System.out.println(ceilSearch(arr1, 0, arr1.length-1, x));
    }

    static int ceiling(int[] arr, int target) {
        long start1 = System.nanoTime();

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == arr[mid]) {
                long end1 = System.nanoTime();
                System.out.println("ceiling : Elapsed Time in nano seconds: "+ (end1-start1));
                return arr[mid];
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        long end1 = System.nanoTime();
        System.out.println("ceiling : Elapsed Time in nano seconds: "+ (end1-start1));
        return arr[start];
    }

    // using optimised binary search
    static int ceilSearch(int[] arr, int low, int high, int target) {
        long start1 = System.nanoTime();

        // if target is smaller than or equal to first element then return the first element.
        if (target <= arr[low]) {
            long end1 = System.nanoTime();
            System.out.println("ceilSearch : Elapsed Time in nano seconds: "+ (end1-start1));
            return arr[low];
        }

        // if target is greater than the last element then return -1
        if (target > arr[high]) {
            long end1 = System.nanoTime();
            System.out.println("ceilSearch : Elapsed Time in nano seconds: "+ (end1-start1));
            return -1;
        }

        // find the middle index
        int mid = low + (high - low) / 2;

        // if the target is same as middle element then return the middle element
        if (target == arr[mid]) {
            long end1 = System.nanoTime();
            System.out.println("ceilSearch : Elapsed Time in nano seconds: "+ (end1-start1));
            return arr[mid];
        }

        // if target is greater than arr[mid] then either arr[mid + 1] is the ceiling OR
        // ceiling lies between arr[mid+1]...high
        else if (target > arr[mid]) {
            if (mid + 1 <= high && target <= arr[mid + 1]) {
                long end1 = System.nanoTime();
                System.out.println("ceilSearch : Elapsed Time in nano seconds: "+ (end1-start1));
                return arr[mid + 1];
            } else {
                return ceilSearch(arr, mid+1, high, target);
            }
        }

        // if target is less than arr[mid] than either arr[mid] is the ceiling of x OR
        // ceiling lies in arr[low]....arr[mid-1]
        else {
            if (mid - 1 >= low && target > arr[mid - 1]) {
                long end1 = System.nanoTime();
                System.out.println("ceilSearch : Elapsed Time in nano seconds: "+ (end1-start1));
                return arr[mid];
            } else {
                return ceilSearch(arr, low, mid-1, target);
            }
        }
    }
}
