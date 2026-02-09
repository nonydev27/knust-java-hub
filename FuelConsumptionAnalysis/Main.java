/* * PROJECT REQUIREMENTS:
 * 1. Initialize an array: {12.5, 22.0, 8.4, 18.6, 25.3, 9.8, 15.0}
 * 2. Use a 'while' loop with a manual index pointer.
 * 3. Categorize: High (>20), Normal (10-20), Low (<10).
 * 4. Calculate Total, Average, Category Counts, and find the Peak Day.
 * 5. Format all decimals to 2 places using printf.
 */

package FuelConsumptionAnalysis;

public class Main {
    public static void main(String[] args) {
        
        // --- 1. DATA SETUP ---
        // An array of doubles representing 7 days of fuel usage
        double[] fuelConsumption = {12.5, 22.0, 8.4, 18.6, 25.3, 9.8, 15.0};
        
        // Stores the running sum of all fuel used
        double totalConsumption = 0; 
        
        // Counters for our three categories
        int highCount = 0;
        int normalCount = 0;
        int lowCount = 0;
        
        // Tracking the highest usage; we start by assuming Day 1 (index 0) is the highest
        double peakAmount = fuelConsumption[0];
        int peakDay = 1;

        // --- 2. ITERATIVE REQUIREMENTS ---
        // Manual index pointer starting at the first element (0)
        int i = 0; 
        
        System.out.println("--- Daily Fuel Consumption Report ---");
        
        // Loop runs as long as the index is less than the total number of items (7)
        while (i < fuelConsumption.length) {
            
            // Temporary variable to hold the value of the current day for easier reading
            double currentVal = fuelConsumption[i];
            
            // Add the current day's fuel to the running total
            totalConsumption += currentVal;

            // --- 3. CLASSIFICATION LOGIC ---
            String category; // Variable to store the text label for the category
            
            if (currentVal > 20) {
                category = "High";
                highCount++; // Increment the High counter
            } else if (currentVal >= 10) {
                // If it wasn't > 20, but it is >= 10, it must be Normal (10 to 20)
                category = "Normal";
                normalCount++; // Increment the Normal counter
            } else {
                // Anything else (less than 10) falls here
                category = "Low";
                lowCount++; // Increment the Low counter
            }

            // --- 4. PEAK CONSUMPTION LOGIC ---
            // If the current day's value is higher than our recorded peak, update the peak
            if (currentVal > peakAmount) {
                peakAmount = currentVal;
                peakDay = i + 1; // We add 1 because humans count days starting at 1, not 0
            }

            // --- 5. OUTPUT FORMATTING ---
            // %d = integer, %.2f = double with 2 decimals, %s = string, %n = newline
            System.out.printf("Day %d: %.2f liters (%s)%n", (i + 1), currentVal, category);
            
            // IMPORTANT: Manually increment the pointer to move to the next day
            i++; 
        }

        // --- FINAL CALCULATIONS ---
        // Average is the sum of all values divided by the number of elements in the array
        double averageConsumption = totalConsumption / fuelConsumption.length;

        // --- SUMMARY REPORT ---
        System.out.println("\n--- Weekly Summary ---");
        System.out.printf("Total Consumption:   %.2f liters%n", totalConsumption);
        System.out.printf("Average Consumption: %.2f liters%n", averageConsumption);
        System.out.println("-----------------------");
        System.out.println("Category Counts:");
        System.out.println("  High:   " + highCount);
        System.out.println("  Normal: " + normalCount);
        System.out.println("  Low:    " + lowCount);
        System.out.println("-----------------------");
        // Final display of the peak day found during the loop
        System.out.printf("Peak Consumption: Day %d (%.2f liters)%n", peakDay, peakAmount);
    }
}