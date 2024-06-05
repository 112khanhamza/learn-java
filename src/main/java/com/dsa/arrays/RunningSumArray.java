package com.dsa.arrays;

import java.util.Arrays;

public class RunningSumArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] ans = runningSum(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] runningSum(int[] nums) {
        int currSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currSum += nums[i];
            nums[i] = currSum;
        }
        return nums;
    }
}
