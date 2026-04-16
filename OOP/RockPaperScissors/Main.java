// Declare the package for this Java file to organize the code
package OOP.RockPaperScissors;

// Blank line

// Import Random from java.util for random selection
import java.util.Random;
// Import Scanner from java.util for user input
import java.util.Scanner;

// Blank line

// Define the main public class named Main, which contains the entry point of the program
public class Main {
    // Define the main method, the starting point of the Java application, taking an array of String arguments
    public static void main(String[] args) {
        // Create a new Scanner object for input
        Scanner sc = new Scanner(System.in);
        // Create a UserChoice instance with the Scanner
        UserChoice userChoice = new UserChoice(sc);
        // Create a ComputerChoice instance
        ComputerChoice computerChoice = new ComputerChoice();
        // Create a RockPaperScissorsGame instance
        RockPaperScissorsGame game = new RockPaperScissorsGame();

        // Blank line

        // Get the user's choice
        String user = userChoice.getChoice();
        // Get the computer's choice
        String comp = computerChoice.getChoice();
        // Print the computer's choice
        System.out.println("Computer chose: " + comp);

        // Blank line

        // Determine and print the winner
        game.determineWinner(user, comp);

        // Blank line

        // Close the Scanner
        sc.close();
    }
}