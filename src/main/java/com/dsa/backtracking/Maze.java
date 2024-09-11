package com.dsa.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Maze {

    public static void main(String[] args) {
//        final List<String> list = pathRetDiagonal("", 3, 3);
//        System.out.println(list);

        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        int[][] path = new int[board.length][board[0].length];
        allPathPrint("", board, 0, 0, path, 1);

//        final List<String> list = pathWithRestrictions("", board, 0, 0);
//        System.out.println(list);
    }

    public static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            path(p + 'D', r-1, c);
        }

        if (c > 1) {
            path(p + 'R', r, c-1);
        }
    }

    public static List<String> pathRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> list = new ArrayList<>();

        if (r > 1) {
            list.addAll(pathRet(p + 'D', r-1, c));
        }

        if (c > 1) {
            list.addAll(pathRet(p + 'R', r, c-1));
        }

        return list;
    }

    public static List<String> pathRetDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> list = new ArrayList<>();

        // down
        if (r > 1) {
            list.addAll(pathRetDiagonal(p + 'D', r-1, c));
        }

        // diagonal
        if (r > 1 && c > 1) {
            list.addAll(pathRetDiagonal(p + 'X', r-1, c-1));
        }

        // right
        if (c > 1) {
            list.addAll(pathRetDiagonal(p + 'R', r, c-1));
        }

        return list;
    }

    public static List<String> pathWithRestrictions(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length-1 && c == maze[0].length-1) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> list = new ArrayList<>();

        // check for obstacle
        if (!maze[r][c]) {
            return list;
        }

        // down
        if (r < maze.length-1) {
            list.addAll(pathWithRestrictions(p + 'D', maze, r+1, c));
        }

        // right
        if (c < maze[0].length-1) {
            list.addAll(pathWithRestrictions(p + 'R', maze, r, c+1));
        }

        return list;
    }

    public static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length-1 && c == maze[0].length-1) {
            path[r][c] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            return;
        }

        // check for obstacle
        if (!maze[r][c]) {
            return;
        }

        // I am considering this as block in my path
        maze[r][c] = false;
        path[r][c] = step;

        // down
        if (r < maze.length-1) {
            allPathPrint(p + 'D', maze, r+1, c, path, step+1);
        }

        // right
        if (c < maze[0].length-1) {
            allPathPrint(p + 'R', maze, r, c+1, path, step+1);
        }

        // up
        if (r > 0) {
            allPathPrint(p + 'U', maze, r-1, c, path, step+1);
        }

        // left
        if (c > 0) {
            allPathPrint(p + 'L', maze, r, c-1, path, step+1);
        }

        // this is line where all the functions will get over
        // so, before function gets removed, remove all the changes that were made by the function
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
