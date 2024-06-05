package com.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/set-matrix-zeroes/
public class SetMatrixZero {

    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        setZeroes3(matrix);
        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void setZeroes3(int[][] matrix) {
        int col0 = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    // mark the i-th row
                    matrix[i][0] = 0;
                    // mark the j-th col
                    if (j != 0)
                        matrix[0][j] = 0;
                    else
                        col0 = 1;
                }
            }
        }

        for(int i = 1; i< matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0) {
                    // check for col and row
                    if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        if (matrix[0][0] == 0) {
            for (int i = 0; i < matrix[0].length; i++)  matrix[0][i] = 0;
        }

        if (col0 == 0) {
            for(int i = 0; i < matrix.length; i++) matrix[i][0] = 0;
        }
    }

    public static void setZeroes2(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    markRow(i, matrix);
                    markCol(j, matrix);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private static void markCol(int col, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][col] != 0) {
                matrix[i][col] = -1;
            }
        }
    }

    private static void markRow(int row, int[][] matrix) {
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[row][j] != 0) {
                matrix[row][j] = -1;
            }
        }
    }

    public static void setZeroes(int[][] matrix) {
        List<List<Integer>> zeroPositions = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    zeroPositions.add(Arrays.asList(i, j));
                }
            }
        }

        for (List<Integer> pos : zeroPositions) {
            setRowAndColToZero(pos, matrix);
        }
    }

    private static void setRowAndColToZero(List<Integer> pos, int[][] matrix) {
        // set row to zero
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[pos.get(0)][i] = 0;
        }

        // set col to zero
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][pos.get(1)] = 0;
        }
    }

}
