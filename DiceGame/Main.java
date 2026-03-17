package DiceGame;

import java.util.*;

public class Main {
    public static void main(String[] args){
        /*

This program simulates a 10-round match between a computer and a user.

    The Loop: Must run exactly 10 times.

    The Action: In each round, generate two random numbers between 1 and 6 (one for the computer, one for the user).

    The Logic: * Compare the two numbers.

        If Computer > User, increment computerWins.

        If User > Computer, increment userWins.

        If it's a tie, no one gets a point.

    The Goal: After 10 rounds, compare the total wins and announce the "Grand Winner." */

    String user1;
    String user2 = "Computer";

    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to the DICE GAME");
    System.out.println("-------------------------");


    System.out.println("Enter your name: ");
    user1 = input.nextLine();
    
    System.out.println("Welcome " + user1 + " to the DICE GAME");

    System.out.println("You will be playing against the computer");
    System.out.println("-----------------------------------------");
    System.out.println("The game will run for 10 rounds");
    System.out.println("-----------------------------------------");
    System.out.println("The player with the highest score wins");
    System.out.println("-----------------------------------------");
    System.out.println("Let's begin");
    System.out.println("-----------------------------------------");


    
}
