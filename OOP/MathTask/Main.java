// Declare the package for this Java file to organize the code
package OOP.MathTask;

// Blank line

// Define the main public class named Main, which contains the entry point of the program
public class Main {
    // Define the main method, the starting point of the Java application, taking an array of String arguments
    public static void main(String[] args) {
        // Create a new MathCalculator object with n=10
        MathCalculator calculator = new MathCalculator(10);

        // Blank line

        // Calculate the average
        double avg = calculator.calculateAverage();
        // Calculate the standard deviation
        double sd = calculator.calculateStandardDeviation();
        // Calculate the factorial of integer SD
        long factorial = calculator.calculateFactorialOfSD();

        // Blank line

        // Print the average
        System.out.println("Average: " + avg);
        // Print the standard deviation
        System.out.println("SD: " + sd);
        // Print the factorial
        System.out.println("Factorial of (int)SD: " + factorial);
    }
}