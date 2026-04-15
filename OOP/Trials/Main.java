package OOP.Trials;

import java.util.*;

// Class representing a student
class Student {
    // Private fields for name, phone, rating
    private String name;
    private String phone;
    private int rating;

    // Constructor
    public Student(String name, String phone, int rating) {
        this.name = name;
        this.phone = phone;
        this.rating = rating;
    }

    // Getters
    public String getName() { return name; }
    public String getPhone() { return phone; }
    public int getRating() { return rating; }
}

// Class to manage students
class StudentManager {
    // List of students
    private List<Student> students = new ArrayList<>();
    // Map for rating frequencies
    private Map<Integer, Integer> ratingFreq = new HashMap<>();

    // Method to add a student
    public void addStudent(String name, String phone, int rating) {
        Student student = new Student(name, phone, rating);
        students.add(student);
        ratingFreq.put(rating, ratingFreq.getOrDefault(rating, 0) + 1);
    }

    // Method to get total students
    public int getTotalStudents() {
        return students.size();
    }

    // Method to get rating frequencies in descending order
    public Map<Integer, Integer> getRatingFrequencies() {
        return ratingFreq;
    }

    // Method to display student info
    public void displayStudents() {
        for (Student s : students) {
            System.out.println("Name: " + s.getName() + ", Phone: " + s.getPhone() + ", Rating: " + s.getRating());
        }
    }
}

// Main class to run the student entry system
public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter name (or 'z' to stop): ");
            String name = sc.nextLine();
            if (name.equals("z")) break;

            System.out.print("Enter phone: ");
            String phone = sc.nextLine();

            System.out.print("Enter rating (1-7): ");
            int rating = sc.nextInt();
            sc.nextLine(); // consume newline

            manager.addStudent(name, phone, rating);
        }

        System.out.println("Total students: " + manager.getTotalStudents());
        manager.displayStudents();

        System.out.println("Rating frequencies:");
        manager.getRatingFrequencies().entrySet().stream()
            .sorted(Map.Entry.<Integer, Integer>comparingByKey().reversed())
            .forEach(e -> System.out.println("Rating " + e.getKey() + ": " + e.getValue()));

        sc.close();
    }
}