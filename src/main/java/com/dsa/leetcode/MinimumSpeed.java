package com.dsa.leetcode;

// https://leetcode.com/problems/minimum-speed-to-arrive-on-time/
public class MinimumSpeed {

    public static void main(String[] args) {
        int[] dist = {1, 3, 2};
        double hour = 2.7;
        System.out.println(minSpeedOnTimeUsingBinarySearch2(dist, hour));
    }

    public static int minSpeedOnTimeUsingBinarySearch2(int[] dist, double hour) {
        if ((double) dist.length-1 >= hour) return -1;

        int left = 1;
        int right = (int)10e7;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (condition(mid, dist, hour)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private static boolean condition(int speed, int[] dist, double hour) {
        double time = 0;
        for (int i = 0; i < dist.length-1; i++) {
            time += dist[i] / speed;
            time += (dist[i] % speed == 0) ? 0 : 1;
        }
        time += dist[dist.length-1] * 1.0 / speed;
        return time <= hour;
    }

    public static int minSpeedOnTimeUsingBinarySearch(int[] dist, double hour) {
        if ((double) dist.length-1 >= hour) return -1;

        int l = 0;
        int r = (int) Math.pow(10, 7) + 5;

        while (l < r) {
            double totalTime = 0;
            int m = l + (r - l) / 2;
            for (int d : dist) {
                if (totalTime > (int) totalTime) {
                    totalTime = (double) ((int) totalTime + 1);
                }
                totalTime += ((double)d/(double)m);
            }
            if (totalTime > hour) l = m + 1;
            else r = m;
        }

        return l > (int) Math.pow(10, 7) ? -1 : l;
    }

    public static int minSpeedOnTime(int[] dist, double hour) {
        int N = dist.length;
        // it is not possible to reach
        if (hour < N-1) return -1;

        double i = 1;
        double minHour = Integer. MAX_VALUE;
        double currentHour = 0;
        while (minHour > hour) {
            for(int j=0; j<N; j++) {
                if (j == N-1) {
                    currentHour = currentHour + (dist[j] / i);
                    continue;
                }
                currentHour = currentHour + Math.ceil(dist[j] / i);
            }
            minHour = Math.min(minHour, currentHour);
            currentHour = 0;
            i++;
        }

        return (int) i-1;
    }
}
