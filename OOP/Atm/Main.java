// Declare the package for this Java file to organize the code
package OOP.Atm;

// Blank line

// Import the Scanner class from java.util package for user input
import java.util.Scanner;

// Blank line

// Define the main public class named Main for the ATM interface
public class Main {
    // Define the main method, the starting point of the Java application, taking an array of String arguments
    public static void main(String[] args) {
        // Create a new Scanner object for user input
        Scanner input = new Scanner(System.in);
        // Create a new Account object with initial balance of 1000.0
        Account account = new Account(1000.0);
        // Declare an int variable for user action
        int userAction;

        // Blank line

        // Start a do-while loop for the ATM menu
        do {
            // Print the ATM menu header
            System.out.println("\n=== ATM Menu ===");
            // Print withdraw option
            System.out.println("1. Withdraw $100");
            // Print deposit option
            System.out.println("2. Deposit $100");
            // Print exit option
            System.out.println("0. Exit & Print Receipt");
            // Print prompt for choice
            System.out.print("Enter your choice: ");
            // Read the user action as int
            userAction = input.nextInt();

            // Blank line

            // Check if action is 1 (withdraw)
            if (userAction == 1) {
                // Attempt to withdraw 100
                if (account.withdraw(100)) {
                    // Print success message with current balance
                    System.out.println("Withdrawal successful. Current balance: $" + account.getBalance());
                } else {
                    // Print insufficient funds message
                    System.out.println("Insufficient Funds!");
                }
            } else if (userAction == 2) {
                // Deposit 100
                account.deposit(100);
                // Print success message with current balance
                System.out.println("Deposit successful. Current balance: $" + account.getBalance());
            }
        } while (userAction != 0);

        // Blank line

        // Print receipt header
        System.out.println("\n=== Receipt ===");
        // Print final balance
        System.out.println("Final Balance: $" + account.getBalance());
        // Print total transactions
        System.out.println("Total Transactions: " + account.getTransactionCount());
        
        // Blank line

        // Close the Scanner
        input.close();
    }
}