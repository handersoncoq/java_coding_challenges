package com.coqhanderson.codingChallenges.batch2;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgagePayment {

    // program to calculate monthly mortgage payment
    // here are what we need:
        // 1) credit score
        // 2) annual income
        // 3) Principal
        // 4) Annual Interest Rate (in percent)
        // 5) Period (number of years)

    public static void main(String[] args) {

//        // check credit score
//        Scanner input = new Scanner(System.in);
//        System.out.print("Credit Score: ");
//        int creditScore = input.nextInt();
//        if(creditScore >= 700){
//
//            // check annual income
//            System.out.print("Annual Income: ");
//            int annualIncome = input.nextInt();
//            if(annualIncome >= 60000){
//
//                // user input for Principal (principal)
//                System.out.print("Principal: ");
//                double principal = input.nextInt();
//
//                // user input for annual interest rate (interestRate) in percent
//                System.out.print("Annual Interest Rate (%): ");
//                double interestRate = (input.nextDouble()/100)/12;     // convert to decimal, and month
//
//                // user input for period (period) in years
//                System.out.print("Period (Years): ");
//                int period = input.nextInt()*12;    // convert to months
//
//                // calculate monthly mortgageFormatted payment
//                double mortgage = principal*((interestRate*(Math.pow((1+interestRate), period))) / ((Math.pow((1+interestRate), period))-1));
//                String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);  // format to currency
//                System.out.println("Mortgage: "+mortgageFormatted);
//
//            } else
//                System.out.println("Not eligible for loan");
//        } else
//            System.out.println("Not eligible for loan");

        // check credit score
        Scanner input = new Scanner(System.in);
        int creditScore = 0;

        while(true){
            System.out.print("Credit Score: ");
            creditScore = input.nextInt();
            if(creditScore >= 700)
                break;
            System.out.println("Credit score must be greater");
        }

        // check annual income
        int annualIncome = 0;

        while(true){
            System.out.print("Annual Income: ");
            annualIncome = input.nextInt();
            if(annualIncome >= 60000)
                break;
            System.out.println("Annual income must be greater");
        }

        // user input for Principal (principal)
        System.out.print("Principal: ");
        double principal = input.nextInt();

        // user input for annual interest rate (interestRate) in percent
        System.out.print("Annual Interest Rate (%): ");
        double interestRate = (input.nextDouble()/100)/12;     // convert to decimal, and month

        // user input for period (period) in years
        System.out.print("Period (Years): ");
        int period = input.nextInt()*12;    // convert to months

        // calculate monthly mortgageFormatted payment
        double mortgage = principal*((interestRate*(Math.pow((1+interestRate), period))) / ((Math.pow((1+interestRate), period))-1));
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);  // format to currency
        System.out.println("Approved!");
        System.out.println("Your monthly mortgage is: "+mortgageFormatted);
    }

}
