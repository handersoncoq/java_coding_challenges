package com.coqhanderson.codingChallenges.batch1;

import java.util.Scanner;

public class MinMaxDiff {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        int[] numbers = {a, b, c, d};
        int max = a;
        int min = a;

        for(int i =0; i<numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
            else {
                min = numbers[i];
            }
        }
        int diff = max - min;
        System.out.println(diff);
    }
}
