package com.dsa.sorting.problems;

// https://leetcode.com/problems/first-missing-positive/
public class FirstMissingPositive {

    public static void main(String[] args) {
        int[] arr = {7,8,9,11,12};
        System.out.println(firstMissingPositive(arr));
    }

    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            // check if element is at correct index
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        // search for the first missing number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1) {
                return index+1;
            }
        }

        return nums.length + 1;
    }

    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
