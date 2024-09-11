package com.dsa.recursion.easy.problems;

public class ProductOfTwoNumbers {

    public static void main(String[] args) {
        System.out.println(productRec(3, 5));
    }

    static int product(int a, int b) {
        if (a > b) return helper(a, b, 0);
        else return helper(b, a, 0);
    }

    static int helper(int multiplicand, int multiplicator, int currentSum) {
        if (multiplicator == 0) return currentSum;
        return helper(multiplicand, --multiplicator, multiplicand+currentSum);
    }

    static int productRec(int a, int b) {
        if (a < b) return productRec(b, a);
        else if (b != 0) return a + productRec(a, --b);
        else return 0;
    }
}
