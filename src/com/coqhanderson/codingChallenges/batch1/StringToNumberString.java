package com.coqhanderson.codingChallenges.batch1;

import java.util.Scanner;

public class StringToNumberString {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String v = s.toLowerCase();

        String secretcode = "";

        // 0912152205251521

        for(int i = 0; i<s.length(); i++){

            if((v.charAt(i) - 'a' + 1) < 10){

                secretcode += "0" + (v.charAt(i) - 'a' + 1);

            } else{

                secretcode += (v.charAt(i) - 'a' + 1);

            }



        }

        System.out.println(secretcode);
        System.out.println(Integer.parseInt(secretcode));

    }

}
