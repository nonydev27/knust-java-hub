// Declare the package for this Java file to organize the code
package OOP.SlotMachineSimulation;

// Blank line

// Import all classes from the java.util package for utilities like Random and Scanner
import java.util.*;

// Blank line

// Define a class named SlotMachine to simulate a slot machine game
class SlotMachine {
    // Declare a private array of String for possible slot words
    private String[] words = {"Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars"};
    // Declare a private double to track total money entered
    private double totalEntered = 0;
    // Declare a private double to track total money won
    private double totalWon = 0;
    // Declare a private Random object for generating random selections
    private Random rand = new Random();

    // Blank line

    // Define a public method named playRound that takes a bet amount and returns the win amount as double
    public double playRound(double bet) {
        // Add the bet to total entered
        totalEntered += bet;
        // Randomly select the first word
        String w1 = words[rand.nextInt(6)];
        // Randomly select the second word
        String w2 = words[rand.nextInt(6)];
        // Randomly select the third word
        String w3 = words[rand.nextInt(6)];
        // Print the three words separated by pipes
        System.out.println(w1 + " | " + w2 + " | " + w3);

        // Blank line

        // Initialize win amount to 0
        double win = 0;
        // Check if all three words are the same for 3 matches
        if (w1.equals(w2) && w2.equals(w3)) {
            // Print win message for 3 matches
            System.out.println("3 Matches! Won 3x");
            // Set win to 3 times the bet
            win = bet * 3;
        } else if (w1.equals(w2) || w1.equals(w3) || w2.equals(w3)) {
            // Print win message for 2 matches
            System.out.println("2 Matches! Won 2x");
            // Set win to 2 times the bet
            win = bet * 2;
        } else {
            // Print no win message
            System.out.println("No matches. Won $0");
        }
        // Add the win amount to total won
        totalWon += win;
        // Return the win amount
        return win;
    }

    // Blank line

    // Define a public getter method for total entered amount
    public double getTotalEntered() { return totalEntered; }
    // Define a public getter method for total won amount
    public double getTotalWon() { return totalWon; }
}

// Blank line

// Define the main public class named Main, which contains the entry point of the program
public class Main {
    // Define the main method, the starting point of the Java application, taking an array of String arguments
    public static void main(String[] args) {
        // Create a new SlotMachine object
        SlotMachine machine = new SlotMachine();
        // Create a new Scanner object for user input
        Scanner sc = new Scanner(System.in);
        // Declare a String variable for play again choice
        String playAgain;

        // Blank line

        // Start a do-while loop to play rounds until user stops
        do {
            // Prompt user to enter bet amount
            System.out.print("Enter bet: ");
            // Read the bet as double
            double bet = sc.nextDouble();
            // Play a round with the bet and print results
            machine.playRound(bet);

            // Blank line

            // Prompt user if they want to play again
            System.out.print("Play again? (y/n): ");
            // Read the play again choice
            playAgain = sc.next();
        } while (playAgain.equalsIgnoreCase("y"));

        // Blank line

        // Print the final totals
        System.out.printf("Total Bet: $%.2f, Total Won: $%.2f\n", machine.getTotalEntered(), machine.getTotalWon());
        // Close the Scanner
        sc.close();
    }
}