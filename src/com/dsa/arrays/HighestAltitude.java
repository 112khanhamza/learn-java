package com.dsa.arrays;

public class HighestAltitude {
    public static void main(String[] args) {

    }

    static int largestAltitude(int[] gain) {
        int currAlt = 0;
        int maxAlt = 0;
        for (int i : gain) {
            currAlt += i;
            if (currAlt > maxAlt) maxAlt = currAlt;
        }
        return maxAlt;
    }
}
