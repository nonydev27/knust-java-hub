// Declare the package for this Java file to organize the code
package OOP.MaterialTesting;

// Blank line

// Import the Scanner class from java.util package for user input
import java.util.Scanner;

// Blank line

// Define a class named Material to represent a building material under testing
class Material {
    // Declare a private double field for the current structural integrity
    private double structuralIntegrity;
    // Declare a private final double constant for the failure threshold
    private final double FAILURE_THRESHOLD = 15.0;

    // Blank line

    // Define a public default constructor for Material that initializes integrity to 100.0
    public Material() {
        // Set initial structural integrity to 100.0
        this.structuralIntegrity = 100.0;
    }

    // Blank line

    // Define a public method named applyPressure that takes a pressure force and updates integrity
    public void applyPressure(double pressureForce) {
        // Subtract the pressure force from structural integrity
        structuralIntegrity -= pressureForce;
        // Check if pressure force is greater than 20.0 for extra damage
        if (pressureForce > 20.0) {
            // Subtract additional 5.0 for fatigue damage
            structuralIntegrity -= 5.0; // Extra fatigue damage
        }
    }

    // Blank line

    // Define a public method named hasFailed that returns true if integrity is below threshold
    public boolean hasFailed() {
        // Return true if structural integrity is less than or equal to failure threshold
        return structuralIntegrity <= FAILURE_THRESHOLD;
    }

    // Blank line

    // Define a public getter method for the current structural integrity
    public double getIntegrity() {
        // Return the value of structural integrity
        return structuralIntegrity;
    }
}

// Blank line

// Define the main public class named Main, which contains the entry point of the program
public class Main {
    // Define the main method, the starting point of the Java application, taking an array of String arguments
    public static void main(String[] args) {
        // Create a new Material object
        Material material = new Material();
        // Initialize cycle count to 0
        int cycleCount = 0;

        // Blank line

        // Create a new Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Blank line

        // Start a while loop that continues until the material fails
        while (!material.hasFailed()) {
            // Print prompt for pressure force for the current cycle
            System.out.println("Enter pressure force for Cycle " + (cycleCount + 1));
            // Read the pressure force as double
            double pressureForce = input.nextDouble();
            // Apply the pressure to the material
            material.applyPressure(pressureForce);

            // Blank line

            // Print the remaining integrity
            System.out.println("Remaining Integrity: " + material.getIntegrity());
            // Increment the cycle count
            cycleCount++;
        }

        // Blank line

        // Print a blank line
        System.out.println();
        // Print the failure message with cycle count
        System.out.println("Material Failure at Cycle " + cycleCount);
        // Print the final integrity level
        System.out.println("Final Integrity Level: " + material.getIntegrity());

        // Blank line

        // Close the Scanner to free resources
        input.close();
    }
}