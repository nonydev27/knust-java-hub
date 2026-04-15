package OOP.SlotMachineSimulation;

import java.util.*;

// Class representing the slot machine
class SlotMachine {
    // Private fields for words, total entered, total won
    private String[] words = {"Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars"};
    private double totalEntered = 0;
    private double totalWon = 0;
    private Random rand = new Random();

    // Method to play a round
    public double playRound(double bet) {
        totalEntered += bet;
        String w1 = words[rand.nextInt(6)];
        String w2 = words[rand.nextInt(6)];
        String w3 = words[rand.nextInt(6)];
        System.out.println(w1 + " | " + w2 + " | " + w3);

        double win = 0;
        if (w1.equals(w2) && w2.equals(w3)) {
            System.out.println("3 Matches! Won 3x");
            win = bet * 3;
        } else if (w1.equals(w2) || w1.equals(w3) || w2.equals(w3)) {
            System.out.println("2 Matches! Won 2x");
            win = bet * 2;
        } else {
            System.out.println("No matches. Won $0");
        }
        totalWon += win;
        return win;
    }

    // Getters for totals
    public double getTotalEntered() { return totalEntered; }
    public double getTotalWon() { return totalWon; }
}

// Main class to run the slot machine
public class Main {
    public static void main(String[] args) {
        SlotMachine machine = new SlotMachine();
        Scanner sc = new Scanner(System.in);
        String playAgain;

        do {
            System.out.print("Enter bet: ");
            double bet = sc.nextDouble();
            machine.playRound(bet);

            System.out.print("Play again? (y/n): ");
            playAgain = sc.next();
        } while (playAgain.equalsIgnoreCase("y"));

        System.out.printf("Total Bet: $%.2f, Total Won: $%.2f\n", machine.getTotalEntered(), machine.getTotalWon());
        sc.close();
    }
}