class FuelConsumptionAnalysis {
    public static void main(String[] args) {
        int i = 0;
        int highCount = 0;
        int normalCount = 0;
        int lowCount = 0;
        String consumptionClass;
        double highestConsumption = 0.0 ;
        int highestConsumptionDay = 0;

        double totalFuelConsumption = 0.0;
        double averageConsumption = 0.0;
        double[] fuelConsumption = {12.5, 22.0, 8.4, 18.6, 25.3, 9.8, 15.0};

        while (i < fuelConsumption.length){
            if (fuelConsumption[i] > 20){
                consumptionClass = "High";
                highestConsumptionDay = (i+1);
                highestConsumption = fuelConsumption[i];
                highCount += 1;
            } else if ((fuelConsumption[i] >= 10) && (fuelConsumption[i] <= 20)) {
                consumptionClass = "Normal";
                normalCount += 1;
            } else {
                consumptionClass = "Low";
                lowCount += 1;
            }
            System.out.println(" ");
            System.out.println("Day: 0" + (i+1));
            System.out.printf("Fuel Consumption: %.2f", fuelConsumption[i]);
            System.out.println(" | Consumption Level: " + consumptionClass);

            totalFuelConsumption += fuelConsumption[i];
            averageConsumption = (totalFuelConsumption / fuelConsumption.length);

            i++;
        }
        System.out.println(" ");
        System.out.println("=================================================================");
        System.out.println("Highest Consumption Day: " + highestConsumptionDay);
        System.out.printf("Highest Fuel Consumption: %.2f\n", highestConsumption);
        System.out.println("=================================================================");
        System.out.printf("Total Fuel Consumption: %.2f\n", totalFuelConsumption);
        System.out.printf("Average Fuel Consumption: %.2f\n", averageConsumption);
        System.out.println("=================================================================");
    }
}
