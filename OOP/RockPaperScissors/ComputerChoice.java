// Declare the package for this Java file to organize the code
package OOP.RockPaperScissors;

// Blank line

// Import Random from java.util for random selection
import java.util.Random;
// Import Scanner from java.util for user input
import java.util.Scanner;

// Blank line

// Define a class named ComputerChoice that implements the Choice interface for random selection
class ComputerChoice implements Choice {
    // Implement the getChoice method for computer random choice
    public String getChoice() {
        // Create a new Random object
        Random random = new Random();
        // Generate a random int from 1 to 3
        int r = random.nextInt(3) + 1;
        // Return the choice based on the random number
        return (r == 1) ? "rock" : (r == 2) ? "paper" : "scissors";
    }
}