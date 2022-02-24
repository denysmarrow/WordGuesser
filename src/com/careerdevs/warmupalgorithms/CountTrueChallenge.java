package com.careerdevs.warmupalgorithms;

public class CountTrueChallenge {
    public static void main(String[] args) {
        countTrue

    }
    public static int countTrue(boolean[] arr) {
        int count = 0;
        for ( int i = 0; i < arr.length; i++)
            if (arr[i]) count++;
        return count;
    }
}
