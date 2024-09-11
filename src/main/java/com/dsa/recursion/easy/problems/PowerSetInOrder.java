package com.dsa.recursion.easy.problems;

import java.util.Arrays;

public class PowerSetInOrder {

    public static void main(String[] args) {
        String s = "abc";
        powerSet(s);
    }

    public static void permuteRec(String str, int n, int index, String curr) {
        if (index == n) {
            return;
        }
        System.out.println(curr);
        for(int i = index+1; i<n; i++) {
            curr += str.charAt(i);
            permuteRec(str, n, i, curr);
            curr = curr.substring(0, curr.length()-1);
        }
    }

    public static void powerSet(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        permuteRec(new String(charArray), charArray.length, -1, "");
    }
}
