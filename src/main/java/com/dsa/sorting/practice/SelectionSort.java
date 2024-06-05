package com.dsa.sorting.practice;

import java.util.Arrays;

import static com.dsa.sorting.practice.BubbleSort.swap;

public class SelectionSort {

    public static void main(String[] args) {
        int[] nums = {4, 3, 1, 5, 2};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * [4, 3, 1, 5, 2]
     */
    static void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int lastIndex = nums.length - i - 1;
            int maxIndex = getMaxIndex(nums, 0, lastIndex);
            swap(nums, maxIndex, lastIndex);
        }
    }

    static int getMaxIndex(int[] nums, int start, int end) {
        int maxIndex = 0;
        for (int i = start; i <= end; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
