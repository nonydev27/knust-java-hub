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

// Blank line

// Define the main public class named Test, which contains the entry point of the program
public class Test {
    // Define the main method, the starting point of the Java application, taking an array of String arguments
    public static void main(String[] args) {
        // Instantiate a new GreetingApp object to handle the greeting functionality
        GreetingApp app = new GreetingApp();
        // Create a new Scanner object to read input from the standard input stream (System.in)
        Scanner input = new Scanner(System.in);

        // Blank line

        // Call the setName method on the app object, passing the Scanner to prompt and set the user's name
        app.setName(input);
        // Print the greeting message returned by the getGreeting method to the console
        System.out.println(app.getGreeting());

        // Blank line

        // Close the Scanner object to release system resources and prevent resource leaks
        input.close();
    }
}