package com.dsa.recursion.easy.problems;

import java.util.Scanner;

public class SpecialFibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        // Create an array or list to hold the test cases if needed
        int[][] testCases = new int[T][3];

        // Loop through the test cases
        for (int i = 0; i < T; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            // Store the test case
            testCases[i][0] = a;
            testCases[i][1] = b;
            testCases[i][2] = n;
        }

        for (int[] test : testCases) {
            int a = test[0];
            int b = test[1];
            int n = test[2];
            System.out.println(fibo(a, b, n));
        }

        // Close the scanner
        scanner.close();
    }

    public static int fibo(int a, int b, int n) {
        if (n == 0) return a;
        if (n == 1) return b;
        return fibo(a, b, n-1) ^ fibo(a, b, n-2);
    }
}
