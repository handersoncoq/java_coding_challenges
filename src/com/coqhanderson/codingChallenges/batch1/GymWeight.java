package com.coqhanderson.codingChallenges.batch1;

import java.util.*;

class GymWeight {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int B = in.nextInt();
        int R = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String E = in.nextLine();
        int W = in.nextInt();

        int totalweight = 0;

        switch(E){
            case "bp":
                totalweight += (W+20)*R;
                break;
            case "lp":
                totalweight += (W+47)*R;
                break;
            case "p":
                totalweight += W + B;
            default:
                System.out.println("Invalid entry");
        }

        System.out.println(totalweight);
    }
}