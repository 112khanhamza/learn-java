package com.dsa.sorting.practice;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length-i-1;
            int maxIndex = getMaxIndex(arr, 0, lastIndex);
            swap(arr, lastIndex, maxIndex);
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = 0;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}
