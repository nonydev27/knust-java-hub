// Declare the package for this Java file to organize the code
package OOP.SocialScience;

// Blank line

// Import all classes from the java.util package for collections and utilities
import java.util.*;

// Blank line

// Define a class named GradeCalculator to handle student grading calculations
class GradeCalculator {
    // Declare a private array of int to store midsemester scores
    private int[] midsemScores;
    // Declare a private array of int to store exam scores
    private int[] examScores;

    // Blank line

    // Define a public constructor for GradeCalculator that takes two int arrays for midsem and exam scores
    public GradeCalculator(int[] midsem, int[] exams) {
        // Assign the midsem array to the private field
        this.midsemScores = midsem;
        // Assign the exams array to the private field
        this.examScores = exams;
    }

    // Blank line

    // Define a public method named getFinalScores that returns an array of double representing final scores
    public double[] getFinalScores() {
        // Initialize a double array for final scores with the same length as midsemScores
        double[] finals = new double[midsemScores.length];
        // Loop through each index to calculate final score
        for (int i = 0; i < finals.length; i++) {
            // Calculate final score as 30% midsem + 70% exam
            finals[i] = (midsemScores[i] * 0.3) + (examScores[i] * 0.7);
        }
        // Return the final scores array
        return finals;
    }

    // Blank line

    // Define a public method named getGrade that takes a double score and returns the corresponding grade as String
    public String getGrade(double score) {
        // Check if score is 80 or above for grade A
        if (score >= 80) return "A";
        // Check if score is 70 or above for grade B
        if (score >= 70) return "B";
        // Check if score is 60 or above for grade C
        if (score >= 60) return "C";
        // Check if score is 50 or above for grade D
        if (score >= 50) return "D";
        // Otherwise, return grade F
        return "F";
    }

    // Blank line

    // Define a public method named getGrades that returns an array of String with grades for all students
    public String[] getGrades() {
        // Get the final scores
        double[] finals = getFinalScores();
        // Initialize a String array for grades
        String[] grades = new String[finals.length];
        // Loop through each final score to get the grade
        for (int i = 0; i < grades.length; i++) {
            // Assign the grade for each student
            grades[i] = getGrade(finals[i]);
        }
        // Return the grades array
        return grades;
    }

    // Blank line

    // Define a public method named getGradeFrequencies that returns a Map of grade frequencies
    public Map<String, Integer> getGradeFrequencies() {
        // Get the grades array
        String[] grades = getGrades();
        // Initialize a HashMap for frequency count
        Map<String, Integer> freq = new HashMap<>();
        // Loop through each grade
        for (String g : grades) {
            // Put or update the frequency in the map
            freq.put(g, freq.getOrDefault(g, 0) + 1);
        }
        // Return the frequency map
        return freq;
    }

    // Blank line

    // Define a public method named getAverageScore that returns the average final score as double
    public double getAverageScore() {
        // Get the final scores
        double[] finals = getFinalScores();
        // Initialize sum variable
        double sum = 0;
        // Loop through finals to sum them
        for (double s : finals) sum += s;
        // Return the average
        return sum / finals.length;
    }

    // Blank line

    // Define a public method named getMaxMin that returns an array with max and min final scores
    public double[] getMaxMin() {
        // Get the final scores
        double[] finals = getFinalScores();
        // Initialize max and min with the first element
        double max = finals[0], min = finals[0];
        // Loop through finals to find max and min
        for (double s : finals) {
            // Update max if current is larger
            if (s > max) max = s;
            // Update min if current is smaller
            if (s < min) min = s;
        }
        // Return array with max and min
        return new double[]{max, min};
    }
}

// Blank line

// Define the main public class named Main, which contains the entry point of the program
public class Main {
    // Define the main method, the starting point of the Java application, taking an array of String arguments
    public static void main(String[] args) {
        // Print the system header
        System.out.println("===== STUDENT GRADING SYSTEM =====");

        // Blank line

        // Declare and initialize an array of int for midsemester scores
        int[] midsemScores = {65, 48, 22, 32, 80, 12, 45, 25, 33, 67, 23, 45, 56, 34, 81};
        // Declare and initialize an array of int for exam scores
        int[] examScores = {78, 54, 90, 32, 66, 60, 48, 65, 45, 56, 33, 45, 67, 90, 67};

        // Blank line

        // Create a new GradeCalculator object with the score arrays
        GradeCalculator calculator = new GradeCalculator(midsemScores, examScores);

        // Blank line

        // Get the final scores from the calculator
        double[] finals = calculator.getFinalScores();
        // Get the grades from the calculator
        String[] grades = calculator.getGrades();

        // Blank line

        // Loop through each student to print their final score and grade
        for (int i = 0; i < finals.length; i++) {
            // Print the student number, final score, and grade
            System.out.println("Student " + (i+1) + ": Final Score: " + finals[i] + ", Grade: " + grades[i]);
        }

        // Blank line

        // Print the grade frequencies
        System.out.println("Grade Frequencies: " + calculator.getGradeFrequencies());
        // Print the average score
        System.out.println("Average Score: " + calculator.getAverageScore());
        // Get max and min scores
        double[] maxMin = calculator.getMaxMin();
        // Print maximum and minimum scores
        System.out.println("Maximum Score: " + maxMin[0] + ", Minimum Score: " + maxMin[1]);
    }
}