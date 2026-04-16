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