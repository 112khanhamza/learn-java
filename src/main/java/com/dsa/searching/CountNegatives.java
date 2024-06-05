package com.dsa.searching;

public class CountNegatives {

    public static void main(String[] args) {
        int[][] grid = {
                {3,-1,-3,-3,-3},
                {2,-2,-3,-3,-3},
                {1,-2,-3,-3,-3},
                {0,-3,-3,-3,-3}};
        System.out.println(countNegatives(grid));
    }

    public static int countNegatives(int[][] grid) {
        int negativeNumbers = 0;
        for (int i=0; i<grid.length; i++) {
            negativeNumbers += countNegativesInArray(grid[i]);
        }
        return negativeNumbers;
    }

    private static int countNegativesInArray(int[] arr) {
        if (arr[0] < 0) return arr.length;
        int s = 0;
        int e = arr.length - 1;
        int possibleAns = 0;
        while (s <= e) {
            int m = s + (e-s) / 2;
            if (arr[m] < 0) {
                possibleAns = arr.length - m;
                e = m - 1;
            }
            else s = m + 1;
        }
        return possibleAns;
    }
}
