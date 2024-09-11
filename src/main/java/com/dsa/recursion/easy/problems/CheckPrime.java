package com.dsa.recursion.easy.problems;

public class CheckPrime {

    public static void main(String[] args) {
        System.out.println(isPrime(17, 2));
    }

    static boolean isPrime(int n, int i) {
        if (n <= 2) return n == 2;
        if (n % i == 0) return false;
        if (i > n/2) return true;

        return isPrime(n, i+1);
    }
}
