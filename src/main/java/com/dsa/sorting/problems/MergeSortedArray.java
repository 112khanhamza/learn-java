package com.dsa.sorting.problems;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {0,0,3,0,0,0,0,0,0};
        int[] nums2 = {-1,1,1,1,2,3};
        mergeOpt(nums1, 3, nums2, 6);
        System.out.println(Arrays.toString(nums1));
    }

    public static void mergeOpt(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // edge case
        if (nums2.length == 0) return;

        for (int i = m; i < nums1.length; i++) {
            if (nums1[i] == 0) {
                // start replacing values with second array
                for (int j = 0; j < nums2.length; j++, i++) {
                    // swap
                    swap(nums1, i, nums2, j);
                }
            }
        }

        // now sort nums1
        bubbleSort(nums1);
    }

    private static void swap(int[] nums1, int i, int[] nums2, int j) {
        int temp = nums1[i];
        nums1[i] = nums2[j];
        nums2[j] = temp;
    }

    private static void bubbleSort(int[] arr) {
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j] < arr[j-1]) {
                    // swap if the item is smaller than the previous item
                    swap(arr, j, j-1);
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i,
            // it means that the array is sorted
            if (!swapped) break;
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
