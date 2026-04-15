package OOP.AverageTemperature;

// Class to analyze temperature sensor readings
class TemperatureAnalyzer {
    // Private field for temperatures array
    private double[] temperatures;

    // Constructor to set temperatures
    public TemperatureAnalyzer(double[] temps) {
        this.temperatures = temps;
    }

    // Method to calculate sum and count of valid sensors
    public double[] getValidSumAndCount() {
        double sum = 0.0;
        int count = 0;
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] <= 10.0) {
                sum += temperatures[i];
                count++;
            } else {
                System.out.printf("Sensor %d: %.1fC - ERROR: Reading Ignored%n", i, temperatures[i]);
            }
        }
        return new double[]{sum, count};
    }

    // Method to get average of valid sensors
    public double getAverage() {
        double[] result = getValidSumAndCount();
        return result[1] > 0 ? result[0] / result[1] : 0;
    }

    // Method to get count of valid sensors
    public int getValidCount() {
        return (int) getValidSumAndCount()[1];
    }
}

// Main class to run the temperature analysis
public class Main {
    public static void main(String[] args) {
        double[] temperature = {2.5, 3.0, 15.0, 4.2, -1.0, 22.0, 3.8, 5.0};
        TemperatureAnalyzer analyzer = new TemperatureAnalyzer(temperature);

        System.out.println("==========================================================");

        double average = analyzer.getAverage();
        int validCount = analyzer.getValidCount();

        System.out.println("Total Valid Sensors Found: " + validCount);
        System.out.println("Final Average Temperature: " + average);
    }
}