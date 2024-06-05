package com.dsa.arrays;

import java.util.Arrays;

public class TargetArrayInOrder {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

    static int[] createTargetArray(int[] nums, int[] index) {
        int N = nums.length;
        int[] res = new int[N];

        for (int i = 0; i < N; i++) {
            res[i] = -1;
        }
        for (int i = 0; i < N; i++) {
            if (res[index[i]] != -1) {
                shiftArrayRight(res, index[i]);
            }
            res[index[i]] = nums[i];
        }
        return res;
    }

    static void shiftArrayRight(int[] arr, int start) {
        int N = arr.length;
        for(int i=N-2; i>=start; i--) {
            arr[i+1] = arr[i];
        }
    }
}
