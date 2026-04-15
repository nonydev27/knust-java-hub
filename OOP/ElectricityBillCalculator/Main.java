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

// Blank line

// Define a class named ElectricityBillCalculator to manage multiple appliances
class ElectricityBillCalculator {
    // Declare a private List of Appliance objects
    private List<Appliance> appliances = new ArrayList<>();

    // Blank line

    // Define a public method named addAppliance that takes kWh and adds a new Appliance
    public void addAppliance(double kwh) {
        // Create a new Appliance with the kWh and add to the list
        appliances.add(new Appliance(kwh));
    }

    // Blank line

    // Define a public method named getTotalConsumption that returns total kWh as double
    public double getTotalConsumption() {
        // Use stream to map to consumption and sum
        return appliances.stream().mapToDouble(Appliance::getConsumption).sum();
    }

    // Blank line

    // Define a public method named getTotalCost that returns total cost as double
    public double getTotalCost() {
        // Use stream to map to cost and sum
        return appliances.stream().mapToDouble(Appliance::getCost).sum();
    }

    // Blank line

    // Define a public method named printBill that prints the bill details
    public void printBill() {
        // Loop through each appliance in the list
        for (int i = 0; i < appliances.size(); i++) {
            // Get the appliance at index i
            Appliance a = appliances.get(i);
            // Determine if surcharge flag should be added
            String flag = a.hasSurcharge() ? "[SURCHARGE APPLIED]" : "";
            // Print formatted line for the appliance
            System.out.printf("Appliance %d: %.2f kWh, Cost: $%.2f %s\n", i + 1, a.getConsumption(), a.getCost(), flag);
        }
        // Print total consumption and cost
        System.out.printf("\nTotal Consumption: %.2f kWh\nTotal Cost: $%.2f\n", getTotalConsumption(), getTotalCost());
    }
}

// Blank line

// Define the main public class named Main, which contains the entry point of the program
public class Main {
    // Define the main method, the starting point of the Java application, taking an array of String arguments
    public static void main(String[] args) {
        // Create a new Scanner object for user input
        Scanner sc = new Scanner(System.in);
        // Create a new ElectricityBillCalculator object
        ElectricityBillCalculator calculator = new ElectricityBillCalculator();

        // Blank line

        // Print prompt for number of appliances
        System.out.print("Enter number of appliances: ");
        // Read the number as int
        int n = sc.nextInt();

        // Blank line

        // Loop from 1 to n to input each appliance
        for (int i = 1; i <= n; i++) {
            // Print prompt for kWh of appliance i
            System.out.print("kWh for appliance " + i + ": ");
            // Read the kWh as double
            double kwh = sc.nextDouble();
            // Add the appliance to the calculator
            calculator.addAppliance(kwh);
        }

        // Blank line

        // Print the bill
        calculator.printBill();
        // Close the Scanner
        sc.close();
    }
}