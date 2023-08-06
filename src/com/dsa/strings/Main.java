package com.dsa.strings;

public class Main {

    public static void main(String[] args) {

        // Concept of StringPool
        String name = "Hamza";
        String n = "Hamza";

        System.out.println(name.hashCode());
        System.out.println(n.hashCode());

        name = name + "k";

        System.out.println("Modified name: " + name.hashCode());

    }
}
