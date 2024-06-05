package com.dsa.recursion;

import java.util.Arrays;

public class InterviewQuestions {

    public static void main(String[] args) {
        char[] s = {'h', 'a', 'm', 'z', 'a'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    public static void reverseString(char[] s) {
        helper(s, 0, s.length-1);
    }

    private static void helper(char[] arr, int start, int end) {
        if (start > end) return;
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        helper(arr, start+1, end-1);
    }
}
