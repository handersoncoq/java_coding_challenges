package com.coqhanderson.codingChallenges.batch1;

import java.util.Scanner;

public class ReduceString {

    // a string S of length N is given
    // we want to find all the letters that are part of the string
    // without the duplicates
    // return only the letters of one occurrence

    public static String reduceString(int N, String S){

        // Put the string into a char array
        // then if a string is found more than twice, return only one of the occurrence
        // else return the letter

        char[] stringToArray = S.toCharArray();
        String writtenLetters = "";

        for (char letter: stringToArray) {
            if ((writtenLetters.indexOf(letter) == -1)) {
                writtenLetters += letter;
            }
        }
        return writtenLetters;
    }

    public static void main(String[] args) {

        System.out.print("Enter string: ");
        Scanner input = new Scanner(System.in);
        String S = input.nextLine();

        System.out.println(reduceString(S.length(), S));
    }
}
