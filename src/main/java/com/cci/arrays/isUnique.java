package com.cci.arrays;

import java.util.HashMap;
import java.util.Map;

// Is Unique: Implement an algorithm to determine if a string has all unique characters.
// What if you cannot use additional data structures?
public class isUnique {
    public static void main(String[] args) {
        System.out.println(isUnique("HAMZA"));
    }

    // hamza -> false
    public static boolean isUnique(String str) {
        str = str.toLowerCase();
        boolean[] unique = new boolean[27];
        for(char ch : str.toCharArray()) {
            int index = ch - 97;
            if (unique[index]) {
                return false;
            } else {
                unique[index] = true;
            }
        }
        return true;
    }
}

