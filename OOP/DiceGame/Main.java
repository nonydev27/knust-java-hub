// Declare the package for this Java file to organize the code
package OOP.DiceGame;

// Blank line

// Import the Scanner class from java.util package for user input
import java.util.Scanner;

// Blank line

// Define the main public class named Main, which contains the entry point of the program
public class Main {
    // Define the main method, the starting point of the Java application, taking an array of String arguments
    public static void main(String[] args) {
        // Create a new Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Blank line

        // Print welcome message
        System.out.println("Welcome to the DICE GAME");
        // Print separator
        System.out.println("-------------------------");
        // Print prompt for name
        System.out.println("Enter your name: ");
        // Read the user name
        String userName = input.nextLine();

        // Blank line

        // Print personalized welcome
        System.out.println("Welcome " + userName + " to the DICE GAME");
        // Print game info
        System.out.println("You will be playing against the computer");
        // Print separator
        System.out.println("-----------------------------------------");
        // Print round info
        System.out.println("The game will run for 10 rounds");
        // Print separator
        System.out.println("-----------------------------------------");
        // Print win condition
        System.out.println("The player with the highest score wins");
        // Print separator
        System.out.println("-----------------------------------------");
        // Print start message
        System.out.println("Let's begin");
        // Print separator
        System.out.println("-----------------------------------------");

        // Blank line

        // Create a new Game instance with the user name
        Game game = new Game(userName);

        // Blank line

        // Play 10 rounds using a for loop
        for (int i = 0; i < 10; i++) {
            // Call playRound for each iteration
            game.playRound();
        }

        // Blank line

        // Announce the winner
        game.announceWinner();

        // Blank line

        // Close the Scanner
        input.close();
    }
}