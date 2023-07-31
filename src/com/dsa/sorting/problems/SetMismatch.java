package com.dsa.sorting.problems;

import java.util.Arrays;

// https://leetcode.com/problems/set-mismatch/
public class SetMismatch {

    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        findErrorNums(arr);
    }

    public static int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        cyclicSort(nums);
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                // get the duplicate number
                res[0] = nums[i];
                // get the missing number
                res[1] = i+1;
            }
        }

        return res;
    }

    public static void cyclicSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != i + 1 && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
