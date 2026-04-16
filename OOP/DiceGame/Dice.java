// Declare the package for this Java file to organize the code
package OOP.DiceGame;

// Blank line

// Import the Scanner class from java.util package for user input
import java.util.Scanner;

// Blank line

// Define a class named Dice to handle dice rolling
class Dice {
    // Define a public method named roll that returns a random int between 1 and 6
    public int roll() {
        // Generate a random number from 0 to 5, add 1 to make it 1 to 6
        return (int)(Math.random() * 6) + 1;
    }
}