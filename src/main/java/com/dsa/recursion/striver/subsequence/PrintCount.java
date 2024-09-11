package com.dsa.recursion.striver.subsequence;

import java.util.ArrayList;
import java.util.List;

public class PrintCount {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int n = 3;
        int sum = 2;
        final int res = printCount(0, 0, sum, arr, n);
        System.out.println(res);
    }

    private static int printCount(int ind, int s, int sum, int[] arr, int n) {
        // condition not satisfied
        // if array contains +ve only
        if (s > sum) return 0;

        // base
        if (ind == n) {
            if (s == sum) {
                return 1;
            } else return 0;
        }

        // pick
        s += arr[ind];
        final int left = printCount(ind + 1, s, sum, arr, n);

        // not pick
        s -= arr[ind];
        final int right = printCount(ind + 1, s, sum, arr, n);

        return left + right;
    }

    private static void print(List<Integer> list) {
        for (int i : list) System.out.print(i + " ");
        System.out.print("\n");
    }

}
