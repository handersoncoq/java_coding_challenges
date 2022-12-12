package com.coqhanderson.codingChallenges.batch2;

public class SumOfLast {

    public static int sumOfLast(int[] A){

        int result = 0;

        for (int i : A) {
            result += i % 10; // number % 10 gets the last digit of the number (aka the remainder)
        }

        return result;

    }
}
