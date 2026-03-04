import java.util.Scanner;

public class ElectricBillCalculator {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double COST_PER_KWH = 0.20;
        int n; //n = number of appliances
        double baseCost;
        double additionalCharge;
        double surcharge = 0.15;
        double totalBill = 0.0;
        double applianceConsumption;
        double totalConsumption = 0.0;
        double totalCost = 0.0;

        System.out.print("How many appliances do you use?: ");
        n = input.nextInt();

        System.out.println("Enter the consumption for each appliance below (kWh).");
        System.out.println(" ");

        for (int i = 1; i <= n; i++){
            System.out.print("Appliance " + i + ": ");
            applianceConsumption = input.nextDouble();

            baseCost = applianceConsumption * COST_PER_KWH;

            if (applianceConsumption > 100){
                additionalCharge = baseCost * surcharge;
            } else {
                additionalCharge = 0.0;
            }

            totalBill = baseCost + additionalCharge;
            totalCost += totalBill;
            totalConsumption += applianceConsumption;

            System.out.println("===================================================================================================================");
            System.out.printf("Appliance #" + i + " - " +
                    "Consumption: " + applianceConsumption +
                    " | Surcharge applied: " + additionalCharge +
                    " | Bill: %.2f\n", totalBill);
            System.out.println("===================================================================================================================");

        }
        System.out.println(" ");
        System.out.println("Total Consumption: " + totalConsumption + "kWh");
        System.out.printf("Total Cost: %.2f", totalCost);

    }
}
