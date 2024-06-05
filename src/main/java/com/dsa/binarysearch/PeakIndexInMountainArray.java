package com.dsa.binarysearch;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,1,0};
        System.out.println(peakIndexInMountainArray2(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        int mid;
        int possibleAns = -1;

        while (low <= high) {
            mid = low + (high-low) / 2;

            if (arr[mid] < arr[mid+1]) {
                low = mid + 1;
            } else if (arr[mid] > arr[mid+1]) {
                possibleAns = mid;
                high = mid - 1;
            }
        }

        return possibleAns;
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

}
