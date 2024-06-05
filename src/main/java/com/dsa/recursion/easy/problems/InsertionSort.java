package com.dsa.recursion.easy.problems;

import java.util.Arrays;

import static com.dsa.sorting.practice.BubbleSort.swap;

public class InsertionSort {

    public static void main(String[] args) {
        int[] nums = {4, 7, 2, 3, 5};
        sortRec(nums, nums.length);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortRec(int[] arr, int n) {
        // Base Case: If there's only one element left, it's already sorted
        if (n <= 1)
            return;

        // Sort the first n-1 elements
        sortRec(arr, n-1);

        // Store the last element of the current subarray
        int last = arr[n-1];
        int j = n-2;

        // Shift elements of the sorted subarray that are greater than the last element to the right
        while (j >= 0 && arr[j] > last) {
            arr[j+1] = arr[j];
            j--;
        }

        // set the last element to its correct position
        arr[j+1] = last;

    }

    public static void sort(int[] nums) {
        int N = nums.length;
        for (int i = 0; i < N-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if (nums[j] < nums[j-1]) {
                    swap(nums, j, j-1);
                } else {
                    break;
                }
            }
        }
    }
}
