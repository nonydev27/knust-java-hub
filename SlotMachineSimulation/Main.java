package SlotMachineSimulation;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        String[] words = {"Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars"};
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        double totalEntered = 0, totalWon = 0;
        String playAgain;

        do {
            System.out.print("Enter bet: ");
            double bet = sc.nextDouble();
            totalEntered += bet;

            String w1 = words[rand.nextInt(6)], w2 = words[rand.nextInt(6)], w3 = words[rand.nextInt(6)];
            System.out.println(w1 + " | " + w2 + " | " + w3);

            if (w1.equals(w2) && w2.equals(w3)) {
                System.out.println("3 Matches! Won 3x");
                totalWon += (bet * 3);
            } else if (w1.equals(w2) || w1.equals(w3) || w2.equals(w3)) {
                System.out.println("2 Matches! Won 2x");
                totalWon += (bet * 2);
            } else {
                System.out.println("No matches. Won $0");
            }

            System.out.print("Play again? (y/n): ");
            playAgain = sc.next();
        } while (playAgain.equalsIgnoreCase("y"));

        System.out.printf("Total Bet: $%.2f, Total Won: $%.2f\n", totalEntered, totalWon);
    }
}