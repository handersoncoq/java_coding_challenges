package com.coqhanderson.codingChallenges.batch1;

import java.util.Scanner;

public class putJackInMiddle {

    // we want to put Jack in the middle of
    // Bob (x1, y2) and
    // Erika (x1, y2)

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int rb = in.nextInt();
        int cb = in.nextInt();
        int re = in.nextInt();
        int ce = in.nextInt();

        int rj = ((re+rb))/2;
        int cj = ((cb+ce))/2;

        System.out.println(rj + " " + cj);
    }
}
