// Declare the package for this Java file to organize the code
package OOP.phel_java;

// Blank line

// Import the Scanner class from java.util package to handle user input
import java.util.Scanner;

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