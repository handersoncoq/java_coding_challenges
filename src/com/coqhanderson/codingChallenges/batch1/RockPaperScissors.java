package com.coqhanderson.codingChallenges.batch1;

import java.util.*;

class RockPaperScissors {

    public static void main(String args[]) {

        // asking for user input
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Player 1 choice:");
        String player1 = in.next();
        System.out.println("Enter Player 2 choice:");
        String player2 = in.next();

        String winner = "It's a draw";

        // analyzing inputs for conclusion
        if (player1.equals("ROCK") && player2.equals("SCISSORS")){
             winner = "Player 1 wins";
        } else if (player1.equals("PAPER") && player2.equals("SCISSORS")){
             winner = "Player 2 wins";
        } else if (player1.equals("ROCK") && player2.equals("PAPER")){
             winner = "Player 2 wins";
        }

        // printing result
        System.out.println(winner);
    }
}