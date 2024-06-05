package com.dsa.binarysearch;

public class RotationCountInRotatedSortedArray {
    public static void main(String[] args) {
        //           0   1   2  3  4   5
        int[] arr = {7, 9, 11, 12, 5};
        System.out.println(rotationCount(arr));
        // output = 2
    }

    static int rotationCount(int[] arr) {
        // find the peak index
        int peakIndex = findPeakIndex(arr);
        System.out.println("Peak Index = "+peakIndex);
        // index of minimum element is the answer so the answer will be peak index + 1
        return peakIndex+1;
    }

    static int findPeakIndex(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int mid;

        while (start<=end) {
            mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
            }
            if (arr[start] >= arr[mid]) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }

        return -1;
    }
}
