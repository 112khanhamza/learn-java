package com.dsa.searching;

public class SmallestLetter {

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j', 'k'};
        char target = 'c';
        System.out.println(nextGreatestLetter2(letters, target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        char possibleAns = target;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] > target) {
                possibleAns = letters[mid];
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return possibleAns == target ? letters[0] : possibleAns;
    }

    public static char nextGreatestLetter2(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
