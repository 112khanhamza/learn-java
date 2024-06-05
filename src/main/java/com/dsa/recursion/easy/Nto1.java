package com.dsa.recursion.easy;

public class Nto1 {
    public static void main(String[] args) {
        funBoth(5);
    }

    // print numbers from n to 1
    static void fun(int n) {
        if (n == 0) {
            System.out.println(n);
            return;
        }
        fun(n-1);
    }

    // print numbers from 1 to n
    static void funRev(int n) {
        if (n == 0) {
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }

    // print numbers from n to 1 then 1 to n
    static void funBoth(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }
}
