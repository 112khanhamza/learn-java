package com.dsa.recursion.striver.subsequence;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        int n = arr.length;
        print(arr, n, 0, new ArrayList<>());
    }

    static void print(int[] arr, int n, int index, List<Integer> res) {
        if (index >= n) {
            System.out.println(res);
            return;
        }

        // take or pick a particular index into the subsequence
        res.add(arr[index]);
        print(arr, n, index+1, res);

        // not pick, or not take condition, this element will not be added to the subsequence
        res.remove(res.get(res.size()-1));
        print(arr, n, index+1, res);
    }
}
