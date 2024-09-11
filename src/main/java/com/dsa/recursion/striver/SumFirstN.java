package com.dsa.recursion.striver;

public class SumFirstN {

    public static void main(String[] args) {
//        final int ans = sum(3, 0);
//        System.out.println(ans);

        final int ans = fact(4);
        System.out.println(ans);
    }

    // parameterised
    static int sum(int n, int sum) {
        if (n == 0) return sum;
        return sum(n-1, sum+n);
    }

    // functional
    static int sum(int n) {
        if (n < 1) return 0;
        return n + sum(n-1);
    }

    static int fact(int n) {
        if (n < 1) return 1;
        return n * fact(n-1);
    }

}
