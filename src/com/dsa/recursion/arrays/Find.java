package com.dsa.recursion.arrays;

import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 18, 18, 9};
        int target = 18;
//        System.out.println(find(arr, target, 0));
//        System.out.println(findIndex(arr, target, 0));
//        System.out.println(findIndexFromLast(arr, target, arr.length-1));
//        findAllIndex(arr, target, 0);
//        System.out.println(list);
//
//        ArrayList<Integer> ans = findAllIndex(arr, target, 0, new ArrayList<>());
//        System.out.println(ans);

        ArrayList<Integer> ans2 = findAllIndex2(arr, target, 0);
        System.out.println(ans2);
    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }

        return arr[index] == target || find(arr, target, index+1);
    }

    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) return index;

        return findIndex(arr, target, index+1);
    }

    static int findIndexFromLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) return index;

        return findIndexFromLast(arr, target, index-1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) list.add(index);

        findAllIndex(arr, target, index+1);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) list.add(index);

        return findAllIndex(arr, target, index+1, list);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }
        // this will contain answer for that function call only
        if (arr[index] == target) list.add(index);

        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index+1);

        list.addAll(ansFromBelowCalls);
        return list;
    }
}
