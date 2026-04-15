// Import the Scanner class from java.util package for user input
import java.util.Scanner;

// Blank line

// Define a class named Account to represent a bank account with encapsulation
class Account {
    // Declare a private double field for the account balance
    private double balance;
    // Declare a private int field for the number of transactions
    private int transactionCount;

    // Blank line

    // Define a public constructor for Account that takes initial balance
    public Account(double initialBalance) {
        // Assign initialBalance to balance
        this.balance = initialBalance;
        // Initialize transactionCount to 0
        this.transactionCount = 0;
    }

    // Blank line

    // Define a public getter method for balance
    public double getBalance() {
        // Return the balance field
        return balance;
    }

    // Blank line

    // Define a public getter method for transaction count
    public int getTransactionCount() {
        // Return the transactionCount field
        return transactionCount;
    }

    // Blank line

    // Define a public method named withdraw that takes amount and returns success as boolean
    public boolean withdraw(double amount) {
        // Check if balance is sufficient
        if (balance >= amount) {
            // Subtract amount from balance
            balance -= amount;
            // Increment transaction count
            transactionCount++;
            // Return true for success
            return true;
        } else {
            // Return false for failure
            return false;
        }
    }

    // Blank line

    // Define a public method named deposit that takes amount and adds to balance
    public void deposit(double amount) {
        // Add amount to balance
        balance += amount;
        // Increment transaction count
        transactionCount++;
    }
}

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