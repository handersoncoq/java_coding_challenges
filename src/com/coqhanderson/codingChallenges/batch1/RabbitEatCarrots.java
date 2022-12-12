package com.coqhanderson.codingChallenges.batch1;

import java.util.Scanner;

public class RabbitEatCarrots {
    // we get two inputs:
    // first input has two parts: N number of basket and M distance of a rabbit jump
    // second input has the number of carrots each basket has
    // one jump of rabbit is worth 2 spaces / baskets are single-space separated
    // goal: determine the number of carrots the rabbit eats at the end when he gets to the last basket

    // explanation: each jump the rabbit makes, it skips a basket (so it does not eat from that basket)
    // we should increment an index by M so we can add value from the next index instead
    // and add each element from these indexes
    // return sum

    public static int carrotsEaten(int N, int M, int[] A){


        int sum = A[0];
        int index = M;
        for(int i=0; i < (N-1)/M; i++){
            sum += A[index];
            index +=M;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Number of baskets: ");
        int N = in.nextInt();
        System.out.print("Number spaces per jump: ");
        int M = in.nextInt();

        int[] A = new int[N];
        for(int i = 0; i<A.length; i++){
            System.out.print("Number of carrots: ");
            A[i] = in.nextInt();
        }

        int numberOfCarrotsEaten = carrotsEaten(N, M, A);
        System.out.println(numberOfCarrotsEaten);
    }
}
