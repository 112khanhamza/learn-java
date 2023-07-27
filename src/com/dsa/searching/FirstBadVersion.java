package com.dsa.searching;

// https://leetcode.com/problems/first-bad-version/
public class FirstBadVersion {

    public static void main(String[] args) {
        System.out.println(firstBadVersion(1));
    }

    public static int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int mid = -1;
        int potentialAns = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (VersionControl.isBadVersion(mid)) {
                potentialAns = mid;
                end = mid - 1;
            }
            else start = mid + 1;
        }
        return potentialAns;
    }

    private static class VersionControl {
        private static int BAD_VERSION = 1;
        public static boolean isBadVersion(int n) {
            if (n >= BAD_VERSION) return true;
            return false;
        }
    }
}
