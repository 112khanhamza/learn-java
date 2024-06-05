package com.dsa.arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSef {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    // Brute Force
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[nums.length];
        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                product *= nums[j];
            }
            res[i] = product;
        }
        return res;
    }

    public static int[] productExceptSelf2(int[] nums) {
        int n = nums.length;

        int[] left = new int[n];
        left[0] = 1;

        int[] right = new int[n];
        right[n-1] = 1;

        // Build the left Array
        for (int i=1; i<n; i++) {
            left[i] = left[i-1] * nums[i-1];
        }

        // Build the right Array
        for (int i=n-2; i>=0; i--) {
            right[i] = right[i+1] * nums[i+1];
        }

        // Product of Both left and Right is our answer
        int[] result = new int[n];
        for (int i=0; i<n; i++) {
            result[i] = left[i] * right[i];
        }

        return result;
    }
}
