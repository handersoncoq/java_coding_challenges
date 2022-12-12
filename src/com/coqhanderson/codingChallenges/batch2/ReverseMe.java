package com.coqhanderson.codingChallenges.batch2;

public class ReverseMe {

    public static void reverseWord(String s){

        for(int i = s.length()-1; i>=0; i--){
            System.out.print(s.charAt(i));
        }
    }

    public static void reverseSentence(String s){

        String[] arr = s.split(" ");
        for(int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main (String[]args) {

        reverseWord("I Love You");
        System.out.println();
        reverseSentence("Je ne sais quoi");

    }
}
