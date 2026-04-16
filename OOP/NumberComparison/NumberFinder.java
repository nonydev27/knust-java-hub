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