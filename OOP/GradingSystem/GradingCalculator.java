// Declare the package for this Java file to organize the code
package OOP.GradingSystem;

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