package com.dsa.recursion.subset;

public class BasicQuestion {
    public static void main(String[] args) {
//        String s = "baccad";
//        skip(s, "");
//        System.out.println(skip(s));

//        String s2 = "bdapplegh";
//        System.out.println(skipApple(s2));

        String s3 = "bdappegh";
        System.out.println(skipAppNotApple(s3));
    }

    static String removeA(String str, int index, String ans) {
        if (index == str.length()) return ans;
        if (str.charAt(index) == 'a') return removeA(str, index+1, ans);
        return removeA(str, index+1, ans+str.charAt(index));
    }

    static void skip(String str, String ans) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        if (ch == 'a') {
            skip(str.substring(1), ans);
        } else {
            skip(str.substring(1), ans + ch);
        }

    }

    static String skip(String str) {
        if (str.isEmpty()) {
            return "";
        }

        char ch = str.charAt(0);
        if (ch == 'a') {
            return skip(str.substring(1));
        } else {
            return ch + skip(str.substring(1));
        }

    }

    static String skipApple(String str) {
        if (str.isEmpty()) {
            return "";
        }

        if (str.startsWith("apple")) {
            return skipApple(str.substring(5));
        } else {
            return str.charAt(0) + skipApple(str.substring(1));
        }
    }

    static String skipAppNotApple(String str) {
        if (str.isEmpty()) {
            return "";
        }

        if (str.startsWith("app") && !str.startsWith("apple")) {
            return skipAppNotApple(str.substring(3));
        } else {
            return str.charAt(0) + skipAppNotApple(str.substring(1));
        }
    }

    static String skipWord(String str, String word) {
        if (str.isEmpty()) {
            return "";
        }

        if (str.startsWith(word)) {
            return skipWord(str.substring(word.length()), word);
        } else {
            return str.charAt(0) + skipWord(str.substring(1), word);
        }
    }
}
