package com.dsa.arrays.practice;

// https://leetcode.com/problems/house-robber/
public class HouseRobber {

    public static void main(String[] args) {
        int[] nums = {9, 1, 8, 100};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
        int rob1 = 0;
        int rob2 = 0;

        // rob1, rob2, n, n+1, ...
        for (int n : nums) {
            int temp = Math.max(n + rob1, rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return rob2;
    }
}
