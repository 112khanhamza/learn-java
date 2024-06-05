package com.dsa.arrays;

public class OddValuesInMatrix {
    public static void main(String[] args) {

    }

    static int oddCells(int m, int n, int[][] indices) {
        int[][] res = new int[m][n];
        for (int i=0; i<indices.length; i++) {
            for (int j = 0; j < indices[i].length; j++) {
                if (j==0) incrementMatrixByOne(res, indices[i][j], true);
                else incrementMatrixByOne(res, indices[i][j], false);
            }
        }
        int oddValues = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (res[i][j] % 2 != 0) oddValues++;
            }
        }

        return oddValues;
    }

    static void incrementMatrixByOne(int[][] mat, int index, boolean isRow) {
        if (isRow) {
            for(int i=0; i<mat[index].length; i++) {
                mat[index][i] += 1;
            }
        } else {
            for(int i=0; i<mat.length; i++) {
                mat[i][index] += 1;
            }
        }
    }

    // Optimised
    static int oddCells2(int m, int n, int[][] indices) {
        int[] rows = new int[m];
        int[] cols = new int[n];

        for (int[] a : indices) {
            rows[a[0]]++;
            cols[a[1]]++;
        }

        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((rows[i] + cols[j]) % 2 != 0) res++;
            }
        }
        return res;
    }
}
