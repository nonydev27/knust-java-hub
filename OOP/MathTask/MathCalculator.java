// Declare the package for this Java file to organize the code
package OOP.MathTask;

// Blank line

// Define a class named MathCalculator to perform mathematical calculations
class MathCalculator {
    // Declare a private int field for the number n
    private int n;

    // Blank line

    // Define a public constructor for MathCalculator that takes an int n
    public MathCalculator(int n) {
        // Assign the n parameter to the private field
        this.n = n;
    }

    // Blank line

    // Define a public method named calculateAverage that returns the average of numbers from 1 to n as double
    public double calculateAverage() {
        // Initialize sum to 0
        double sum = 0;
        // Loop from 1 to n and add to sum
        for (int i = 1; i <= n; i++) sum += i;
        // Return the average
        return sum / n;
    }

    // Blank line

    // Define a public method named calculateStandardDeviation that returns the SD as double
    public double calculateStandardDeviation() {
        // Get the average
        double avg = calculateAverage();
        // Initialize squared sum to 0
        double sqSum = 0;
        // Loop from 1 to n and add squared differences
        for (int i = 1; i <= n; i++) sqSum += Math.pow(i - avg, 2);
        // Return the square root of the average squared difference
        return Math.sqrt(sqSum / n);
    }

    // Blank line

    // Define a public method named calculateFactorialOfSD that returns factorial of integer SD as long
    public long calculateFactorialOfSD() {
        // Cast SD to int
        int sdInt = (int) calculateStandardDeviation();
        // Initialize factorial to 1
        long factorial = 1;
        // Loop from 1 to sdInt and multiply
        for (int i = 1; i <= sdInt; i++) factorial *= i;
        // Return the factorial
        return factorial;
    }
}