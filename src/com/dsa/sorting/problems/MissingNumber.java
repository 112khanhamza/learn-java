package com.dsa.sorting.problems;

// https://leetcode.com/problems/missing-number/
public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == nums.length) {
                i++;
                continue;
            }
            // check if element is at correct index
            if (nums[i] != i) {
                swap(nums, i, nums[i]);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) return j;
        }
        return nums.length;
    }

    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
