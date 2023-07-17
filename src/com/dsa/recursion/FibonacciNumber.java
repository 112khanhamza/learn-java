package com.dsa.recursion;

public class FibonacciNumber {

    public static void main(String[] args) {
        int n = 4;
        FibonacciNumber fibonacciNumber = new FibonacciNumber();
        System.out.println(fibonacciNumber.fibonacci(n));
    }

    public int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
