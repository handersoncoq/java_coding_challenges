package com.coqhanderson.codingChallenges.batch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stairs {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter n: ");

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        for(int pound=1; pound<=n; pound++){
            int space = n - pound;
            for(int i=space; i>0; i--){
                System.out.print(" ");
            }
            for(int i=pound; i>0; i--){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}