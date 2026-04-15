package OOP.FuelConsumptionAnalysis;

// Class to analyze fuel consumption
class FuelAnalyzer {
    // Private field for consumption array
    private double[] fuelConsumption;

    // Constructor
    public FuelAnalyzer(double[] consumption) {
        this.fuelConsumption = consumption;
    }

    // Method to categorize and count
    public int[] getCategoryCounts() {
        int high = 0, normal = 0, low = 0;
        for (double val : fuelConsumption) {
            if (val > 20) high++;
            else if (val >= 10) normal++;
            else low++;
        }
        return new int[]{high, normal, low};
    }

    // Method to get total consumption
    public double getTotalConsumption() {
        double sum = 0;
        for (double val : fuelConsumption) sum += val;
        return sum;
    }

    // Method to get average
    public double getAverageConsumption() {
        return getTotalConsumption() / fuelConsumption.length;
    }

    // Method to find peak day
    public int[] getPeakDay() {
        double peak = fuelConsumption[0];
        int day = 1;
        for (int i = 1; i < fuelConsumption.length; i++) {
            if (fuelConsumption[i] > peak) {
                peak = fuelConsumption[i];
                day = i + 1;
            }
        }
        return new int[]{day, (int) peak}; // approximate
    }

    // Method to print report
    public void printReport() {
        System.out.println("--- Daily Fuel Consumption Report ---");
        int[] counts = getCategoryCounts();
        int[] peak = getPeakDay();

        for (int i = 0; i < fuelConsumption.length; i++) {
            String category;
            double val = fuelConsumption[i];
            if (val > 20) category = "High";
            else if (val >= 10) category = "Normal";
            else category = "Low";
            System.out.printf("Day %d: %.2f liters (%s)%n", (i + 1), val, category);
        }

        System.out.println("\n--- Weekly Summary ---");
        System.out.printf("Total Consumption:   %.2f liters%n", getTotalConsumption());
        System.out.printf("Average Consumption: %.2f liters%n", getAverageConsumption());
        System.out.println("-----------------------");
        System.out.println("Category Counts:");
        System.out.println("  High:   " + counts[0]);
        System.out.println("  Normal: " + counts[1]);
        System.out.println("  Low:    " + counts[2]);
        System.out.println("-----------------------");
        System.out.printf("Peak Consumption: Day %d (%.2f liters)%n", peak[0], (double) peak[1]);
    }
}

// Main class to run the analysis
public class Main {
    public static void main(String[] args) {
        double[] fuelConsumption = {12.5, 22.0, 8.4, 18.6, 25.3, 9.8, 15.0};
        FuelAnalyzer analyzer = new FuelAnalyzer(fuelConsumption);
        analyzer.printReport();
    }
}