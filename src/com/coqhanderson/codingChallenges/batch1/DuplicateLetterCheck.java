package com.coqhanderson.codingChallenges.batch1;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateLetterCheck {

    // We get a word (or a sentence) as an input
    // we want to print out all the duplicated letters in alphabetical order
    // occurrence of letter is 2 at max

    public static String rearrangeDupLetters(String S) {

        // the plan:
        // 1. we need to convert the string to a char array
        // 2. sort the array
        // 2. compare every single character to each other
        // 3. print out the ones that match

        char[] stringToArray = S.toCharArray();
        Arrays.sort(stringToArray);
        String duplicateLetters = "";

        for (int i = 1; i < stringToArray.length; i++) {
            if (stringToArray[i - 1] == stringToArray[i]) {
                duplicateLetters += stringToArray[i - 1];
                duplicateLetters += stringToArray[i];
            }
        }
        return duplicateLetters;
    }

    public static void main(String[] args) {

        System.out.print("Enter a string: ");
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();

        System.out.println(rearrangeDupLetters(S));
    }



}

