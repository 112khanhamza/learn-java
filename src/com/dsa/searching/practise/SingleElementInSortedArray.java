package com.dsa.searching.practise;

public class SingleElementInSortedArray {

    public static void main(String[] args) {

    }

    public static int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        // Edge Cases
        if (n == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[n-1] != nums[n-2]) return nums[n-1];

        // Binary Search
        int start = 1;
        int end = n-2;

        while (start<=end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) {
                return nums[mid];

            } else if ((mid % 2 == 0 && nums[mid] == nums[mid-1]) ||
                    (mid % 2 != 0 && nums[mid] == nums[mid+1])) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
