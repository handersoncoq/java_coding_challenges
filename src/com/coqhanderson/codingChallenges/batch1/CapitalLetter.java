package com.coqhanderson.codingChallenges.batch1;

import java.util.Scanner;

public class CapitalLetter {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        char[] v = S.toCharArray();

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages..."

        StringBuilder capitalLetter = new StringBuilder();
        for (char c : v) {
            if (Character.isUpperCase(c)) {
                capitalLetter.append(c);
            }
        }

        System.out.println(capitalLetter);
    }
}
