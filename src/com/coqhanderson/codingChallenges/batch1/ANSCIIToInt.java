package com.coqhanderson.codingChallenges.batch1;

import java.util.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class ANSCIIToInt {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();

        //Goal: Add all ASCII values for each char in a string
        // 1. Take string and look at each character
        // 2. Calculate the value of that character in ASCII value
        // 3. Create a variable to store the sum
        // 4. Iterate through each character adding its ASCII value to variable from step 3
        // 5. After iterating through all characters print out the sum

        int sum = 0;
        for(int i = 0; i < S.length(); i++){
            // method provided by String to evaluate the ASCII value @ a particular index in the string
            sum += S.charAt(i);
        }


        System.out.println(sum);
    }
}
