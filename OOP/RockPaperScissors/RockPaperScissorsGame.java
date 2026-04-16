// Declare the package for this Java file to organize the code
package OOP.RockPaperScissors;

// Blank line

// Import Random from java.util for random selection
import java.util.Random;
// Import Scanner from java.util for user input
import java.util.Scanner;

// Blank line

// Define a class named RockPaperScissorsGame to handle the game logic
class RockPaperScissorsGame {
    // Define a public method named determineWinner that takes user and computer choices
    public void determineWinner(String user, String computer) {
        // Check if choices are the same for a tie
        if (user.equals(computer)) {
            // Print tie message
            System.out.println("Tie!");
        } else if ((user.equals("rock") && computer.equals("scissors")) ||
                   (user.equals("scissors") && computer.equals("paper")) ||
                   (user.equals("paper") && computer.equals("rock"))) {
            // Check winning conditions for user
            System.out.println("You win!");
        } else {
            // Otherwise, computer wins
            System.out.println("Computer wins!");
        }
    }
}