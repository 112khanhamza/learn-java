package com.dsa.arrays.practice;

import java.util.Arrays;

public class InterviewQuestions {
    public static void main(String[] args) {
        int[] res = sumZero(5);
        System.out.println(Arrays.toString(res));
    }

    // https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
    public int oddCells(int m, int n, int[][] indices) {
        int[] rows = new int[m];
        int[] cols = new int[n];
        for (int[] a : indices) {
            rows[a[0]]++;
            cols[a[1]]++;
        }
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rows[i] + cols[j] % 2 != 0) res++;
            }
        }
        return res;
    }

    private void incrementRow(int i) {
    }

    // https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
    public static int minCostToMoveChips(int[] position) {
        return -1;
    }

    // https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
    public static int[] sumZero(int n) {
        if (n == 1) {
            return new int[] {0};
        }

        int[] res = new int[n];
        int length = n;
        int i = 0;
        int c = 1;
        if (isEven(n)) {
            while (n != 0) {
                res[i] = c;
                res[i+1] = -c;
                n = n - 2;
                i = i + 2;
                c++;
            }
        } else {
            while (n != 1) {
                res[i] = c;
                res[i+1] = -c;
                n = n - 2;
                i = i + 2;
                c++;
            }
            res[length-1] = 0;
        }

        return res;
    }

    private static boolean isEven(int n) {
        if (n % 2 == 0) return true;
        return false;
    }

    // https://leetcode.com/problems/plus-one/
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >=0 ; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length+1];
        result[0] = 1;
        return result;
    }

    // https://leetcode.com/problems/check-if-the-sentence-is-pangram/
    public static boolean checkIfPangram(String str) {
        for (char c = 'a'; c <= 'z'; c++) {
            if (!str.contains(String.valueOf(c))) return false;
        }
        return true;
    }


}
