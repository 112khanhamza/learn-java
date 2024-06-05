package com.dsa.recursion.easy;

public class DigitProduct {
    public static void main(String[] args) {
        int ans = prodOfDigits(1324);
        System.out.println(ans);
    }

    static int prodOfDigits(int n) {
        if (n % 10 == n) {
            return n;
        }
        return (n%10) * prodOfDigits(n/10);
    }
}
