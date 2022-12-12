package com.coqhanderson.codingChallenges.batch2;

import java.util.Scanner;

public class WordBuilder {

    public static void main(String[] args) {

        // we get multiple letters as input
        // we want to concatenate them
        // to print a complete word

        Scanner in = new Scanner(System.in);

        String sentence = "";
        for(int i = 1; i < 5; i++){
            System.out.print("enter a letter: ");
            String input = in.nextLine();
            sentence += input;
        }
        System.out.print("The word you just spelled is: " + sentence);
    }
}
