package com.dsa.recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class PhonePadProblem {

    public static void main(String[] args) {
        padRet("", "12");
    }

    static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit-1) * 3; i < digit*3; i++) {
            char ch = (char) ('a' + i);
            pad(p + ch, up.substring(1));
        }
    }

    static List<String> padRet(String p, String up) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0'; // this will convert '2' to 2

        List<String> list = new ArrayList<>();

        for (int i = (digit-1) * 3; i < digit*3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(padRet(p + ch, up.substring(1)));
        }

        return list;
    }
}
