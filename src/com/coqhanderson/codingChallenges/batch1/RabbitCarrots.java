package com.coqhanderson.codingChallenges.batch1;

import java.util.Arrays;
import java.util.Scanner;

public class RabbitCarrots {

    // we get two inputs:
    // first input has two parts: N number of basket and M distance of a rabbit hump
    // second input has the number of carrots each basket has
    // one jump of rabbit is worth 2 spaces / baskets are single-space separated
    // goal: determine the number of carrots the rabbit eats at the end when he gets to the last basket

    // explanation: each jump a rabbit makes, it skips a basket
    // put each basket by its number of carrots in an array of length N
    // increment an index by M
    // and add each element from these indexes
    // return sum

    public static int carrotsEaten(String basketJump, String carrotsNum){

//        int[] arrayBaskets = new int[NM[0]];

        String[] basketJumpToArray = basketJump.split(" ");
        String[] carrotsNumToArray = carrotsNum.split(" ");

        int[] NM = Arrays.stream(basketJumpToArray).mapToInt(Integer::parseInt).toArray();
        int[] numberofCarrotsArray = Arrays.stream(carrotsNumToArray).mapToInt(Integer::parseInt).toArray();

        int sum = numberofCarrotsArray[0];
        int index = NM[1];
        for(int i=0; i < (NM[0]-1)/NM[1]; i++){
            sum += numberofCarrotsArray[index];
            index +=NM[1];
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Basket and Jump numbers: ");
        String basketJump = in.nextLine();
        System.out.print("Carrots numbers: ");
        String carrotsNum = in.nextLine();

        int numberOfCarrotsEaten = carrotsEaten(basketJump, carrotsNum);
        System.out.println(numberOfCarrotsEaten);
    }
}
