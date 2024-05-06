package com.dsa.recursion.easy.problems;

public class ReverseString {

    public static void main(String[] args) {
        char[] s = {'h','e','l','p','o','z'};
        reverseString(s);
        System.out.println(s);
    }

    public static void reverseString(char[] s) {
        helper(s, 0);
    }

    static void helper(char[] s, int index) {
        if (s.length % 2 == 0) {
            if ((s.length)/2 == index) return;
        } else {
            if ((s.length - 1)/2 == index) return;
        }
        int lastIndex = s.length - 1 - index;
        char temp = s[index];
        s[index] = s[lastIndex];
        s[lastIndex] = temp;
        helper(s, index+1);
    }
}
