package com.coqhanderson.codingChallenges.batch2;

import java.util.Scanner;

public class RandomStringGenerator {

    public static Double deposit(String accountId, Double depositAmount) {

       Double balance = 100.00;
       Double newBalance = balance + depositAmount;

        return newBalance;
    }

    public static void main(String[] args) {
//
//        long pswd = (long) (Math.random() * 10000000001L);       // generating random password for each user
//        String password = Long.toString(pswd);
//        System.out.println(password);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter account ID: ");
        String accId = input.nextLine();
        System.out.println("Enter deposit amount: ");
        Double depoAmount = input.nextDouble();

        Double yourNewBalance = deposit(accId, depoAmount);
        System.out.println("your new balance is: " + yourNewBalance);

    }

}
