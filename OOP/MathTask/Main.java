package OOP.MathTask;

// Class to perform mathematical calculations on a range of numbers
class MathCalculator {
    // Private field for the number n
    private int n;

    // Constructor to set n
    public MathCalculator(int n) {
        this.n = n;
    }

    // Method to calculate average
    public double calculateAverage() {
        double sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum / n;
    }

    // Method to calculate standard deviation
    public double calculateStandardDeviation() {
        double avg = calculateAverage();
        double sqSum = 0;
        for (int i = 1; i <= n; i++) sqSum += Math.pow(i - avg, 2);
        return Math.sqrt(sqSum / n);
    }

    // Method to calculate factorial of (int)SD
    public long calculateFactorialOfSD() {
        int sdInt = (int) calculateStandardDeviation();
        long factorial = 1;
        for (int i = 1; i <= sdInt; i++) factorial *= i;
        return factorial;
    }
}

// Main class to run the math task
public class Main {
    public static void main(String[] args) {
        MathCalculator calculator = new MathCalculator(10);

        double avg = calculator.calculateAverage();
        double sd = calculator.calculateStandardDeviation();
        long factorial = calculator.calculateFactorialOfSD();

        System.out.println("Average: " + avg);
        System.out.println("SD: " + sd);
        System.out.println("Factorial of (int)SD: " + factorial);
    }
}