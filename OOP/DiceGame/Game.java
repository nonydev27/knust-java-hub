// Declare the package for this Java file to organize the code
package OOP.DiceGame;

// Blank line

// Import the Scanner class from java.util package for user input
import java.util.Scanner;

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