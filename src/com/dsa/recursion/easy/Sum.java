package com.dsa.recursion.easy;

public class Sum {
    public static void main(String[] args) {
        System.out.println(sum(1324));
    }

    static int sum(int n) {
        if (n <= 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
}
