package com.dsa.searching;

// https://leetcode.com/problems/sqrtx/
public class SquareRoot {

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }

    public static int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int start = 1;
        int end = x;
        int mid = -1;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (mid * mid == x) return mid;
            else if ((long)mid * mid > (long)x) end = mid - 1;
            else start = mid + 1;
        }

        return end;
    }
}
