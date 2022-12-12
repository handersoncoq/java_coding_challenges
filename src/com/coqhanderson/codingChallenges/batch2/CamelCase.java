package com.coqhanderson.codingChallenges.batch2;

import java.util.Scanner;

public class CamelCase {

    public static String camelCase(String S){

        StringBuilder camelCase = new StringBuilder();
        camelCase.append(Character.toLowerCase(S.charAt(0)));
        for (int i=1; i<S.length(); i++) {
            while(S.charAt(i) == 32) i++;
            if(S.charAt(i-1) == 32) camelCase.append(Character.toUpperCase(S.charAt(i)));
            else camelCase.append(Character.toLowerCase(S.charAt(i)));
        }
        return camelCase.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine().trim();

        System.out.println(camelCase(S));
    }
}
