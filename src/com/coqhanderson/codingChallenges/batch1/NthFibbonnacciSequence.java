package com.coqhanderson.codingChallenges.batch1;

import java.util.Scanner;

public class NthFibbonnacciSequence {

    // given the first two terms of a fibbonnaccii squence
    // print the Nth term

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int N = in.nextInt();

        // Fn = F(n-2) + F(n-1)
        // loop should start from 2

        int[] F = new int[N];
        F[0] = A;
        F[1] = B;
        for(int n = 2; n < N; n++){
                F[n] = F[n - 2] + F[n - 1];
                System.out.print(F[n]);
            }
        System.out.println( "\n" + "Nth number: " + F[N-1]);
    }
}
