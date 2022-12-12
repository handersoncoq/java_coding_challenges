package com.coqhanderson.codingChallenges.batch2;

import java.util.Arrays;

public class EvenOdds {

    public static void main(String[] args) {
        // Goal: print even and ood numbers between 0 and 100 increasing
        // need two array variables that will contain the numbers
        // one loop that starts from 0 to 100
        // even numbers are numbers that have remaining when divided by zero
        // print out the variables

        // Even numbers

        int[] evenNumbers = new int[51];            // 51 because there are 51 even numbers (0 is included)
        int[] oddNumbers = new int[50];             // 50 because there are 50 odd numbers
        int nextIndex1 = 0;                         // controls the indexes of the evenNumbers array
        int nextIndex2 = 0;                         // controls the indexes of the oddNumbers array

        for(int i = 0; i <= 100; i++){

            if(i % 2 == 0) {
                evenNumbers[nextIndex1] = i;
            }
            else{
                nextIndex1 += 1;
                oddNumbers[nextIndex2] = i;
                nextIndex2 += 1;
                }
            }

        System.out.println("Even numbers between 1 and 100: ");
        System.out.println(Arrays.toString(evenNumbers));
        System.out.println("Odd numbers between 1 and 100: ");
        System.out.println(Arrays.toString(oddNumbers));
    }
}
