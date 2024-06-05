package com.dsa.binarysearch;

public class FindInMountainArray {
    public static void main(String[] args) {
        // first find the peak
        // then do binary search from 0...peak
        // if did not find the ans then do binary search from peak...arr.length-1
    }

    static int peakIndexInMountainArray2(int[] arr) {
        int start = 0;
        int end = arr.length;
        int mid;
        while (start < end) {
            mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                // this can be a possible ans
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int binarySearch(int[] arr, int start, int end, int target) {
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


}
