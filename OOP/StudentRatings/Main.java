// Declare the package for this Java file to organize the code
package OOP.StudentRatings;

// Blank line

// Define a class named RatingAnalyzer to analyze student ratings
class RatingAnalyzer {
    // Declare a private int array to store the ratings
    private int[] ratings;

    // Blank line

    // Define a public constructor for RatingAnalyzer that takes an int array of ratings
    public RatingAnalyzer(int[] ratings) {
        // Assign the ratings array to the private field
        this.ratings = ratings;
    }

    // Blank line

    // Define a public method named getMean that returns the mean rating as double
    public double getMean() {
        // Initialize sum to 0
        int sum = 0;
        // Loop through each rating and add to sum
        for (int r : ratings) {
            // Add rating to sum
            sum += r;
        }
        // Return the mean by dividing sum by length
        return (double) sum / ratings.length;
    }

    // Blank line

    // Define a public method named getFrequencies that returns an int array of frequencies for ratings 1 to 5
    public int[] getFrequencies() {
        // Initialize freq array with size 6 (index 0 unused)
        int[] freq = new int[6]; // index 1 to 5
        // Loop through each rating
        for (int r : ratings) {
            // Increment the frequency for that rating
            freq[r]++;
        }
        // Return the frequency array
        return freq;
    }

    // Blank line

    // Define a public method named printResults that prints the mean and frequencies
    public void printResults() {
        // Print the mean rating
        System.out.println("Mean rating: " + getMean());
        // Get the frequencies
        int[] freq = getFrequencies();
        // Loop from 5 to 1 to print in descending order
        for (int i = 5; i >= 1; i--) {
            // Print the rating and its frequency
            System.out.println("Rating " + i + ": " + freq[i] + " times");
        }
    }
}

// Blank line

// Define the main public class named Main, which contains the entry point of the program
public class Main {
    // Define the main method, the starting point of the Java application, taking an array of String arguments
    public static void main(String[] args) {
        // Declare and initialize an array of int for student ratings
        int[] ratings = {2, 3, 4, 3, 5, 3, 4, 5, 2, 2, 3, 3, 4, 5, 1, 2, 4, 1, 2, 5};

        // Blank line

        // Create a new RatingAnalyzer instance with the ratings array
        RatingAnalyzer analyzer = new RatingAnalyzer(ratings);

        // Blank line

        // Call the printResults method to display the analysis
        analyzer.printResults();
    }
}