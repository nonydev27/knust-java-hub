package Socials; // 1. Groups this file into the "Socials" package for organization

import java.util.*; // 2. Imports all utilities from java.util (Scanner, ArrayList, etc.)
import java.io.*; // 3. Imports file handling classes (BufferedWriter, FileWriter, IOException)

// --- 4. STUDENT CLASS - Blueprint for a single student object ---
class Student {
    private String indexNumber; // 4. Private field: stores student's ID (encapsulation)
    private double rawMidSem;   // 5. Private field: raw mid-semester score (0-100)
    private double rawExam;    // 6. Private field: raw exam score (0-100)

    // 7. CONSTRUCTOR: Special method to initialize a new Student object
    public Student(String indexNumber, double rawMidSem, double rawExam) {
        this.indexNumber = indexNumber; // 8. Assign parameter to instance field
        this.rawMidSem = rawMidSem;     // 9. Assign parameter to instance field
        this.rawExam = rawExam;         // 10. Assign parameter to instance field
    }

    // 11. METHOD: Calculates mid-sem score scaled to 30% weight
    public double getScaledMidSem() {
        return (rawMidSem / 100.0) * 30.0; // 12. Example: 80/100 * 30 = 24
    }

    // 13. METHOD: Calculates exam score scaled to 70% weight
    public double getScaledExam() {
        return (rawExam / 100.0) * 70.0; // 14. Example: 70/100 * 70 = 49
    }

    // 15. METHOD: Returns the total final mark (mid-sem + exam)
    public double getFinalMark() {
        return getScaledMidSem() + getScaledExam(); // 16. Adds both scaled scores
    }

    // 17. METHOD: Determines letter grade based on final mark
    public String getLetterGrade() {
        double mark = getFinalMark(); // 18. Get the final mark
        if (mark >= 70) return "A";   // 19. 70 and above = A
        else if (mark >= 60) return "B"; // 20. 60-69 = B
        else if (mark >= 50) return "C"; // 21. 50-59 = C
        else if (mark >= 45) return "D"; // 22. 45-49 = D
        else if (mark >= 40) return "E"; // 23. 40-44 = E
        else return "F";                // 24. Below 40 = F (fail)
    }

    // 25. GETTER: Public method to access private indexNumber (encapsulation)
    public String getIndexNumber() { return indexNumber; }
}

// --- 27. GRADE REPORT CLASS - Manages collection of students ---
class GradeReport {
    private ArrayList<Student> students; // 27. Private list to hold Student objects

    // 28. CONSTRUCTOR: Initializes empty ArrayList
    public GradeReport() {
        this.students = new ArrayList<>();
    }

    // 29. METHOD: Adds a student to the list
    public void addStudent(Student s) {
        students.add(s); // 30. ArrayList.add() appends student to collection
    }

    // 31. METHOD: Displays full report (table + statistics)
    public void displayFullReport() {
        // 32. Print table header with borders
        System.out.println("\n" + "=".repeat(40));
        System.out.printf("%-15s %-12s %-5s\n", "Index No.", "Final Score", "Grade");
        System.out.println("-".repeat(40));

        // 33. Loop through each student and print their data
        for (Student s : students) {
            System.out.printf("%-15s %-12.2f %-5s\n", 
                s.getIndexNumber(), s.getFinalMark(), s.getLetterGrade());
        }
        
        displayStatistics(); // 34. Call the statistics method
    }

