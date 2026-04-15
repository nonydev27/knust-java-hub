package OOP.NumberComparison;

import java.util.Scanner;

// Class to find the largest and smallest numbers from user input
class NumberFinder {
    // Private fields for largest and smallest values
    private int largest;
    private int smallest;

    // Constructor initializes with extreme values
    public NumberFinder() {
        this.largest = Integer.MIN_VALUE;
        this.smallest = Integer.MAX_VALUE;
    }

    // Method to add a number and update largest/smallest
    public void addNumber(int num) {
        if (num > largest) {
            largest = num;
        }
        if (num < smallest) {
            smallest = num;
        }
    }

    // Getter for largest
    public int getLargest() {
        return largest;
    }

    // Getter for smallest
    public int getSmallest() {
        return smallest;
    }
}

// Main class to run the number comparison program
public class Main {
    public static void main(String[] args) {
        System.out.println("This program will display the largest and smallest number entered from the you the user.");
        System.out.println("=================== ================= ====================");
        System.out.println();

        NumberFinder finder = new NumberFinder();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a series of integers (-99 to stop):");

        while (true) {
            int num = scanner.nextInt();

            if (num == -99) {
                break;
            }

            finder.addNumber(num);
        }

        System.out.println("Largest number entered: " + finder.getLargest());
        System.out.println("Smallest number entered: " + finder.getSmallest());

        scanner.close();
    }
}