package com.dsa.arrays.practice;

import java.util.Arrays;

public class SortColors {

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors2(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        int n = nums.length;
        int zeroesCount = 0;
        int onesCount = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zeroesCount++;
            }
            if (nums[i] == 1) {
                onesCount++;
            }
        }

        for (int i = 0; i < zeroesCount; i++) {
            nums[i] = 0;
        }
        for (int i = zeroesCount; i < zeroesCount + onesCount; i++) {
            nums[i] = 1;
        }
        for (int i = zeroesCount + onesCount; i < n; i++) {
            nums[i] = 2;
        }
    }

    public static void sortColors2(int[] nums) {
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n-1;

        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    swap(nums, low++, mid++);
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums, high--, mid);
                    break;
                default:
                    break;
            }
        }
    }

    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
