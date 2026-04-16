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