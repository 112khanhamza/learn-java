package com.dsa.binarysearch;

import java.util.Arrays;

public class FirstAndLastPositionOfElement {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        int low = 0;
        int high = nums.length-1;
        int mid;
        int possibleAns = -1;
        // find the first position
        while (low <= high) {
            mid = low + (high-low) / 2;
            if (target < nums[mid]) {
                high = mid - 1;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                possibleAns = mid;
                high = mid - 1;
            }
        }
        res[0] = possibleAns;

        // find the last position
        low = 0;
        high = nums.length-1;
        mid = 0;
        possibleAns = -1;
        while (low <= high) {
            mid = low + (high-low) / 2;
            if (target < nums[mid]) {
                high = mid - 1;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                possibleAns = mid;
                low = mid + 1;
            }
        }
        res[1] = possibleAns;
        return res;
    }
}
