// Declare the package for this Java file to organize the code
package OOP.NumberComparison;

// Blank line

// Import the Scanner class from java.util package for user input
import java.util.Scanner;

// Blank line

// Define the main public class named Main, which contains the entry point of the program
public class Main {
    // Define the main method, the starting point of the Java application, taking an array of String arguments
    public static void main(String[] args) {
        // Print the program description
        System.out.println("This program will display the largest and smallest number entered from the you the user.");
        // Print separator lines
        System.out.println("=================== ================= ====================");
        // Print a blank line
        System.out.println();

        // Blank line

        // Create a new NumberFinder object
        NumberFinder finder = new NumberFinder();
        // Create a new Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Blank line

        // Print prompt for entering numbers
        System.out.println("Enter a series of integers (-99 to stop):");

        // Blank line

        // Start an infinite while loop to read numbers until -99
        while (true) {
            // Read the next int from scanner
            int num = scanner.nextInt();

            // Blank line

            // Check if num is -99 to stop
            if (num == -99) {
                // Break the loop
                break;
            }

            // Blank line

            // Add the number to the finder
            finder.addNumber(num);
        }

        // Blank line

        // Print the largest number entered
        System.out.println("Largest number entered: " + finder.getLargest());
        // Print the smallest number entered
        System.out.println("Smallest number entered: " + finder.getSmallest());

        // Blank line

        // Close the Scanner
        scanner.close();
    }
}