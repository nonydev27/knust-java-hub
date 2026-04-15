// Declare the package for this Java file to organize the code
package OOP.FuelConsumptionAnalysis;

// Blank line

// Define a class named FuelAnalyzer to handle fuel consumption analysis
class FuelAnalyzer {
    // Declare a private field of type double array to store the fuel consumption values
    private double[] fuelConsumption;

    // Blank line

    // Define a public constructor for FuelAnalyzer that takes a double array parameter for consumption
    public FuelAnalyzer(double[] consumption) {
        // Assign the passed consumption array to the private fuelConsumption field
        this.fuelConsumption = consumption;
    }

    // Blank line

    // Define a public method named getCategoryCounts that returns an int array with counts of high, normal, low consumption
    public int[] getCategoryCounts() {
        // Initialize counters for high, normal, and low categories
        int high = 0, normal = 0, low = 0;
        // Loop through each value in the fuelConsumption array
        for (double val : fuelConsumption) {
            // Check if value is greater than 20 for high category
            if (val > 20) high++;
            // Check if value is between 10 and 20 for normal category
            else if (val >= 10) normal++;
            // Otherwise, categorize as low
            else low++;
        }
        // Return an array with the counts
        return new int[]{high, normal, low};
    }

    // Blank line

    // Define a public method named getTotalConsumption that returns the sum of all fuel consumption as a double
    public double getTotalConsumption() {
        // Initialize a sum variable to accumulate the total
        double sum = 0;
        // Loop through each value in the fuelConsumption array and add to sum
        for (double val : fuelConsumption) sum += val;
        // Return the calculated sum
        return sum;
    }

    // Blank line

    // Define a public method named getAverageConsumption that returns the average fuel consumption as a double
    public double getAverageConsumption() {
        // Calculate and return the average by dividing total consumption by the number of elements
        return getTotalConsumption() / fuelConsumption.length;
    }

    // Blank line

    // Define a public method named getPeakDay that returns an int array with the day and peak consumption
    public int[] getPeakDay() {
        // Initialize peak with the first element and day as 1
        double peak = fuelConsumption[0];
        int day = 1;
        // Loop through the array starting from index 1
        for (int i = 1; i < fuelConsumption.length; i++) {
            // Check if current value is greater than current peak
            if (fuelConsumption[i] > peak) {
                // Update peak to current value
                peak = fuelConsumption[i];
                // Update day to current index + 1
                day = i + 1;
            }
        }
        // Return an array with day and casted peak value
        return new int[]{day, (int) peak}; // approximate
    }

    // Blank line

    // Define a public method named printReport that prints the fuel consumption report to the console
    public void printReport() {
        // Print the report header
        System.out.println("--- Daily Fuel Consumption Report ---");
        // Get the category counts
        int[] counts = getCategoryCounts();
        // Get the peak day information
        int[] peak = getPeakDay();

        // Blank line

        // Loop through each day to print daily consumption and category
        for (int i = 0; i < fuelConsumption.length; i++) {
            // Declare a variable for category
            String category;
            // Get the consumption value for the day
            double val = fuelConsumption[i];
            // Determine the category based on value
            if (val > 20) category = "High";
            else if (val >= 10) category = "Normal";
            else category = "Low";
            // Print the formatted daily report
            System.out.printf("Day %d: %.2f liters (%s)%n", (i + 1), val, category);
        }

        // Blank line

        // Print the weekly summary header
        System.out.println("\n--- Weekly Summary ---");
        // Print total consumption
        System.out.printf("Total Consumption:   %.2f liters%n", getTotalConsumption());
        // Print average consumption
        System.out.printf("Average Consumption: %.2f liters%n", getAverageConsumption());
        // Print separator
        System.out.println("-----------------------");
        // Print category counts header
        System.out.println("Category Counts:");
        // Print high count
        System.out.println("  High:   " + counts[0]);
        // Print normal count
        System.out.println("  Normal: " + counts[1]);
        // Print low count
        System.out.println("  Low:    " + counts[2]);
        // Print separator
        System.out.println("-----------------------");
        // Print peak consumption
        System.out.printf("Peak Consumption: Day %d (%.2f liters)%n", peak[0], (double) peak[1]);
    }
}

// Blank line

// Define the main public class named Main, which contains the entry point of the program
public class Main {
    // Define the main method, the starting point of the Java application, taking an array of String arguments
    public static void main(String[] args) {
        // Declare and initialize an array of double values representing daily fuel consumption
        double[] fuelConsumption = {12.5, 22.0, 8.4, 18.6, 25.3, 9.8, 15.0};
        // Create a new FuelAnalyzer object with the fuel consumption array
        FuelAnalyzer analyzer = new FuelAnalyzer(fuelConsumption);
        // Call the printReport method to display the analysis
        analyzer.printReport();
    }
}