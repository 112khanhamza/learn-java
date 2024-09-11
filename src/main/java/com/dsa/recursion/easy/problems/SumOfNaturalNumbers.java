package com.dsa.recursion.easy.problems;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        System.out.println(sum(6));
    }

    static int sum(int n) {
        if (n == 1) return n;
        return n + sum(n-1);
    }
}