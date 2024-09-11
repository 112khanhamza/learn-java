package com.dsa.recursion.easy.problems;

import java.util.ArrayList;
import java.util.List;

public class PalindromicPartitions {

    public static void main(String[] args) {

        String s = "nitin";
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        ArrayList<String> curr = new ArrayList<>();
        partitions(s, 0, res, curr);
        System.out.println(res);
    }

    public static void partitions(String s,
                                  int index,
                                  ArrayList<ArrayList<String>> res,
                                  ArrayList<String> curr) {

        if (index == s.length()) {
            res.add(new ArrayList<>(curr));
            return;
        }

        String temp = "";

        for(int i = index; i<s.length(); i++) {
            temp += s.charAt(i);

            // check if temp is palindrome or not
            if (isPalindrome(temp)) {

                // add string to current list
                curr.add(temp);

                // recursively call the remaining string
                partitions(s, i+1, res, curr);

                // remove the string from the current list (backtracking)
                curr.remove(curr.size()-1);
            }
        }
    }

    public static boolean isPalindrome(String str) {
        int s = 0;
        int e = str.length()-1;

        while (s < e) {
            if (str.charAt(s) != str.charAt(e)) {
                return false;
            }
            s++;
            e--;
        }

        return true;
    }
}
