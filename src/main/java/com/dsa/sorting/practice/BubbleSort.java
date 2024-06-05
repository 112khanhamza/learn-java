package com.dsa.sorting.practice;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = {5, 4, 1, 2, 3};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * [5, 4, 1, 2, 3]
     *
     */
    static void sort(int[] nums) {
        boolean isSorted;
        for (int i = 0; i < nums.length; i++) {
            isSorted = true;
            for (int j = 0; j < nums.length-1-i; j++) {
                if (nums[j] > nums[j+1]) {
                    isSorted = false;
                    swap(nums, j, j+1);
                }
            }
            if (isSorted) {
                return;
            }
        }
    }

    public static void swap(int[] nums, int a , int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
