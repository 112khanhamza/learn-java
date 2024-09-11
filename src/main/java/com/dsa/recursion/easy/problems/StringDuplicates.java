package com.dsa.recursion.easy.problems;

public class StringDuplicates {

    public static void main(String[] args) {

        String str = "aaaabbbbccc";
        System.out.println(removeDuplicatesRecur(str));
    }

    private static String removeDuplicates(String str) {
        int i = 0, j = 0;
        StringBuilder result = new StringBuilder();

        while (j < str.length()) {
            // if both are equal then check next
            if (str.charAt(i) == str.charAt(j)) j++;

            // if both are not same then append to result
            else if (str.charAt(i) != str.charAt(j) || j == str.length()-1) {
                result.append(str.charAt(i));

                // after appending, slide over the window
                i = j;
                j++;
            }
        }

        return result.toString();
    }

    private static String removeDuplicatesRecur(String str) {
        // aabbcc -> abc
        if (str.length() <= 1) return str;
        if (str.charAt(0) == str.charAt(1)) {
            return removeDuplicatesRecur(str.substring(1));
        } else {
            return str.charAt(0) + removeDuplicatesRecur(str.substring(1));
        }
    }
}
