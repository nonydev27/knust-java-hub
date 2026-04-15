package OOP.ElectricityBillCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Class representing an appliance with consumption and cost calculation
class Appliance {
    // Private field for consumption
    private double consumption;
    // Constant cost per kWh
    private final double COST_PER_KWH = 0.20;

    // Constructor to initialize consumption
    public Appliance(double kwh) {
        this.consumption = kwh;
    }

    // Getter for consumption
    public double getConsumption() {
        return consumption;
    }

    // Method to calculate cost with surcharge if applicable
    public double getCost() {
        double cost = consumption * COST_PER_KWH;
        if (consumption > 100) {
            cost *= 1.15; // Apply 15% surcharge
        }
        return cost;
    }

    // Method to check if surcharge is applied
    public boolean hasSurcharge() {
        return consumption > 100;
    }
}

// Class to manage the electricity bill calculation for multiple appliances
class ElectricityBillCalculator {
    // List to hold appliances
    private List<Appliance> appliances = new ArrayList<>();

    // Method to add an appliance
    public void addAppliance(double kwh) {
        appliances.add(new Appliance(kwh));
    }

    // Method to get total consumption
    public double getTotalConsumption() {
        return appliances.stream().mapToDouble(Appliance::getConsumption).sum();
    }

    // Method to get total cost
    public double getTotalCost() {
        return appliances.stream().mapToDouble(Appliance::getCost).sum();
    }

    // Method to print the bill details
    public void printBill() {
        for (int i = 0; i < appliances.size(); i++) {
            Appliance a = appliances.get(i);
            String flag = a.hasSurcharge() ? "[SURCHARGE APPLIED]" : "";
            System.out.printf("Appliance %d: %.2f kWh, Cost: $%.2f %s\n", i + 1, a.getConsumption(), a.getCost(), flag);
        }
        System.out.printf("\nTotal Consumption: %.2f kWh\nTotal Cost: $%.2f\n", getTotalConsumption(), getTotalCost());
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ElectricityBillCalculator calculator = new ElectricityBillCalculator();

        System.out.print("Enter number of appliances: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("kWh for appliance " + i + ": ");
            double kwh = sc.nextDouble();
            calculator.addAppliance(kwh);
        }

        calculator.printBill();
        sc.close();
    }
}