// Declare the package for this Java file to organize the code
package OOP.Greetings;

// Blank line

// Import the Scanner class from java.util package for user input
import java.util.Scanner;

// Blank line

// Define a class named Greeter to handle greeting functionality
class Greeter {
    // Declare a private String field to store the user's name
    private String name;

    // Blank line

    // Define a public method named setName that takes a Scanner and prompts for name until valid
    public void setName(Scanner scanner) {
        // Start an infinite loop to keep prompting until a non-blank name is entered
        while (true) {
            // Print prompt for name
            System.out.println("Enter your name: ");
            // Read the name from scanner
            name = scanner.nextLine();
            // Check if name is not blank
            if (!name.isBlank()) {
                // Break the loop if valid
                break;
            }
        }
    }

    // Blank line

    // Define a public method named getGreeting that returns the greeting message as String
    public String getGreeting() {
        // Return a concatenated string with "Good day " and the name
        return "Good day " + name;
    }
}