package com.dsa.recursion.easy.problems;

public class LengthOfString {

    public static void main(String[] args) {
        System.out.println(lengthOfString2("abcd"));
    }

    public static int lengthOfString(String str, int count) {
        try {
            str.charAt(count);
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
        return lengthOfString(str, count+1);
    }

    public static int lengthOfString2(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        return lengthOfString2(str.substring(1)) + 1;
    }
}
