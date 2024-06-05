package com.dsa.arrays.practice;

import java.util.Arrays;

public class FirstAndLastPosOfEleInSortedArray {

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(nums, 8)));
    }

    // Space O(1), Time O(n)
    public static int[] searchRange(int[] nums, int target) {
        boolean startFlag = false;
        boolean endFlag = false;
        int[] pos = {-1, -1};

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                if (!endFlag) {
                    startFlag = true;
                    pos[0] = i;
                }
                if (startFlag) {
                    endFlag = true;
                    pos[1] = i;
                }
            }
        }
        return pos;
    }

    // Space O(1), Time O(log n)
    public static int[] searchRange2(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        int possibleStart = -1;
        int possibleEnd = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                possibleStart = mid;
                end = mid - 1;
            }
            else if (target < nums[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        start = 0;
        end = nums.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                possibleEnd = mid;
                start = mid + 1;
            }
            else if (target < nums[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return new int[]{possibleStart, possibleEnd};
    }
}
