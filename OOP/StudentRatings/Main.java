package OOP.StudentRatings;

// Class to analyze student ratings
class RatingAnalyzer {
    // Private field for ratings array
    private int[] ratings;

    // Constructor to initialize ratings
    public RatingAnalyzer(int[] ratings) {
        this.ratings = ratings;
    }

    // Method to calculate the mean rating
    public double getMean() {
        int sum = 0;
        for (int r : ratings) {
            sum += r;
        }
        return (double) sum / ratings.length;
    }

    // Method to get frequency of each rating (1 to 5)
    public int[] getFrequencies() {
        int[] freq = new int[6]; // index 1 to 5
        for (int r : ratings) {
            freq[r]++;
        }
        return freq;
    }

    // Method to print the mean and frequencies in descending order
    public void printResults() {
        System.out.println("Mean rating: " + getMean());
        int[] freq = getFrequencies();
        for (int i = 5; i >= 1; i--) {
            System.out.println("Rating " + i + ": " + freq[i] + " times");
        }
    }
}

// Main class to run the rating analysis
public class Main {
    public static void main(String[] args) {
        // Array of ratings as provided
        int[] ratings = {2, 3, 4, 3, 5, 3, 4, 5, 2, 2, 3, 3, 4, 5, 1, 2, 4, 1, 2, 5};

        // Create RatingAnalyzer instance
        RatingAnalyzer analyzer = new RatingAnalyzer(ratings);

        // Print the results
        analyzer.printResults();
    }
}