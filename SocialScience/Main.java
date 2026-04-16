import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GradeReport report = new GradeReport();

        System.out.print("Enter number of students: ");
        int count;
        try {
            count = sc.nextInt();
            if (count <= 0) {
                System.out.println("Number of students must be a positive integer.");
                sc.close();
                return;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a positive integer for number of students.");
            sc.close();
            return;
        }

        for (int i = 0; i < count; i++) {
            while (true) {
                try {
                    System.out.println("\nStudent " + (i + 1));
                    System.out.print("Index Number: ");
                    String id = sc.nextLine();
                    if (id.trim().isEmpty()) {
                        System.out.println("Index number cannot be empty.");
                        continue;
                    }
                    System.out.print("Raw Mid-Sem (0-100): ");
                    double mid = sc.nextDouble();
                    System.out.print("Raw Exam (0-100): ");
                    double exam = sc.nextDouble();

                    if (mid < 0 || mid > 100 || exam < 0 || exam > 100) {
                        System.out.println("Scores must be between 0 and 100.");
                        sc.nextLine(); // Clear buffer
                        continue;
                    }

                    report.addStudent(new Student(id, mid, exam));
                    break; // Exit loop if input is valid
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter numbers for scores.");
                    sc.nextLine(); // Clear buffer
                }
            }
        }

        report.displayTable();
        report.displayStatistics();
        report.saveToFile();
        sc.close();
    }
}