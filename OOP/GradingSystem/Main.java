// Declare the package for this Java file to organize the code
package OOP.GradingSystem;

// Blank line

// Import the Scanner class from java.util package for user input
import java.util.Scanner;

// Blank line

// Define a class named GradingCalculator to handle grading calculations with encapsulation
class GradingCalculator {
    // Declare a private int field for the exam score
    private int examScore;
    // Declare a private int field for the assessment score
    private int assessmentScore;
    // Declare a private double field for the fees paid
    private double feesPaid;

    // Blank line

    // Define a public constructor for GradingCalculator that takes exam, assess, and fees parameters
    public GradingCalculator(int exam, int assess, double fees) {
        // Assign exam to examScore
        this.examScore = exam;
        // Assign assess to assessmentScore
        this.assessmentScore = assess;
        // Assign fees to feesPaid
        this.feesPaid = fees;
    }

    // Blank line

    // Define a public method named isExamPassed that returns true if exam score >= 25
    public boolean isExamPassed() {
        // Return true if examScore is at least 25
        return examScore >= 25;
    }

    // Blank line

    // Define a public method named isAssessmentPassed that returns true if assessment score >= 15
    public boolean isAssessmentPassed() {
        // Return true if assessmentScore is at least 15
        return assessmentScore >= 15;
    }

    // Blank line

    // Define a public method named meetsPassRequirements that checks complex pass conditions
    public boolean meetsPassRequirements() {
        // Check basic requirement: both exam and assessment passed
        boolean req1 = isExamPassed() && isAssessmentPassed();
        // Check special requirement: total 39 with specific combinations
        boolean req2 = (examScore + assessmentScore == 39) &&
                       ((examScore == 25 && assessmentScore == 14) || (examScore == 24 && assessmentScore == 15));
        // Return true if either requirement is met
        return req1 || req2;
    }

    // Blank line

    // Define a public method named isCertificateIssued that checks if certificate can be issued
    public boolean isCertificateIssued() {
        // Return true if pass requirements met and fees are exactly 100
        return meetsPassRequirements() && feesPaid == 100;
    }

    // Blank line

    // Define a public method named getResult that returns a String result message
    public String getResult() {
        // If certificate issued, return issued message
        if (isCertificateIssued()) return "Certificate Issued.";
        // If neither exam nor assessment passed, return repeated
        if (!isExamPassed() && !isAssessmentPassed()) return "Repeated.";
        // Otherwise, return failed
        return "Failed.";
    }
}

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