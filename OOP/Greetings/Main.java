package OOP.Greetings;

import java.util.Scanner;

// Class to handle user greeting
class Greeter {
    // Private field for the user's name
    private String name;

    // Method to prompt and set the name
    public void setName(Scanner scanner) {
        while (true) {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
            if (!name.isBlank()) {
                break;
            }
        }
    }

    // Method to get the greeting message
    public String getGreeting() {
        return "Good day " + name;
    }
}

// Main class to run the greeting program
public class Main {
    public static void main(String[] args) {
        System.out.println("This program takes the name of the user and then displays a greeting!");

        Greeter greeter = new Greeter();
        Scanner scanner = new Scanner(System.in);

        greeter.setName(scanner);

        System.out.println(greeter.getGreeting());
        scanner.close();
    }
}