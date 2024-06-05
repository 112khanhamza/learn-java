package com.dsa.recursion.easy.problems;

public class ReverseString {

    public static void main(String[] args) {
        char[] s = {'h','e','l','p','o','z'};
        reverseString(s);
        System.out.println(s);
    }

    public static void reverseString(char[] s) {
        helper(s, 0, s.length-1);
    }

    static void helper(char[] s, int start, int end) {
        if (start <= end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            helper(s, start+1, end-1);
        }

    }
}
