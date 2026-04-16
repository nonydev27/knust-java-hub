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