package com.dsa.strings;

public class Palindrome {

    public static void main(String[] args) {
        String s = null;
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(s));
    }

    // function to check if a String is palindrome or not
    public boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        str = str.toLowerCase();
        char[] charSet = str.toCharArray();
        // ['c', 'a', 'c']
        int left = 0;
        int right = charSet.length - 1;
        while (left <= right) {
            if (charSet[left] != charSet[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean isPalindrome2(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if (start !=  end) {
                return false;
            }
        }
        return true;
    }
}
