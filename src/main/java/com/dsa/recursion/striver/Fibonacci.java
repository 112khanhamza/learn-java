package com.dsa.recursion.striver;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(fibo(n));
    }

    static int fibo(int n) {
        // base
        if (n <= 1) return n;
        return fibo(n-1) + fibo(n-2);
    }
}
