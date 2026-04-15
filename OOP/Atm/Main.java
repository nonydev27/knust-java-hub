import java.util.Scanner;

// Class representing a bank account with encapsulation
class Account {
    // Private fields for encapsulation
    private double balance;
    private int transactionCount;

    // Constructor to initialize the account
    public Account(double initialBalance) {
        this.balance = initialBalance;
        this.transactionCount = 0;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Getter for transaction count
    public int getTransactionCount() {
        return transactionCount;
    }

    // Method to withdraw money
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactionCount++;
            return true;
        } else {
            return false;
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        transactionCount++;
    }
}

// Main class for the ATM interface
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Create an Account instance with initial balance
        Account account = new Account(1000.0);
        int userAction;

        do {
            System.out.println("\n=== ATM Menu ===");
            System.out.println("1. Withdraw $100");
            System.out.println("2. Deposit $100");
            System.out.println("0. Exit & Print Receipt");
            System.out.print("Enter your choice: ");
            userAction = input.nextInt();

            if (userAction == 1) {
                if (account.withdraw(100)) {
                    System.out.println("Withdrawal successful. Current balance: $" + account.getBalance());
                } else {
                    System.out.println("Insufficient Funds!");
                }
            } else if (userAction == 2) {
                account.deposit(100);
                System.out.println("Deposit successful. Current balance: $" + account.getBalance());
            }
        } while (userAction != 0);

        System.out.println("\n=== Receipt ===");
        System.out.println("Final Balance: $" + account.getBalance());
        System.out.println("Total Transactions: " + account.getTransactionCount());
        
        input.close();
    }
}