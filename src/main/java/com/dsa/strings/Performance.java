package com.dsa.strings;

public class Performance {

    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series = series + ch; // series += ch
        }
        System.out.println(series); // this is slow

        // using StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            sb.append(ch);
        }
        System.out.println(sb.toString()); // this is fast
    }
}
