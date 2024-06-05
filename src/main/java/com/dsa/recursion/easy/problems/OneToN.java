package com.dsa.recursion.easy.problems;

public class OneToN {

    public static void main(String[] args) {
        print(10);
    }

    static void print(int n) {
        if (n < 1) {
            return;
        }
        print(n-1);
        System.out.printf("%d ", n);
    }
}
