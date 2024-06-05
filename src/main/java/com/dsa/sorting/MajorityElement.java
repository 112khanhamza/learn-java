package com.dsa.sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(majorityElement2(nums));
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }

    // Brute Force
    public static int majorityElement1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int count = map.getOrDefault(nums[i], 0);
            map.put(nums[i], ++count);
        }

        int maxElement = 0;
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int currentElement = entry.getKey();
            int count = entry.getValue();
            if (count > maxCount) {
                maxCount = count;
                maxElement = currentElement;
            }
        }

        return maxElement;
    }

    // Moore's Voting Algorithm
    public static int majorityElement2(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}
