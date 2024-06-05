package com.dsa.searching;

import java.util.*;
import java.util.stream.Collectors;

public class ThreeSum {

    public static void main(String[] args) {
        int[] nums = new int[] {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> ans = triplet3(nums);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    public static List<List<Integer>> triplet3(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int N = nums.length;
        for (int i = 0; i < N; i++) {
            if (i>0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = N-1;
            while (j<k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j-1]) j++;
                    while (j < k && nums[k] == nums[k+1]) k--;
                }
            }
        }
        return ans;
    }

    public static List<List<Integer>> triplet2(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            Set<Integer> hashSet = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                int third = - (nums[i] + nums[j]);
                if (hashSet.contains(third)) {
                    int[] temp = new int[] {nums[i], nums[j], third};
                    Arrays.sort(temp);
                    set.add(Arrays.stream(temp).boxed().collect(Collectors.toList()));
                }
                hashSet.add(nums[j]);
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for(List<Integer> list : set) {
            ans.add(list);
        }

        return ans;
    }

    public static List<List<Integer>> triplet(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        int[] temp = new int[] {nums[i], nums[j], nums[k]};
                        Arrays.sort(temp);
                        set.add(Arrays.stream(temp).boxed().collect(Collectors.toList()));
                    }
                }
            }
        }

        for(List<Integer> list : set) {
            ans.add(list);
        }

        return ans;
    }
}
