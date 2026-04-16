// Declare the package for this Java file to organize the code
package OOP.phel_java;

// Blank line for readability

// Import the Scanner class from java.util package to handle user input
import java.util.Scanner;

// Blank line for readability

// Define the main public class named Main, which contains the entry point of the program
public class Main {
    // Define the main method, the starting point of the Java application, taking an array of String arguments
    public static void main(String[] args) {
        // Instantiate a new GreetingApp object to handle the greeting functionality
        GreetingApp app = new GreetingApp();
        // Create a new Scanner object to read input from the standard input stream (System.in)
        Scanner input = new Scanner(System.in);

        // Blank line

        // Call the setName method on the app object, passing the Scanner to prompt and set the user's name
        app.setName(input);
        // Print the greeting message returned by the getGreeting method to the console
        System.out.println(app.getGreeting());

        // Blank line

        // Declare and initialize an array of double values representing item prices for the shopping cart
        double[] ItemPrice = {45.0, 120.5, 234.0, 111.2, 23.3};
        // Create a new ShoppingCart object, passing the item prices array to its constructor
        ShoppingCart cart = new ShoppingCart(ItemPrice);
        // Call the displayItems method on the cart object to show the items and their prices
        cart.displayItems();

        // Blank line

        // Close the Scanner object to release system resources and prevent resource leaks
        input.close();
    }
}