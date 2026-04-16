// Declare the package for this Java file to organize the code
package OOP.StudentRatings;

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