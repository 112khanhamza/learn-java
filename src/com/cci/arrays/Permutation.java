package com.cci.arrays;

import java.util.Arrays;

public class Permutation {

    public static void main(String[] args) {
        String s1 = "god ";
        String s2 = "dog";
        System.out.println(checkPermutation(s1,s2));
    }

    static boolean checkPermutation(String s1, String s2) {
        if (s1.trim().length() != s2.trim().length()) return false;
        return sort(s1.trim()).equals(sort(s2.trim()));
    }

    static String sort(String s) {
        System.out.println(s);
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
}
