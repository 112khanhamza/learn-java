package com.dsa.recursion.easy;

public class DigitSum {
    public static void main(String[] args) {
        int ans = sumOfDigits(1324);
        System.out.println(ans);
    }

    static int sumOfDigits(int n) {
        if (n == 0) return 0;
        int r = n % 10;
        n = n / 10;
        return r + sumOfDigits(n);
    }
}
