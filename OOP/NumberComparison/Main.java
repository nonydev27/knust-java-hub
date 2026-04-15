// Declare the package for this Java file to organize the code
package OOP.NumberComparison;

// Blank line

// Import the Scanner class from java.util package for user input
import java.util.Scanner;

// Blank line

// Define a class named NumberFinder to track the largest and smallest numbers entered
class NumberFinder {
    // Declare a private int field for the largest number found
    private int largest;
    // Declare a private int field for the smallest number found
    private int smallest;

    // Blank line

    // Define a public default constructor for NumberFinder that initializes largest and smallest to extremes
    public NumberFinder() {
        // Set largest to the minimum possible int value
        this.largest = Integer.MIN_VALUE;
        // Set smallest to the maximum possible int value
        this.smallest = Integer.MAX_VALUE;
    }

    // Blank line

    // Define a public method named addNumber that takes an int and updates largest and smallest if necessary
    public void addNumber(int num) {
        // Check if num is greater than current largest
        if (num > largest) {
            // Update largest to num
            largest = num;
        }
        // Check if num is less than current smallest
        if (num < smallest) {
            // Update smallest to num
            smallest = num;
        }
    }

    // Blank line

    // Define a public getter method for the largest number
    public int getLargest() {
        // Return the largest field
        return largest;
    }

    // Blank line

    // Define a public getter method for the smallest number
    public int getSmallest() {
        // Return the smallest field
        return smallest;
    }
}

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