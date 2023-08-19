package com.dsa.sorting.problems;

import java.util.*;
import java.util.stream.Collectors;

// https://leetcode.com/problems/3sum/
public class ThreeSum {

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = threeSum3(nums);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    // Brute Force O(n^3)
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        int[] temp = new int[] {nums[i], nums[j], nums[k]};
                        Arrays.sort(temp);
                        set.add(Arrays.stream(temp).boxed().collect(Collectors.toList()));
                    }
                }
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (List<Integer> list : set) {
            ans.add(list);
        }
        return ans;
    }

    // Brute Force Optimised using Hashing O(n^2)
    public static List<List<Integer>> threeSum2(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            Set<Integer> hash = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int third = -(nums[i] + nums[j]);
                if (hash.contains(third)) {
                    int[] temp = new int[] {nums[i], nums[j], third};
                    Arrays.sort(temp);
                    set.add(Arrays.stream(temp).boxed().collect(Collectors.toList()));
                } else {
                    hash.add(nums[j]);
                }
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (List<Integer> list : set) {
            ans.add(list);
        }
        return ans;
    }

    // Optimised O(n)
    public static List<List<Integer>> threeSum3(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue; // skip same elements
            int j = i+1;
            int k = n-1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j-1]) j++; // skip same elements
                    while (j < k && nums[k] == nums[k+1]) k--; // skip same elements
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return ans;
    }

}
