package com.dsa.recursion.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5};
        selectionSort(arr, 0, arr.length, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr, int start, int end, int max) {
        if (end == 0) return;
        if (start < end) {
            if (arr[start] > arr[max]) {
                selectionSort(arr, start+1, end, start);
            } else {
                selectionSort(arr, start+1, end, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[end-1];
            arr[end-1] = temp;

            selectionSort(arr, 0, end-1, 0);
        }
    }
}
