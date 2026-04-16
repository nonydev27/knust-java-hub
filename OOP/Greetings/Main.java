// Declare the package for this Java file to organize the code
package OOP.Greetings;

// Blank line

// Import the Scanner class from java.util package for user input
import java.util.Scanner;

// Blank line

// Define the main public class named Main, which contains the entry point of the program
public class Main {
    // Define the main method, the starting point of the Java application, taking an array of String arguments
    public static void main(String[] args) {
        // Print a description of the program
        System.out.println("This program takes the name of the user and then displays a greeting!");

        // Blank line

        // Create a new Greeter object
        Greeter greeter = new Greeter();
        // Create a new Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Blank line

        // Call setName to prompt and set the name
        greeter.setName(scanner);

        // Blank line

        // Print the greeting message
        System.out.println(greeter.getGreeting());
        // Close the Scanner
        scanner.close();
    }
}