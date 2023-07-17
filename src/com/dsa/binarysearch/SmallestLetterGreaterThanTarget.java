package com.dsa.binarysearch;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        char[] letters1 = {'x','x','y','y'};
        char target1 = 'z';
        System.out.println(nextGreatestLetter(letters1, target1 ));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length-1;
        int mid;

        while (low <= high) {
            mid = low + (high-low) / 2;
            if (target < letters[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return letters[low % letters.length];
    }
}
