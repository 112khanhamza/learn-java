package com.dsa.recursion.easy.problems;

public class SumOfDigits {

    public static void main(String[] args) {
        int n = 1234;
        int ans = 0;
        int res = sumOfDigits(n);
        System.out.println(res);
    }

    static int sumOfDigits(int n, int ans) {
        if (n/10 == 0) {
            ans += n;
            return ans;
        }
        int r = n % 10;
        ans += r;
        return sumOfDigits(n/10, ans);
    }

    static int sumOfDigits(int n) {
        if (n < 10) return n;
        int r = n % 10;
        return r + sumOfDigits(n/10);
    }
}
