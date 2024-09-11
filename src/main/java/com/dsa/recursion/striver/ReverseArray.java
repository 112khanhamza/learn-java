package com.dsa.recursion.striver;

import java.util.Arrays;

import static com.dsa.sorting.practice.BubbleSort.swap;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4};
        rev(arr, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void rev(int[] arr, int i) {
        if (i >= arr.length/2) {
            return;
        }
        swap(arr, i, arr.length-i-1);
        rev(arr, i+1);
    }
}
