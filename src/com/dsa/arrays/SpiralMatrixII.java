package com.dsa.arrays;

import java.util.Arrays;

public class SpiralMatrixII {

    public static void main(String[] args) {
        int n = 4;
        int[][] result = generateMatrix(n);
        for (int[] list : result) {
            System.out.println(Arrays.toString(list));
        }
    }

    public static int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int size = n*n;
        int counter = 1;
        int rs, cs, re, ce;
        rs = cs = 0;
        re = ce = n-1;

        while (counter <= size) {
            // Iteration 1
            for (int i = cs; i <= ce && counter <= size; i++) {
                result[rs][i] = counter;
                counter++;
            }
            rs++;

            // Iteration 2
            for (int i = rs; i <= re && counter <= size; i++) {
                result[i][ce] = counter;
                counter++;
            }
            ce--;

            // Iteration 3
            for (int i = ce; i >= cs && counter <= size; i--) {
                result[re][i] = counter;
                counter++;
            }
            re--;

            // Iteration 4
            for (int i = re; i >= rs && counter <= size; i--) {
                result[i][cs] = counter;
                counter++;
            }
            cs++;
        }
        return result;
    }
}
