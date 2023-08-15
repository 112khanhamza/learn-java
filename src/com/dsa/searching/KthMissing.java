package com.dsa.searching;

import java.util.Arrays;

public class KthMissing {

    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7};
        int k = 2;
        System.out.println(findKthPositive(arr, k));
    }

    public static int findKthPositive(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= k)
                k++;
            else
                break;
        }
        return k;
    }

    public static int findKthPositiveOpt(int[] arr, int k) {
        return -1;
    }
}