    // 35. PRIVATE METHOD: Calculates and displays statistics
    private void displayStatistics() {
        if (students.isEmpty()) return; // 36. Exit if no students

        // 37. Initialize variables for calculations
        double total = 0, max = Double.MIN_VALUE, min = Double.MAX_VALUE;
        int[] freq = new int[6]; // 38. Array to count grades: [A,B,C,D,E,F]

        // 39. Loop through students to calculate stats
        for (Student s : students) {
            double mark = s.getFinalMark();
            total += mark; // 40. Add to total for average
            if (mark > max) max = mark; // 41. Update max if current mark is higher
            if (mark < min) min = mark; // 42. Update min if current mark is lower

            // 43. Count grade frequency using switch
            switch (s.getLetterGrade()) {
                case "A" -> freq[0]++; // 44. Increment A count
                case "B" -> freq[1]++; // 45. Increment B count
                case "C" -> freq[2]++; // 46. Increment C count
                case "D" -> freq[3]++; // 47. Increment D count
                case "E" -> freq[4]++; // 48. Increment E count
                case "F" -> freq[5]++; // 49. Increment F count
            }
        }

        // 50. Print statistics
        System.out.println("-".repeat(40));
        System.out.printf("Average Score: %.2f\n", (total / students.size()));
        System.out.printf("Highest Score: %.2f\n", max);
        System.out.printf("Lowest Score:  %.2f\n", min);
        System.out.println("-".repeat(40));
        System.out.println("Grade Frequency: [A:" + freq[0] + "] [B:" + freq[1] + "] [C:" + freq[2] + 
                           "] [D:" + freq[3] + "] [E:" + freq[4] + "] [F:" + freq[5] + "]");
    }

    // 51. METHOD: Saves report to a text file
    public void saveToFile() {
        // 52. Try-with-resources: automatically closes the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("grade_report.txt"))) {
            writer.write("Index No.\tFinal Score\tGrade\n"); // 53. Write header
            writer.write("-------------------------------------\n"); // 54. Write separator
            for (Student s : students) { // 55. Loop through students
                writer.write(String.format("%s\t%.2f\t%s\n", // 56. Format and write each line
                    s.getIndexNumber(), s.getFinalMark(), s.getLetterGrade()));
            }
            writer.write("\nFile generated successfully."); // 57. Success message
            System.out.println("\nSUCCESS: Report saved to grade_report.txt"); // 58. Notify user
        } catch (IOException e) { // 59. Catch file errors
            System.err.println("Error saving file: " + e.getMessage()); // 60. Print error
        }
    }
}

// --- 62. MAIN CLASS - Entry point of the program ---
public class GradeReportSystem {
    // 62. MAIN METHOD: Where program execution begins
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 63. Create Scanner for user input
        GradeReport report = new GradeReport(); // 64. Create GradeReport object

        System.out.println("KNUST Student Grade Management System"); // 65. Display title
        System.out.print("Enter number of students to process: "); // 66. Prompt user
        int numStudents = 0;
        
        // 67. VALIDATION LOOP: Ensure positive number of students
        while (numStudents <= 0) {
            try {
                numStudents = sc.nextInt(); // 68. Try to read integer
                if (numStudents <= 0) System.out.print("Please enter a positive number: "); // 69. Re-prompt if invalid
            } catch (InputMismatchException e) { // 70. Catch non-integer input
                System.out.print("Invalid input. Enter an integer: "); // 71. Show error
                sc.next(); // 72. Clear the invalid input from buffer
            }
        }

        // 73. LOOP: Get data for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\n--- Entering Data for Student " + (i + 1) + " ---");
            
            System.out.print("Index Number: "); // 74. Prompt for ID
            String id = sc.next(); // 75. Read index number

            // 76. Get valid scores using helper method
            double mid = getValidScore(sc, "Raw Mid-Sem Score (0-100): ");
            double exam = getValidScore(sc, "Raw Exam Score (0-100): ");

            // 77. Create Student object and add to report
            report.addStudent(new Student(id, mid, exam));
        }

        // 78. OUTPUT: Display and save the report
        report.displayFullReport();
        report.saveToFile();
        
        sc.close(); // 79. Close Scanner to prevent resource leak
    }

    // 80. HELPER METHOD: Gets valid score with error handling
    private static double getValidScore(Scanner sc, String prompt) {
        while (true) { // 81. Infinite loop until valid input
            try {
                System.out.print(prompt); // 82. Show prompt
                double score = sc.nextDouble(); // 83. Try to read double
                if (score < 0 || score > 100) { // 84. Validate range
                    System.out.println("Score must be between 0 and 100."); // 85. Error message
                    continue; // 86. Skip to next iteration
                }
                return score; // 87. Return valid score
            } catch (InputMismatchException e) { // 88. Catch non-number input
                System.out.println("Error: Please enter a valid numerical value."); // 89. Error message
                sc.nextLine(); // 90. Clear the scanner buffer
            }
        }
    }
}