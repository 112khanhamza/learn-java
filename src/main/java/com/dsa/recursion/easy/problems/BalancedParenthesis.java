package com.dsa.recursion.easy.problems;

import java.util.Arrays;

class BalancedParenthesis {

    public static void main(String[] args) {
        String exp = "[()]{}{[()()]()}";
        String exp1 = "((()))";
        System.out.println(validParenthesis(exp1));
    }

    private static boolean validParenthesis(String exp) {
        return checkParenthesis(exp.toCharArray(), exp.length());
    }

    private static boolean checkParenthesis(char[] expr, int length) {
        if (length == 1) return false;
        if (length == 0) return true;
        char firstChar = expr[0];

        // the first character should not be a closing bracket
        if (firstChar == '}' || firstChar == ']' || firstChar == ')') return false;

        // find the closing bracket
        char closing = findClosingBracket(firstChar);

        // for cases like: ((()))
        int i, check = 0;
        for(i=1; i<length; i++) {
            if (expr[i] == firstChar) {
                check++;
            }
            if (expr[i] == closing) {
                if (check == 0) {
                    break;
                }
                check--;
            }
        }

        // if we did not find a closing bracket
        if (i == length) return false;

        // if the closing bracket was next to open bracket: ()
        if (i == 1) {
            return checkParenthesis(Arrays.copyOfRange(expr, i+1, length), length-2);
        }

        // if the closing bracket was in the middle then
        // check the middle part and the remaining part
        return checkParenthesis(Arrays.copyOfRange(expr, 1, i), i-1)
                && checkParenthesis(Arrays.copyOfRange(expr, (i+1), length), length-i-1);
    }

    private static char findClosingBracket(char bracket) {
        switch (bracket) {
            case '{':
                return '}';
            case '(':
                return ')';
            case '[':
                return ']';
            default:
                return Character.MIN_VALUE;
        }
    }
}