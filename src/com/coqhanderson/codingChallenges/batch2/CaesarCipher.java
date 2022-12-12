package com.coqhanderson.codingChallenges.batch2;

import java.util.Scanner;

public class CaesarCipher {

    // Method takes a string and an int n
    // indicating the amount of time the letters have to rotate
    // returns the rotated string

    public static String encrypt(String s, int n) {

        StringBuilder rotatedString = new StringBuilder();
        char holder;

        for(char ch : s.toCharArray()){
            if(!Character.isAlphabetic(ch)) rotatedString.append(ch);
            else{
                holder = ch;
                for(int j = 1; j <= n; j++){
                    if(Character.isLowerCase(holder)){
                        if(holder == 'z') holder = 'a';
                        else holder = (char)(holder + 1);
                    }
                    else{
                        if(holder == 'Z') holder = 'A';
                        else holder = (char)(holder + 1);
                    }
                }
                rotatedString.append(holder);
            }
        }
        return rotatedString.toString();
    }

    // ************************************* Main Method ***************************************** //

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter string to encrypt: ");
        String s = input.nextLine();

        System.out.print("Enter number of time to rotate: ");
        int n = input.nextInt();

        System.out.println("String entered: "+s+"\n"+"Encrypted string: "+encrypt(s, n));
    }
}