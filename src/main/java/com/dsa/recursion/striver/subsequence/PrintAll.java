package com.dsa.recursion.striver.subsequence;

import java.util.ArrayList;
import java.util.List;

public class PrintAll {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int n = 3;
        int sum = 2;
        List<Integer> ds = new ArrayList<>();
        printAll(0, ds, 0, sum, arr, n);
    }

    private static void printAll(int ind, List<Integer> ds, int s, int sum, int[] arr, int n) {
        // base
        if (ind == n) {
            if (s == sum) {
                print(ds);
            }
        }

        // pick
        ds.add(arr[ind]);
        s += arr[ind];
        printAll(ind+1, ds, s, sum, arr, n);

        // not pick
        ds.remove(ds.size()-1);
        s -= arr[ind];
        printAll(ind+1, ds, s, sum, arr, n);
    }

    private static void print(List<Integer> list) {
        for (int i : list) System.out.print(i + " ");
        System.out.print("\n");
    }

}
