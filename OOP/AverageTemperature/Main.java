// Declare the package for this Java file to organize the code
package OOP.AverageTemperature;

// Blank line

// Define a class named TemperatureAnalyzer to handle temperature sensor data analysis
class TemperatureAnalyzer {
    // Declare a private double array to store temperature readings
    private double[] temperatures;

    // Blank line

    // Define a public constructor for TemperatureAnalyzer that takes a double array of temperatures
    public TemperatureAnalyzer(double[] temps) {
        // Assign the temps array to the private temperatures field
        this.temperatures = temps;
    }

    // Blank line

    // Define a public method named getValidSumAndCount that returns an array with sum and count of valid temperatures
    public double[] getValidSumAndCount() {
        // Initialize sum to 0.0
        double sum = 0.0;
        // Initialize count to 0
        int count = 0;
        // Loop through each temperature in the array
        for (int i = 0; i < temperatures.length; i++) {
            // Check if temperature is valid (less than or equal to 10.0)
            if (temperatures[i] <= 10.0) {
                // Add to sum if valid
                sum += temperatures[i];
                // Increment count
                count++;
            } else {
                // Print error message for invalid reading
                System.out.printf("Sensor %d: %.1fC - ERROR: Reading Ignored%n", i, temperatures[i]);
            }
        }
        // Return an array with sum and count
        return new double[]{sum, count};
    }

    // Blank line

    // Define a public method named getAverage that returns the average of valid temperatures as double
    public double getAverage() {
        // Get the sum and count from the helper method
        double[] result = getValidSumAndCount();
        // Calculate average if count > 0, otherwise return 0
        return result[1] > 0 ? result[0] / result[1] : 0;
    }

    // Blank line

    // Define a public method named getValidCount that returns the count of valid sensors as int
    public int getValidCount() {
        // Return the count from the helper method, cast to int
        return (int) getValidSumAndCount()[1];
    }
}

// Blank line

// Define the main public class named Main, which contains the entry point of the program
public class Main {
    // Define the main method, the starting point of the Java application, taking an array of String arguments
    public static void main(String[] args) {
        // Declare and initialize an array of double for temperature readings
        double[] temperature = {2.5, 3.0, 15.0, 4.2, -1.0, 22.0, 3.8, 5.0};
        // Create a new TemperatureAnalyzer object with the temperature array
        TemperatureAnalyzer analyzer = new TemperatureAnalyzer(temperature);

        // Blank line

        // Print a separator line
        System.out.println("==========================================================");

        // Blank line

        // Get the average temperature
        double average = analyzer.getAverage();
        // Get the count of valid sensors
        int validCount = analyzer.getValidCount();

        // Blank line

        // Print the total valid sensors found
        System.out.println("Total Valid Sensors Found: " + validCount);
        // Print the final average temperature
        System.out.println("Final Average Temperature: " + average);
    }
}