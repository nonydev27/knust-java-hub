// Declare the package for this Java file to organize the code
package OOP.ElectricityBillCalculator;

// Blank line

// Import ArrayList and List from java.util for collections
import java.util.ArrayList;
// Import List from java.util
import java.util.List;
// Import Scanner from java.util for input
import java.util.Scanner;

// Blank line

// Define a class named Appliance to represent an electrical appliance
class Appliance {
    // Declare a private double field for the consumption in kWh
    private double consumption;
    // Declare a private final double constant for cost per kWh
    private final double COST_PER_KWH = 0.20;

    // Blank line

    // Define a public constructor for Appliance that takes consumption in kWh
    public Appliance(double kwh) {
        // Assign the kwh parameter to the consumption field
        this.consumption = kwh;
    }

    // Blank line

    // Define a public getter method for consumption
    public double getConsumption() {
        // Return the consumption field
        return consumption;
    }

    // Blank line

    // Define a public method named getCost that calculates and returns the cost as double
    public double getCost() {
        // Calculate base cost by multiplying consumption by cost per kWh
        double cost = consumption * COST_PER_KWH;
        // Check if consumption exceeds 100 for surcharge
        if (consumption > 100) {
            // Apply 15% surcharge by multiplying by 1.15
            cost *= 1.15; // Apply 15% surcharge
        }
        // Return the calculated cost
        return cost;
    }

    // Blank line

    // Define a public method named hasSurcharge that returns true if surcharge applies
    public boolean hasSurcharge() {
        // Return true if consumption is greater than 100
        return consumption > 100;
    }
}