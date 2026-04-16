import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GradeReport {
    private ArrayList<Student> students;

    public GradeReport() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void displayTable() {
        System.out.println("\nIndex No.\tFinal Score\tGrade");
        System.out.println("-------------------------------------");
        for (Student s : students) {
            System.out.printf("%s\t\t%.2f\t\t%s\n", s.getIndexNumber(), s.getFinalMark(), s.getLetterGrade());
        }
    }

    public void displayStatistics() {
        if (students.isEmpty()) return;

        double total = 0, max = Double.MIN_VALUE, min = Double.MAX_VALUE;
        int[] counts = new int[6]; // A, B, C, D, E, F

        for (Student s : students) {
            double mark = s.getFinalMark();
            total += mark;
            if (mark > max) max = mark;
            if (mark < min) min = mark;

            String grade = s.getLetterGrade();
            if ("A".equals(grade)) counts[0]++;
            else if ("B".equals(grade)) counts[1]++;
            else if ("C".equals(grade)) counts[2]++;
            else if ("D".equals(grade)) counts[3]++;
            else if ("E".equals(grade)) counts[4]++;
            else if ("F".equals(grade)) counts[5]++;
        }

        System.out.printf("\nMax Score: %.2f | Min Score: %.2f | Average: %.2f\n", max, min, (total / students.size()));
        System.out.println("Frequency: A:" + counts[0] + ", B:" + counts[1] + ", C:" + counts[2] + ", D:" + counts[3] + ", E:" + counts[4] + ", F:" + counts[5]);
    }

    public void saveToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("grade_report.txt"))) {
            writer.write("Index No.\tFinal Score\tGrade\n");
            for (Student s : students) {
                writer.write(String.format("%s\t%.2f\t%s\n", s.getIndexNumber(), s.getFinalMark(), s.getLetterGrade()));
            }
            writer.write("\nReport successfully generated.");
            System.out.println("\nReport saved to grade_report.txt");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}