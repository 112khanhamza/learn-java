package com.dsa.strings;

public class Comparison {
    public static void main(String[] args) {
        String a = "Hamza";
        String b = "Hamza";

        System.out.println(a == b); // checks if reference variable is pointing to the same object

        // How to create diff objects of the same value

        String x = "Hamza";
        String y = new String("Hamza");
        String z = y;
        System.out.println(y == z);
    }
}
