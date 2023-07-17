package com.dsa.arrays;

import java.util.HashMap;
import java.util.Map;

public class GoodPairs {
    public static void main(String[] args) {

    }

    int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            int value = map.getOrDefault(i, 0);
            goodPairs += value;
            map.put(i, value+1);
        }

        return goodPairs;
    }
}
