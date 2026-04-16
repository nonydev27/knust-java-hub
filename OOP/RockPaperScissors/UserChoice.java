// Declare the package for this Java file to organize the code
package OOP.RockPaperScissors;

// Blank line

// Import Random from java.util for random selection
import java.util.Random;
// Import Scanner from java.util for user input
import java.util.Scanner;

// Blank line

// Define a class named UserChoice that implements the Choice interface for user input
class UserChoice implements Choice {
    // Declare a private Scanner field for user input
    private Scanner sc;

    // Blank line

    // Define a public constructor for UserChoice that takes a Scanner
    public UserChoice(Scanner sc) {
        // Assign the Scanner to the private field
        this.sc = sc;
    }

    // Blank line

    // Implement the getChoice method for user input
    public String getChoice() {
        // Print prompt for user choice
        System.out.print("Enter rock, paper, or scissors: ");
        // Read the input, convert to lowercase, and return
        return sc.next().toLowerCase();
    }
}