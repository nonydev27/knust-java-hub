// Declare the package for this Java file to organize the code
package OOP.phel_java;

// Blank line

// Import the Scanner class from java.util package to handle user input
import java.util.Scanner;

// Blank line

// Define a class named GreetingApp to handle user greeting functionality
class GreetingApp {
    // Declare a private field of type String to store the user's name, ensuring encapsulation
    private String name;

    // Blank line

    // Define a public method named setName that takes a Scanner object as parameter to read user input
    public void setName(Scanner input) {
        // Print a message to the console prompting the user to enter their name
        System.out.println("Please state your name:");
        // Read the next line of input from the Scanner and assign it to the name field using 'this' for clarity
        this.name = input.nextLine();
    }

    // Blank line

    // Define a public method named getGreeting that returns a String containing the greeting message
    public String getGreeting() {
        // Return a concatenated string that includes "Hello, ", the user's name, and a welcome message with a newline
        return "Hello, " + name + "!\nWelcome to this java platform!";
    }
}