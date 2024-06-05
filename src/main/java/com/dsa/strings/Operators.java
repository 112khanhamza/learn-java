package com.dsa.strings;

import java.util.ArrayList;

public class Operators {

    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b"); // this is known as operator overloading
        // in Java operator overloading is not supported because of software engineering considerations
        // only String concatenation is supported by java for the plus operator by default

        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));
        System.out.println("a" + 3); // when an int is concatenated with a String it is
        // converted into it's wrapper class Integer, that will call toString()
        // this is the same as after a few steps "a" + "1"

        System.out.println("Hamza" + new ArrayList<>());
        System.out.println("Hamza" + new Integer(56));

//        System.out.println(new Integer(56) + new ArrayList<>()); // the operator + in Java you can
        // only use with primitives or complex objects with one condition that at least one of the
        // objects should be of the type String

        System.out.println(new Integer(56) + "" + new ArrayList<>());

//        System.out.println(new Node() + new Mass()); // not applicable
    }

    public static class Node {
        private int value;

        Node() {

        }
    }

    public static class Mass {
        private int value;

        Mass() {

        }
    }
}
