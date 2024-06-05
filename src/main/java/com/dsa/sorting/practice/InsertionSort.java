package com.dsa.sorting.practice;

import java.util.Arrays;

import static com.dsa.sorting.practice.BubbleSort.swap;

public class InsertionSort {

    public static void main(String[] args) {
        int[] nums = {5, 2, 4, 3, 1};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * [4, 2, 5, 3, 1]
     * []
     */
    static void sort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (nums[j] < nums[j-1]) {
                    swap(nums, j, j-1);
                } else {
                    break;
                }
            }
        }
    }
}
