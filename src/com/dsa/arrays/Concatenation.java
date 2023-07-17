package com.dsa.arrays;

import java.util.Arrays;

public class Concatenation {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int[] ans = getConcatenation(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] getConcatenation(int[] nums) {
        final int N = nums.length;
        int[] res = new int[N*2];
        for (int i = 0; i < N; i++) {
            res[i] = nums[i];
            res[i+N] = nums[i];
        }
        return res;
    }
}
