package com.dsa.searching.practise;

// https://leetcode.com/problems/single-element-in-a-sorted-array/
public class SingleElementInSortedArray {

    public static void main(String[] args) {

    }

    // Time O(n) Space O(1)
    public static int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        // edge cases
        if (n == 0) return -1;
        if (n < 2) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[n-1] != nums[n-2]) return nums[n-1];

        for (int i = 1; i < n-2; i++) {
            if (nums[i] != nums[i-1] && nums[i] != nums[i+1])
                return nums[i];
        }
        return -1;
    }

    public static int singleNonDuplicate2(int[] nums) {
        int n = nums.length;
        // edge cases
        if (n == 0) return -1;
        if (n < 2) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[n-1] != nums[n-2]) return nums[n-1];

        // binary search
        int start = 1;
        int end = n-2;
        while (start <= end) {
            int mid = start + (end-start) / 2;
            if (nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1])
                return nums[mid];
            else if ((mid % 2 == 1 && nums[mid] != nums[mid-1]) ||
                    (mid % 2 == 0 && nums[mid] == nums[mid-1]))
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}
