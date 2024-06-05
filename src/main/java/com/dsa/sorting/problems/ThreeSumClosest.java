package com.dsa.sorting.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/3sum-closest/
public class ThreeSumClosest {

    public static void main(String[] args) {
        int[] nums = {-98, -98, -96, -96, -90, -89, -89, -89, -88, -87, -87, -86, -85,
                -85, -85, -85, -82, -80, -76, -76, -75, -75, -73, -72, -71, -71, -69,
                -68, -68, -67, -66, -64, -64, -62, -62, -62, -62, -60, -59, -58, -57,
                -57, -56, -56, -55, -55, -55, -54, -51, -50, -50, -50, -49, -46, -46,
                -46, -45, -45, -45, -44, -44, -43, -42, -41, -41, -40, -40, -40, -40,
                -37, -35, -35, -34, -32, -32, -28, -27, -27, -26, -26, -25, -24, -24,
                -24, -24, -23, -23, -22, -21, -20, -17, -15, -15, -15, -13, -13, -12,
                -11, -10, -10, -9, -9, -8, -8, -8, -4, -3, -3, -3, 0, 0, 0, 0, 0, 2, 3,
                3, 4, 6, 7, 8, 8, 10, 11, 11, 11, 13, 14, 15, 17, 17, 19, 20, 22, 23,
                24, 27, 28, 29, 29, 29, 30, 31, 35, 36, 36, 36, 37, 37, 37, 37, 39, 39,
                40, 41, 43, 44, 45, 45, 47, 48, 49, 50, 50, 51, 52, 53, 53, 54, 55, 55,
                56, 57, 59, 60, 64, 66, 66, 68, 68, 69, 72, 73, 76, 76, 78, 80, 82, 82,
                84, 85, 85, 87, 87, 87, 88, 88, 89, 89, 90, 90, 90, 90, 92, 94, 95, 95,
                96, 97, 97, 98, 98};
        int target = 255;
        System.out.println(threeSumClosest(nums, target));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int result = nums[0] + nums[1] + nums[n-1];
        for (int i = 0; i < n; i++) {
            int j = i+1;
            int k = n-1;

            while (j < k) {
                int currentSum = nums[i] + nums[j] + nums[k];
                if (currentSum < target) {
                    j++;
                } else {
                    k--;
                }
                if (Math.abs(currentSum-target) < Math.abs(result-target)) {
                    result = currentSum;
                }
            }
        }
        return result;
    }
}
