package com.coqhanderson.codingChallenges.batch2;

import java.util.Scanner;

public class FizzBuzz {

    // program to determine if a number is divisible by 3 and 5
    // number is divisible by 5: Fizz
    // number is divisible by 3: Buzz
    // number is divisible by 3 and 5: FizzBuzz
    // number is neither divisible by 3 nor 5, returns number

    public static void main(String[] args) {

        // get number input
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int number = input.nextInt();

        // if statements to determine result
        if(number % 3 == 0 && number % 5 == 0)
            System.out.println("FizzBuzz");
        else if(number % 5 == 0)
            System.out.println("Fizz");
        else if(number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);
    }
}
