package com.dsa.searching;

// https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchInRotatedSortedArray {

    public static void main(String[] args) {

    }

    public static int search(int[] nums, int target) {
        int pivotIndex = pivotIndex(nums);
        // If the array is not rotated
        if (pivotIndex == -1) {
            return binarySearch(nums, 0, nums.length-1, target);
        }
        // There can be three cases
        if (nums[pivotIndex] == target) return pivotIndex;
        else if (target >= nums[0]) return binarySearch(nums, 0, pivotIndex-1, target);
        else return binarySearch(nums, pivotIndex+1, nums.length-1, target);
    }

    private static int binarySearch(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            else if (target > nums[mid]) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }

    public static int pivotIndex(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int mid;
        while (start <= end) {
            mid = start + (end-start) / 2;
            if (mid < end && nums[mid] > nums[mid+1]) {
                return mid;

            }
            if (mid > start && nums[mid] < nums[mid-1]) {
                return mid-1;

            }
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
