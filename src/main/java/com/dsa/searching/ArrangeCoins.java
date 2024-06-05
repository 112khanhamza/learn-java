package com.dsa.searching;

// https://leetcode.com/problems/arranging-coins/description/
public class ArrangeCoins {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(arrangeCoins(n));
    }

    public static int arrangeCoins(int n) {
        int left = 1;
        int right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int coins = mid * (mid + 1) / 2;
            if (coins == n) return mid;
            else if (coins > n) right = mid - 1;
            else left = mid + 1;
        }
        return right;
    }
}
