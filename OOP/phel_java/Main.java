package OOP.phel_java;

import java.util.Scanner;

// Class to handle greeting
class GreetingApp {
    // Private field for name
    private String name;

    // Method to set name from input
    public void setName(Scanner input) {
        System.out.println("Please state your name:");
        this.name = input.nextLine();
    }

    // Method to get greeting
    public String getGreeting() {
        return "Hello, " + name + "!\nWelcome to this java platform!";
    }
}

// Main class to run the greeting app and shopping cart
public class Main {
    public static void main(String[] args) {
        // Greeting part
        GreetingApp app = new GreetingApp();
        Scanner input = new Scanner(System.in);

        app.setName(input);
        System.out.println(app.getGreeting());

        // Shopping Cart part
        double[] ItemPrice = {45.0, 120.5, 234.0, 111.2, 23.3};
        ShoppingCart cart = new ShoppingCart(ItemPrice);
        cart.displayItems();

        input.close();
    }
}