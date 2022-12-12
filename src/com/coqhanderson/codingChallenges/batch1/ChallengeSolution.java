package com.coqhanderson.codingChallenges.batch1;

import java.util.Scanner;

public class ChallengeSolution {

    public static int rearrangeTheDigits(int N) {

        // goal: return the greatest possible number
        // plan:
        // put the number into an array
        // sort the array descending

        String intoToString = Integer.toString(N);
        char[] stringToArray = intoToString.toCharArray();
        String greatestNumber = "";

        for(int i=stringToArray.length-1; i>=0; i--){
            greatestNumber += stringToArray[i];
        }

        int greatestNumberInt = Integer.parseInt(greatestNumber);
        return greatestNumberInt;
    }
    public static void main(String[] args) {
        // INPUT [uncomment & modify if required]
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // OUTPUT [uncomment & modify if required]
        System.out.print(rearrangeTheDigits(N));
    }
}
