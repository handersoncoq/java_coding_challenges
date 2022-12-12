package com.coqhanderson.codingChallenges.batch1;

import java.util.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class RockPaperScissors2 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String call1 = in.next();
        String call2 = in.next();


        if(call1.equals(call2)) System.out.println("DRAW");

        switch(call1){
            case "ROCK":
                if(call2.equals("PAPER")){
                    System.out.println("PLAYER2");
                } else if(call2.equals("SCISSORS")){
                    System.out.println("PLAYER1");
                }
                break;
            case "SCISSORS":
                if(call2.equals("PAPER")){
                    System.out.println("PLAYER1");
                } else if(call2.equals("ROCK")){
                    System.out.println("PLAYER2");
                }
                break;
            case "PAPER":
                if(call2.equals("SCISSORS")){
                    System.out.println("PLAYER2");
                } else if(call2.equals("ROCK")){
                    System.out.println("PLAYER1");
                }
                break;
            default:
                System.out.println("Something went wrong");
        }

    }
}