package com.coqhanderson.codingChallenges.batch2;

import java.util.Scanner;

public class CamelCase {

    public static String camelCase(String S){

        StringBuilder camelCase = new StringBuilder();
        for (int i=0; i<=S.length()-1; i++) {

            if(S.charAt(i) == 32) {
                i++;
                camelCase.append(Character.toUpperCase(S.charAt(i)));
                i++;
            }
            camelCase.append(Character.toLowerCase(S.charAt(i)));
        }
        return camelCase.toString();
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine().trim();

        System.out.println(camelCase(S));
    }
}
