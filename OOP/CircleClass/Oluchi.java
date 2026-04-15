package OOP.CircleClass;

import java.util.*;

// Main class to demonstrate the Circle class functionality
public class Oluchi {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        double radius;

        // Prompt user to enter the radius
        System.out.println("Enter radius: ");
        radius = input.nextDouble();

        // Create a Circle object with the provided radius
        Circle oluchi = new Circle(radius);
        // Print the radius using the getter method
        System.out.println(oluchi.getRadius());

        // Close the scanner to free resources
        input.close();
    }
}