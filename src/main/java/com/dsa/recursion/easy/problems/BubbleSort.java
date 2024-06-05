package com.dsa.recursion.easy.problems;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        sortRec(nums, nums.length);
        System.out.println(Arrays.toString(nums));
    }

    static void sortRec(int[] nums, int length) {
        // base case
        if (length == 1) return;

        boolean swapped = false;

        for (int i = 0; i < length-1; i++) {
            if (nums[i] > nums[i+1]) {
                swap(nums, i, i+1);
                swapped = true;
            }
        }

        if (!swapped) return;

        sortRec(nums, length-1);
    }

    static void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j-1]) {
                    swap(nums, j, j-1);
                    swapped = true;
                }
            }
            if (!swapped) {
                return;
            }
        }
    }

    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
