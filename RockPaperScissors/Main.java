package RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = getUserChoice(sc);
        String comp = getComputerChoice();
        System.out.println("Computer chose: " + comp);
        determineWinner(user, comp);
    }

    public static String getComputerChoice() {
        int r = new Random().nextInt(3) + 1;
        return (r == 1) ? "rock" : (r == 2) ? "paper" : "scissors";
    }

    public static String getUserChoice(Scanner sc) {
        System.out.print("Enter rock, paper, or scissors: ");
        return sc.next().toLowerCase();
    }

    public static void determineWinner(String u, String c) {
        if (u.equals(c)) System.out.println("Tie!");
        else if ((u.equals("rock") && c.equals("scissors")) ||
                 (u.equals("scissors") && c.equals("paper")) ||
                 (u.equals("paper") && c.equals("rock"))) System.out.println("You win!");
        else System.out.println("Computer wins!");
    }
}