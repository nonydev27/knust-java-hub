// Declare the package for this Java file to organize the code
package OOP.Trials;

// Blank line

// Import all classes from the java.util package for collections and utilities
import java.util.*;

// Blank line

// Define a class named Student to represent a student with name, phone, and rating
class Student {
    // Declare a private String field for the student's name
    private String name;
    // Declare a private String field for the student's phone number
    private String phone;
    // Declare a private int field for the student's rating
    private int rating;

    // Blank line

    // Define a public constructor for Student that takes name, phone, and rating parameters
    public Student(String name, String phone, int rating) {
        // Assign the name parameter to the private field
        this.name = name;
        // Assign the phone parameter to the private field
        this.phone = phone;
        // Assign the rating parameter to the private field
        this.rating = rating;
    }

    // Blank line

    // Define a public getter method for the name
    public String getName() { return name; }
    // Define a public getter method for the phone
    public String getPhone() { return phone; }
    // Define a public getter method for the rating
    public int getRating() { return rating; }
}

// Blank line

// Define a class named StudentManager to handle a collection of students
class StudentManager {
    // Declare a private List of Student objects to store students
    private List<Student> students = new ArrayList<>();
    // Declare a private Map to store frequency of each rating
    private Map<Integer, Integer> ratingFreq = new HashMap<>();

    // Blank line

    // Define a public method named addStudent that takes name, phone, and rating to add a student
    public void addStudent(String name, String phone, int rating) {
        // Create a new Student object with the provided details
        Student student = new Student(name, phone, rating);
        // Add the student to the list
        students.add(student);
        // Update the rating frequency in the map
        ratingFreq.put(rating, ratingFreq.getOrDefault(rating, 0) + 1);
    }

    // Blank line

    // Define a public method named getTotalStudents that returns the total number of students as int
    public int getTotalStudents() {
        // Return the size of the students list
        return students.size();
    }

    // Blank line

    // Define a public method named getRatingFrequencies that returns the rating frequency map
    public Map<Integer, Integer> getRatingFrequencies() {
        // Return the rating frequency map
        return ratingFreq;
    }

    // Blank line

    // Define a public method named displayStudents that prints all student information
    public void displayStudents() {
        // Loop through each student in the list
        for (Student s : students) {
            // Print the student's name, phone, and rating
            System.out.println("Name: " + s.getName() + ", Phone: " + s.getPhone() + ", Rating: " + s.getRating());
        }
    }
}

// Blank line

// Define the main public class named Main, which contains the entry point of the program
public class Main {
    // Define the main method, the starting point of the Java application, taking an array of String arguments
    public static void main(String[] args) {
        // Create a new StudentManager object
        StudentManager manager = new StudentManager();
        // Create a new Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Blank line

        // Start an infinite while loop to input students until 'z' is entered
        while (true) {
            // Prompt user to enter name or 'z' to stop
            System.out.print("Enter name (or 'z' to stop): ");
            // Read the name input
            String name = sc.nextLine();
            // Check if name is 'z' to break the loop
            if (name.equals("z")) break;

            // Blank line

            // Prompt user to enter phone number
            System.out.print("Enter phone: ");
            // Read the phone input
            String phone = sc.nextLine();

            // Blank line

            // Prompt user to enter rating
            System.out.print("Enter rating (1-7): ");
            // Read the rating as int
            int rating = sc.nextInt();
            // Consume the newline left by nextInt
            sc.nextLine(); // consume newline

            // Blank line

            // Add the student to the manager
            manager.addStudent(name, phone, rating);
        }

        // Blank line

        // Print the total number of students
        System.out.println("Total students: " + manager.getTotalStudents());
        // Display all student information
        manager.displayStudents();

        // Blank line

        // Print the rating frequencies header
        System.out.println("Rating frequencies:");
        // Stream the map entries, sort by key in descending order, and print each
        manager.getRatingFrequencies().entrySet().stream()
            .sorted(Map.Entry.<Integer, Integer>comparingByKey().reversed())
            .forEach(e -> System.out.println("Rating " + e.getKey() + ": " + e.getValue()));

        // Blank line

        // Close the Scanner
        sc.close();
    }
}