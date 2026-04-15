package OOP.MaterialTesting;

import java.util.Scanner;

// Class representing the building material under test
class Material {
    // Private field for structural integrity
    private double structuralIntegrity;
    // Constant for failure threshold
    private final double FAILURE_THRESHOLD = 15.0;

    // Constructor to initialize integrity
    public Material() {
        this.structuralIntegrity = 100.0;
    }

    // Method to apply pressure and update integrity
    public void applyPressure(double pressureForce) {
        structuralIntegrity -= pressureForce;
        if (pressureForce > 20.0) {
            structuralIntegrity -= 5.0; // Extra fatigue damage
        }
    }

    // Method to check if material has failed
    public boolean hasFailed() {
        return structuralIntegrity <= FAILURE_THRESHOLD;
    }

    // Getter for current integrity
    public double getIntegrity() {
        return structuralIntegrity;
    }
}

// Main class to simulate the material testing
public class Main {
    public static void main(String[] args) {
        Material material = new Material();
        int cycleCount = 0;

        Scanner input = new Scanner(System.in);

        while (!material.hasFailed()) {
            System.out.println("Enter pressure force for Cycle " + (cycleCount + 1));
            double pressureForce = input.nextDouble();
            material.applyPressure(pressureForce);

            System.out.println("Remaining Integrity: " + material.getIntegrity());
            cycleCount++;
        }

        System.out.println();
        System.out.println("Material Failure at Cycle " + cycleCount);
        System.out.println("Final Integrity Level: " + material.getIntegrity());

        input.close();
    }
}