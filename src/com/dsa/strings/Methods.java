package com.dsa.strings;

import java.util.Arrays;

public class Methods {

    public static void main(String[] args) {
        String name = "Hamza Khan";
        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(name.indexOf('a'));

        System.out.println(name.lastIndexOf('a'));

        System.out.println("    Hamza   Khan   ".trim());

        System.out.println(Arrays.toString(name.split(" ")));
    }
}
