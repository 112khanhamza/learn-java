package com.dsa.recursion.easy.problems;

public class PowerOf2 {

    public static void main(String[] args) {
        int n = 1073741825;
        System.out.println(isPowerOf2(n));
    }

    static boolean isPowerOf2(int n) {
        return helper(n, 2, 2);
    }

    static boolean helper(int n, int check, int power) {
        if (check == n) return true;
        if (check > n) return false;
        return helper(n, check*power, power);
    }
}
