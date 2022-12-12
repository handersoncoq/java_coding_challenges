package com.coqhanderson.codingChallenges.batch1;

import java.util.Scanner;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        String lowerCase = s.toLowerCase();
        String initialRead = "";
        String reverseRead ="";
        boolean output = false;
        for(int i = 0; i<s.length(); i++){
            if(Character.isLetterOrDigit(lowerCase.charAt(i)))
                initialRead += lowerCase.charAt(i);
        }

        for(int i = s.length()-1; i>=0; i--){
            if(Character.isLetterOrDigit(lowerCase.charAt(i)))
                reverseRead += lowerCase.charAt(i);
        }

        if(initialRead.equals(reverseRead)){
            output = true;
        }

        return output;
    }

    public static void main(String[] args) {
        System.out.println("Enter string: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        System.out.println(isPalindrome(s));

    }
}
