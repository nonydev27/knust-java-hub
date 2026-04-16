// Declare the package for this Java file to organize the code
package OOP.GradingSystem;

// Blank line

// Import the Scanner class from java.util package for user input
import java.util.Scanner;

// Blank line

// Define the main public class named Main, which contains the entry point of the program
public class Main {
    // Define the main method, the starting point of the Java application, taking an array of String arguments
    public static void main(String[] args) {
        // Create a new Scanner object for input
        Scanner sc = new Scanner(System.in);
        // Print prompt for exam score
        System.out.print("Enter Exam Score: ");
        // Read exam score as int
        int exam = sc.nextInt();
        // Print prompt for assessment score
        System.out.print("Enter Assessment Score: ");
        // Read assessment score as int
        int assess = sc.nextInt();
        // Print prompt for fees paid
        System.out.print("Enter Fees Paid: ");
        // Read fees as double
        double fees = sc.nextDouble();

        // Blank line

        // Create a new GradingCalculator instance with the input values
        GradingCalculator calculator = new GradingCalculator(exam, assess, fees);

        // Blank line

        // Print exam pass/fail status
        System.out.println("Exam: " + (calculator.isExamPassed() ? "Passed" : "Failed"));
        // Print assessment pass/fail status
        System.out.println("Assessment: " + (calculator.isAssessmentPassed() ? "Passed" : "Failed"));
        // Print the final result
        System.out.println(calculator.getResult());

        // Blank line

        // Close the Scanner
        sc.close();
    }
}