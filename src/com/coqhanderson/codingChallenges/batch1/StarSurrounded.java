package com.coqhanderson.codingChallenges.batch1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarSurrounded {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String A = input.nextLine();

        String stars = " ";

        for(int i=0; i < A.length()+4; i++) {
            stars +="*";
        }
        System.out.println(stars);
        System.out.println("* " + A + " *");
        System.out.println(stars);

        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(A);
        System.out.println(matcher.matches());

        Long accNumber = (long) (Math.random() * 10000000001L);
        String accountNumber = accNumber.toString();
        System.out.println(accountNumber);
    }
}