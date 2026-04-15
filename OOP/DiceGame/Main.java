// Declare the package for this Java file to organize the code
package OOP.DiceGame;

// Blank line

// Import the Scanner class from java.util package for user input
import java.util.Scanner;

// Blank line

// Define a class named Player to represent a player in the dice game
class Player {
    // Declare a private String field for the player's name
    private String name;
    // Declare a private int field for the player's score
    private int score;

    // Blank line

    // Define a public constructor for Player that takes a name and initializes score to 0
    public Player(String name) {
        // Assign the name parameter to the private field
        this.name = name;
        // Initialize score to 0
        this.score = 0;
    }

    // Blank line

    // Define a public method named win that increments the player's score
    public void win() {
        // Increment the score by 1
        score++;
    }

    // Blank line

    // Define a public getter method for the score
    public int getScore() {
        // Return the score field
        return score;
    }

    // Blank line

    // Define a public getter method for the name
    public String getName() {
        // Return the name field
        return name;
    }
}

// Blank line

// Define a class named Dice to handle dice rolling
class Dice {
    // Define a public method named roll that returns a random int between 1 and 6
    public int roll() {
        // Generate a random number from 0 to 5, add 1 to make it 1 to 6
        return (int)(Math.random() * 6) + 1;
    }
}

// Blank line

// Define a class named Game to manage the game logic
class Game {
    // Declare a private Player field for the user
    private Player user;
    // Declare a private Player field for the computer
    private Player computer;
    // Declare a private Dice field for rolling
    private Dice dice;

    // Blank line

    // Define a public constructor for Game that takes userName and initializes players and dice
    public Game(String userName) {
        // Create a new Player for the user with the given name
        this.user = new Player(userName);
        // Create a new Player for the computer with "Computer" name
        this.computer = new Player("Computer");
        // Create a new Dice object
        this.dice = new Dice();
    }

    // Blank line

    // Define a public method named playRound that simulates a single round of the game
    public void playRound() {
        // Roll dice for user
        int userRoll = dice.roll();
        // Roll dice for computer
        int compRoll = dice.roll();

        // Blank line

        // Print round results header
        System.out.println("Round results: ");
        // Print user's roll
        System.out.println(user.getName() + " rolled a " + userRoll);
        // Print computer's roll
        System.out.println(computer.getName() + " rolled a " + compRoll);

        // Blank line

        // Check if user rolled higher
        if (userRoll > compRoll) {
            // User wins the round
            user.win();
        } else if (compRoll > userRoll) {
            // Computer wins the round
            computer.win();
        } else {
            // It's a tie
            System.out.println("It's a tie");
        }

        // Blank line

        // Print current scores header
        System.out.println("Current score: ");
        // Print user's score
        System.out.println(user.getName() + ": " + user.getScore());
        // Print computer's score
        System.out.println(computer.getName() + ": " + computer.getScore());
        // Print separator
        System.out.println("-----------------------------------------");
    }

    // Blank line

    // Define a public method named announceWinner that prints the final winner
    public void announceWinner() {
        // Check if user has higher score
        if (user.getScore() > computer.getScore()) {
            // Print user wins message
            System.out.println(user.getName() + " wins the game with a score of " + user.getScore());
        } else if (computer.getScore() > user.getScore()) {
            // Print computer wins message
            System.out.println(computer.getName() + " wins");
        } else {
            // Print tie message
            System.out.println("It's a tie");
        }
    }
}

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