package OOP.SocialScience;

import java.util.*;

// Class to handle student grading
class GradeCalculator {
    // Private arrays for scores
    private int[] midsemScores;
    private int[] examScores;

    // Constructor
    public GradeCalculator(int[] midsem, int[] exams) {
        this.midsemScores = midsem;
        this.examScores = exams;
    }

    // Method to calculate final scores
    public double[] getFinalScores() {
        double[] finals = new double[midsemScores.length];
        for (int i = 0; i < finals.length; i++) {
            finals[i] = (midsemScores[i] * 0.3) + (examScores[i] * 0.7);
        }
        return finals;
    }

    // Method to get grade for a score
    public String getGrade(double score) {
        if (score >= 80) return "A";
        if (score >= 70) return "B";
        if (score >= 60) return "C";
        if (score >= 50) return "D";
        return "F";
    }

    // Method to get all grades
    public String[] getGrades() {
        double[] finals = getFinalScores();
        String[] grades = new String[finals.length];
        for (int i = 0; i < grades.length; i++) {
            grades[i] = getGrade(finals[i]);
        }
        return grades;
    }

    // Method to get grade frequencies
    public Map<String, Integer> getGradeFrequencies() {
        String[] grades = getGrades();
        Map<String, Integer> freq = new HashMap<>();
        for (String g : grades) {
            freq.put(g, freq.getOrDefault(g, 0) + 1);
        }
        return freq;
    }

    // Method to get average score
    public double getAverageScore() {
        double[] finals = getFinalScores();
        double sum = 0;
        for (double s : finals) sum += s;
        return sum / finals.length;
    }

    // Method to get max and min
    public double[] getMaxMin() {
        double[] finals = getFinalScores();
        double max = finals[0], min = finals[0];
        for (double s : finals) {
            if (s > max) max = s;
            if (s < min) min = s;
        }
        return new double[]{max, min};
    }
}

// Main class to run the grading system
public class Main {
    public static void main(String[] args) {
        System.out.println("===== STUDENT GRADING SYSTEM =====");

        int[] midsemScores = {65, 48, 22, 32, 80, 12, 45, 25, 33, 67, 23, 45, 56, 34, 81};
        int[] examScores = {78, 54, 90, 32, 66, 60, 48, 65, 45, 56, 33, 45, 67, 90, 67};

        GradeCalculator calculator = new GradeCalculator(midsemScores, examScores);

        double[] finals = calculator.getFinalScores();
        String[] grades = calculator.getGrades();

        for (int i = 0; i < finals.length; i++) {
            System.out.println("Student " + (i+1) + ": Final Score: " + finals[i] + ", Grade: " + grades[i]);
        }

        System.out.println("Grade Frequencies: " + calculator.getGradeFrequencies());
        System.out.println("Average Score: " + calculator.getAverageScore());
        double[] maxMin = calculator.getMaxMin();
        System.out.println("Maximum Score: " + maxMin[0] + ", Minimum Score: " + maxMin[1]);
    }
}