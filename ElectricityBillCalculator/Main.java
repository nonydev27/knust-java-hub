package ElectricityBillCalculator;

import java.util.Scanner;
public class Main {
    /*
A local utility company requires a Java program to help residents estimate their electricity bills based on individual appliance usage. 
You are tasked with developing the ElectricityBillCalculator class.

1. Constants & Inputs:
* Define a constant COST_PER_KWH with a value of 0.20.
* Prompt the user to input the total number of appliances (n).
* Use a for loop to collect the consumption (kWh) for each of the n appliances.

2. Conditional Logic (The Surcharge):
* Calculate the base cost for each appliance.
* If an appliance's consumption exceeds 100 kWh, apply a 15% surcharge to its calculated cost.

3. Data Accumulation & Output:
* For every appliance, print a detailed line showing the appliance number, the kWh used, and the final cost (clearly flagging if a surcharge was applied).
* Maintain a running total for both Total Consumption and Total Cost.
* Display the final totals after the loop finishes, formatted to 2 decimal places. */


    public static void main(String[] args) {
        final double COST_PER_KWH = 0.20;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of appliances: ");
        int n = sc.nextInt();

        double totalConsumption = 0, totalCost = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("kWh for appliance " + i + ": ");
            double kwh = sc.nextDouble();
            double cost = kwh * COST_PER_KWH;
            String flag = "";

            if (kwh > 100) {
                cost *= 1.15;
                flag = "[SURCHARGE APPLIED]";
            }

            System.out.printf("Appliance %d: %.2f kWh, Cost: $%.2f %s\n", i, kwh, cost, flag);
            totalConsumption += kwh;
            totalCost += cost;
        }

        System.out.printf("\nTotal Consumption: %.2f kWh\nTotal Cost: $%.2f\n", totalConsumption, totalCost);
    }
}


