package com.dsa.arrays;

public class ShuffleArray {
    public static void main(String[] args) {

    }

    int[] shuffle(int[] nums, int n) {
        int[] res = new int[n*2];
        int m = 0;
        for (int i = 0; i < n; i++) {
            res[m] = nums[i];
            m++;
            res[m] = nums[i+n];
            m++;
        }
        return res;
    }
}
