package com.dsa.backtracking;

public class OneToN {

    public static void main(String[] args) {
        printRev(1, 3);
    }

    public static void printRev(int i, int n) {
        if (i > n) return;
        printRev(i+1, n);
        System.out.println(i);
    }

    public static void print(int i) {
        if (i < 1) return;
        print(i-1);
        System.out.println(i);
    }
}
