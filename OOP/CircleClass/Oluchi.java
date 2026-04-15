// Declare the package for this Java file to organize the code
package OOP.CircleClass;

// Blank line

// Import all classes from java.util package (though not strictly necessary here)
import java.util.*;

// Blank line

// Define the main public class named Oluchi to demonstrate Circle functionality
public class Oluchi {
    // Define the main method, the starting point of the Java application, taking an array of String arguments
    public static void main(String[] args) {
        // Create a new Scanner object to read input from the standard input stream
        Scanner input = new Scanner(System.in);

        // Blank line

        // Declare a double variable for radius
        double radius;

        // Blank line

        // Print a prompt message to the console asking the user to enter the radius
        System.out.println("Enter radius: ");
        // Read the next double value from the Scanner and assign it to radius
        radius = input.nextDouble();

        // Blank line

        // Create a new Circle object named oluchi with the provided radius value
        Circle oluchi = new Circle(radius);
        // Print the radius of the circle using the getRadius method
        System.out.println(oluchi.getRadius());

        // Blank line

        // Close the Scanner object to release system resources and prevent resource leaks
        input.close();
    }
}