// Declare the package for this Java file to organize the code
package OOP.ElectricityBillCalculator;

// Blank line

// Import ArrayList and List from java.util for collections
import java.util.ArrayList;
// Import List from java.util
import java.util.List;
// Import Scanner from java.util for input
import java.util.Scanner;

// Blank line

// Define the main public class named Main, which contains the entry point of the program
public class Main {
    // Define the main method, the starting point of the Java application, taking an array of String arguments
    public static void main(String[] args) {
        // Create a new Scanner object for user input
        Scanner sc = new Scanner(System.in);
        // Create a new ElectricityBillCalculator object
        ElectricityBillCalculator calculator = new ElectricityBillCalculator();

        // Blank line

        // Print prompt for number of appliances
        System.out.print("Enter number of appliances: ");
        // Read the number as int
        int n = sc.nextInt();

        // Blank line

        // Loop from 1 to n to input each appliance
        for (int i = 1; i <= n; i++) {
            // Print prompt for kWh of appliance i
            System.out.print("kWh for appliance " + i + ": ");
            // Read the kWh as double
            double kwh = sc.nextDouble();
            // Add the appliance to the calculator
            calculator.addAppliance(kwh);
        }

        // Blank line

        // Print the bill
        calculator.printBill();
        // Close the Scanner
        sc.close();
    }
}