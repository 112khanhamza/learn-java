package com.dsa.recursion.easy.problems;

public class FirstUpperCaseLetter {

    public static void main(String[] args) {
        String str = "geeksfoRgeeks";
//        System.out.println((int)str.charAt(0));
        System.out.println(firstUpperCaseLetter(str, 0));
    }

    static char firstUpperCaseLetter(String str, int index) {
        if (str.length() == index) return '!';
        return (int)str.charAt(index) >= 65 && (int)str.charAt(index) <= 90 ?
                str.charAt(index) :
                firstUpperCaseLetter(str, index+1);
    }
}
