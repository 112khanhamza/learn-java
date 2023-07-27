package com.dsa.binarysearch.matrix;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[][] mat = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}};

        int[][] matSorted = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        int target = 6;
        System.out.println(Arrays.toString(search(mat, target)));
        System.out.println(Arrays.toString(searchSorted(matSorted, target)));
    }

    public static int[] search(int[][] mat, int target) {
        int r = 0;
        int c = mat.length-1;

        while (r < mat.length && c >= 0) {
            if (mat[r][c] == target) return new int[]{r, c};
            if (mat[r][c] < target) r++;
            if (mat[r][c] > target) c--;
        }
        return new int[]{-1, -1};
    }

    public static int[] searchSorted(int[][] mat, int target) {
        int rows = mat.length;
        int cols = mat[0].length; // be cautious matrix may be empty
        if (rows == 1) {
            return binarySearch(mat, 0, 0, cols-1, target);
        }
        int rStart = 0;
        int rEnd = mat.length-1;
        int cMid = cols / 2;
        // run the loop till 2 rows are remaining
        while (rStart < (rEnd-1)) { // while this is true it will have more than 2 rows
            int rMid = rStart + (rEnd - rStart) / 2;
            if (mat[rMid][cMid] == target) return new int[]{rMid, cMid};
            else if (mat[rMid][cMid] < target) rStart = rMid;
            else rEnd = rMid;
        }

        // now we have 2 rows
        // check weather the target is in the col of 2 rows
        if (mat[rStart][cMid] == target) return new int[]{rStart, cMid};
        if (mat[rStart+1][cMid] == target) return new int[]{rStart+1, cMid};

        // search in 1st half
        if (target <= mat[rStart][cMid-1]) {
            return binarySearch(mat, rStart, 0, cMid-1, target);
        }
        // search in 2nd half
        if (target >= mat[rStart][cMid+1] && target <= mat[rStart][cols-1]) {
            return binarySearch(mat, rStart, cMid+1, cols-1, target);
        }
        // search in 3rd half
        if (target <= mat[rStart+1][cMid-1]) {
            return binarySearch(mat, rStart+1, 0, cMid-1, target);
        }
        // search in 4th half
        else return binarySearch(mat, rStart+1, cMid+1, cols-1, target);

    }

    // search in the row provided b/t the col provided
    private static int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target) {
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;
            if (matrix[row][mid] == target) return new int[]{row, mid};
            else if (matrix[row][mid] < target) colStart = mid + 1;
            else colEnd = mid - 1;
        }
        return new int[]{-1, -1};
    }
}
