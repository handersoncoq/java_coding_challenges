package com.coqhanderson.codingChallenges.batch1;

import java.util.Scanner;

public class EvenOddLong {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();

        long sumEven = 0;
        long sumOdd = 0;

        for(long i = 1; i<=n; i++){
            if(i%2 != 0){
                sumOdd += i;}
            if(i%2 == 0){
                sumEven += i;}
        }

        System.out.println(sumOdd);
        System.out.println(sumEven);
    }
}
