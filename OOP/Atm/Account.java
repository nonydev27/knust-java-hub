// Declare the package for this Java file to organize the code
package OOP.Atm;

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