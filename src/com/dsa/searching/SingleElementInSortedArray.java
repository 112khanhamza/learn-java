package com.dsa.searching;

// https://leetcode.com/problems/single-element-in-a-sorted-array/
public class SingleElementInSortedArray {

    public static void main(String[] args) {
        int[] nums = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate2(nums));
    }

    public static int singleNonDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                if (nums[i] != nums[i+1]) return nums[i];
            } else if (i == nums.length-1) {
                if (nums[i] != nums[i-1]) return nums[i];
            } else {
                if (nums[i] != nums[i+1] && nums[i] != nums[i-1]) return nums[i];
            }
        }
        return -1;
    }

    // Using Binary Search
    public static int singleNonDuplicate2(int[] nums) {
        int n = nums.length;
        // Edge Cases
        if (n == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[n-1] != nums[n-2]) return nums[n-1];

        int low = 1;
        int high = n-2;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) {
                return nums[mid];

            } else if ((mid % 2 == 1 && nums[mid-1] == nums[mid]) ||
                    (mid % 2 == 0 && nums[mid+1] == nums[mid])) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
