package com.dsa.arrays;

public class RichestCustomer {
    public static void main(String[] args) {

    }

    static int maximumWealth(int[][] accounts) {
        int maxWealth = accounts[0][0];
        for (int[] account : accounts) {
            int balance = getCurrentBalanceInAccount(account);
            if (balance > maxWealth) maxWealth = balance;
        }
        return maxWealth;
    }

    static int getCurrentBalanceInAccount(int[] account) {
        int totalBalance = 0;
        for(int amount : account) {
            totalBalance+=amount;
        }
        return totalBalance;
    }
}
