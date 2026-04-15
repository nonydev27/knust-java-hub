// Declare the package for this Java file to organize the code
package OOP.RockPaperScissors;

// Blank line

// Import Random from java.util for random selection
import java.util.Random;
// Import Scanner from java.util for user input
import java.util.Scanner;

// Blank line

// Define an interface named Choice to represent a choice in the game
interface Choice {
    // Define an abstract method getChoice that returns a String
    String getChoice();
}

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