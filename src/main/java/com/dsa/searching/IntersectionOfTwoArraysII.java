package com.dsa.searching;

import java.util.*;

public class IntersectionOfTwoArraysII {

    public static void main(String[] args) {
        int[] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
        System.out.println(intersect(nums1, nums2));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            int count = map.getOrDefault(i, 0);
            map.put(i, ++count);
        }

        for (int i : nums2) {
            int count = map.getOrDefault(i, 0);
            if (count > 0) {
                ans.add(i);
                map.put(i, --count);
            }
        }
        
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;
    }
}
