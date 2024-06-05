package com.dsa.leetcode;

public class MaximumRunningTime {

    public static void main(String[] args) {


    }

    public static long maxRunTime(int n, int[] batteries) {
        long sum = 0;
        for (int ele : batteries) {
            sum += ele;
        }

        long start = 0;
        long end = sum;
        long ans = 0;

        while (start <= end) {
            long avgTime = start + (end - start) / 2;
            if (isPossibleToRun(n, batteries, avgTime)) {
                ans = avgTime;
                start = avgTime + 1;
            } else {
                end = avgTime - 1;
            }
        }
        return ans;
    }

    private static boolean isPossibleToRun(int n, int[] batteries, long avgTime) {
        long duration = 0;
        for (int ele : batteries) {
            if (ele < avgTime) duration += ele;
            else duration += avgTime;
        }
        return duration >= avgTime * n;
    }
}
