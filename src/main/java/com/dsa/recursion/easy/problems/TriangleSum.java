package com.dsa.recursion.easy.problems;

import java.util.Arrays;

public class TriangleSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        printTriangle2(nums);
    }

    public static void printTriangle2(int[] nums) {
        // base case
        if (nums.length == 1) return;

        int[] temp = new int[nums.length-1];

        // recursive function to fill elements in temp
        helper(temp, nums, 0);

        printTriangle2(temp);

        System.out.println(Arrays.toString(temp));
    }

    public static void helper(int[] temp, int[] nums, int index) {
        // base condition
        if (temp.length == index) return;

        // fill the temp array
        temp[index] = nums[index] + nums[index+1];
        helper(temp, nums, index+1);
    }

    public static void printTriangle(int[] nums) {
        // base case
        if (nums.length < 1) {
            return;
        }
        int[] temp = new int[nums.length-1];
        for (int i = 0; i < temp.length; i++) {
            int x = nums[i] + nums[i+1];
            temp[i] = x;
        }
        printTriangle(temp);
        System.out.println(Arrays.toString(nums));
    }
}
