package com.dsa.recursion.easy.problems;

public class PowerOfTwo {

    public static void main(String[] args) {
        int n = 16777217;
        System.out.println(isPowerOfTwo(n));
    }

    static boolean isPowerOfTwo(int n) {
        // Base case 1 is a power of 2: 2^0 == 1
        if (n == 1) return true;

        // If n is less than 1 or is odd it cannot be a power of 2
        if (n < 1 || n % 2 != 0) return false;
        return isPowerOfTwo(n/2);
    }
}