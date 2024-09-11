package com.dsa.searching;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RightInterval {

    public static void main(String[] args) {
        int[][] intervals = {{3,4},{2,3},{1,2}};
        int[] res = findRightIntervalOpt(intervals);
        System.out.println(Arrays.toString(res));
    }

    public static int[] findRightIntervalOpt(int[][] intervals) {
        int[] startIntervals = new int[intervals.length];
        Map<Integer, Integer> startIntervalMap = new HashMap<>();
        for (int i = 0; i < intervals.length; i++) {
            startIntervals[i] = intervals[i][0];
            startIntervalMap.put(startIntervals[i], i);
        }
        Arrays.sort(startIntervals);
        int[] ans = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            int end = intervals[i][1];
            int res = binarySearch(startIntervals, end);
            if (res == -1) ans[i] = res;
            else ans[i] = startIntervalMap.get(res);
        }
        return ans;
    }

    private static int binarySearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length-1;
        int m;
        int possibleAns = -1;

        while (s <= e) {
            m = (s + e)/2;
            if (arr[m] == target) return arr[m];
            if (arr[m] > target) {
                possibleAns = arr[m];
                e = m-1;
            }
            else s = m+1;
        }

        return possibleAns;
    }

    public static int[] findRightInterval(int[][] intervals) {
        int[] result = new int[intervals.length];
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }

        for (int i=0; i<end.length; i++) {
            int index = findMinStartIndex(end[i], start);
            result[i] = index;
        }

        return result;
    }

    private static int findMinStartIndex(int end, int[] starts) {
        int minIndex = -1;
        for (int i = 0; i < starts.length; i++) {
            if (starts[i] >= end && (minIndex == -1 || starts[i] < starts[minIndex])) {
                minIndex = i;
            }
        }
        return minIndex;
    }

}
