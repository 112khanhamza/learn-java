package com.dsa.arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        spiralOrder(mat);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int resultSize = matrix.length * matrix[0].length;

        int rowStart = 0;
        int rowEnd = matrix.length - 1;

        int colStart = 0;
        int colEnd = matrix[0].length - 1;

        while (result.size() < resultSize) {
            // Iteration 1
            for (int i=colStart; i<=colEnd && result.size() < resultSize; i++) {
                result.add(matrix[rowStart][i]);
            }
            rowStart++;

            // Iteration 2
            for (int i=rowStart; i<=rowEnd && result.size() < resultSize; i++) {
                result.add(matrix[i][colEnd]);
            }
            colEnd--;

            // Iteration 3
            for (int i=colEnd; i>=colStart && result.size() < resultSize; i--) {
                result.add(matrix[rowEnd][i]);
            }
            rowEnd--;

            // Iteration 4
            for (int i=rowEnd; i>=rowStart && result.size() < resultSize; i--) {
                result.add(matrix[i][colStart]);
            }
            colStart++;
        }
        return result;
    }
}
