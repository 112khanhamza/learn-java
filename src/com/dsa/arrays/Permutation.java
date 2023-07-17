package com.dsa.arrays;

import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        int[] ans = buildArray(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] buildArray(int[] nums) {
        final int N = nums.length;
        int[] res = new int[N];

        for (int i = 0; i < N; i++) {
            res[i] = nums[nums[i]];
        }

        return res;
    }
}
