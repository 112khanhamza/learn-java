package com.dsa.searching;

// https://leetcode.com/problems/guess-number-higher-or-lower/
public class GuessGame {

    public static void main(String[] args) {
        System.out.println(guessNumber(2));
    }

    public static int guessNumber(int n) {
        int start = 0;
        int end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (Guess.guess(mid) == -1) end = mid - 1;
            else if (Guess.guess(mid) == 1) start = mid + 1;
            else return mid;
        }
        return end;
    }

    private static class Guess {
        private static final int N = 2;
        static int guess(int pick) {
            if (pick > N) return -1;
            if (pick < N) return 1;
            else return 0;
        }
    }
}
