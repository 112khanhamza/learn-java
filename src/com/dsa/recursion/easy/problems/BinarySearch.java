package com.dsa.recursion.easy.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 8, 8, 9, 12};
        int[] nums2 = {12, 9, 7, 5, 4, 1};
        int[] nums3 = {-1,0,3,5,9,12};
//        System.out.println(isSortedDesc(nums2, nums2.length-1));
//        System.out.println(linearSearch3(nums, 8, 0));
        System.out.println(binarySearchRec(nums3, 2));
    }

    public static int binarySearchRec(int[] nums, int target) {
        return helper(0, nums.length-1, nums, target);
    }

    static int helper(int start, int end, int[] nums, int target) {
        if (start > end) return -1;
        int mid = start + (end-start) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return helper(start, mid-1, nums, target);
        } else {
            return helper(mid+1, end, nums, target);
        }
    }

    public static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid-1;
            else start = mid+1;
        }
        return -1;
    }

    static boolean isSortedAsc(int[] nums, int index) {
        if (nums.length - 1 == index) {
            return true;
        }
        return nums[index] < nums[index+1] && isSortedAsc(nums, index+1);
    }

    static boolean isSortedDesc(int[] nums, int index) {
        if (index == 0) {
            return true;
        }
        return nums[index] < nums[index-1] && isSortedDesc(nums, index-1);
    }

    static int linearSearch(int[] nums, int target, int index) {
        if (nums.length == index) return -1;
        if (nums[index] == target) return index;
        return linearSearch(nums, target, index+1);
    }

    static List<Integer> linearSearch2(int[] nums, int target, int index, List<Integer> result) {
        if (nums.length == index) {
            return result;
        }
        if (nums[index] == target) {
            result.add(index);
        }
        return linearSearch2(nums, target, index+1, result);
    }

    static List<Integer> linearSearch3(int[] nums, int target, int index) {
        List<Integer> result = new ArrayList<>();

        if (nums.length == index) {
            return result;
        }
        if (nums[index] == target) {
            result.add(index);
        }

        List<Integer> ansFromBelowCalls = linearSearch3(nums, target, index + 1);
        result.addAll(ansFromBelowCalls);

        return result;
    }
}
