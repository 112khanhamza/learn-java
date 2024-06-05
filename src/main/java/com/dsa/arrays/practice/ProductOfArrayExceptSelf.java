package com.dsa.arrays.practice;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf1(nums)));
    }

    // Space O(n), Time O(n^2)
    public static int[] productExceptSelf1(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int currentProduct = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    continue;
                }
                currentProduct *= nums[j];
            }
            result[i] = currentProduct;
            currentProduct = 1;
        }

        return result;
    }

    // Space O(n), Time O(n)
    public static int[] productExceptSelf2(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        left[0] = 1;
        int[] right = new int[n];
        right[n-1] = 1;

        // build the left array
        for (int i = 1; i < n; i++) {
            left[i] = left[i-1] * nums[i-1];
        }

        // build the right array
        for (int i = n-2; i >= 0; i--) {
            right[i] = right[i+1] * nums[i+1];
        }

        // product of left and right
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = left[i] * right[i];
        }

        return result;
    }
}
