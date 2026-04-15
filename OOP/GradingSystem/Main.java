package OOP.GradingSystem;

import java.util.Scanner;

// Class representing the grading system with encapsulation
class GradingCalculator {
    // Private fields for exam score, assessment score, and fees paid
    private int examScore;
    private int assessmentScore;
    private double feesPaid;

    // Constructor to initialize the scores and fees
    public GradingCalculator(int exam, int assess, double fees) {
        this.examScore = exam;
        this.assessmentScore = assess;
        this.feesPaid = fees;
    }

    // Method to check if exam is passed
    public boolean isExamPassed() {
        return examScore >= 25;
    }

    // Method to check if assessment is passed
    public boolean isAssessmentPassed() {
        return assessmentScore >= 15;
    }

    // Method to check if student meets pass requirements
    public boolean meetsPassRequirements() {
        boolean req1 = isExamPassed() && isAssessmentPassed();
        boolean req2 = (examScore + assessmentScore == 39) &&
                       ((examScore == 25 && assessmentScore == 14) || (examScore == 24 && assessmentScore == 15));
        return req1 || req2;
    }

    // Method to determine if certificate is issued
    public boolean isCertificateIssued() {
        return meetsPassRequirements() && feesPaid == 100;
    }

    // Method to get the result message
    public String getResult() {
        if (isCertificateIssued()) return "Certificate Issued.";
        if (!isExamPassed() && !isAssessmentPassed()) return "Repeated.";
        return "Failed.";
    }
}

// Main class to run the grading system
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Exam Score: ");
        int exam = sc.nextInt();
        System.out.print("Enter Assessment Score: ");
        int assess = sc.nextInt();
        System.out.print("Enter Fees Paid: ");
        double fees = sc.nextDouble();

        // Create GradingCalculator instance
        GradingCalculator calculator = new GradingCalculator(exam, assess, fees);

        System.out.println("Exam: " + (calculator.isExamPassed() ? "Passed" : "Failed"));
        System.out.println("Assessment: " + (calculator.isAssessmentPassed() ? "Passed" : "Failed"));
        System.out.println(calculator.getResult());

        sc.close();
    }
}