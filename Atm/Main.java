import java.util.Scanner;

public class Main {
    /**QUESTION 6*
Write a program in Java to build simplified ATM interface that allows a user to perform multiple transactions in one session.

1. *Initial Setup:*
• double balance = 1000.0.
• int transactionCount = 0.
• int userAction.

2. *The Loop:*
• Use a do-while loop to display a menu and process choices.

3. *The Logic (Menu):*
• Inside the loop, display these options:
1. 1. Withdraw $100
2. 2. Deposit $100
3. 0. Exit & Print Receipt
• If Option 1: Subtract 100 from balance and increment transactionCount.
• If Option 2: Add 100 to balance and increment transactionCount.
• Validation: If the user tries to withdraw but balance is less than 100, print "Insufficient Funds!" and do not increment the transaction count.
• Termination: The loop continues as long as userAction != 0.

4. *Final Summary:*
• After the loop, print the Final Balance.
• Print the Total Transactions performed.
• Use System.out.println and string concatenation. */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 1000.0;
        int transactionCount = 0;
        int userAction;

        do {
            System.out.println("\n=== ATM Menu ===");
            System.out.println("1. Withdraw $100");
            System.out.println("2. Deposit $100");
            System.out.println("0. Exit & Print Receipt");
            System.out.print("Enter your choice: ");
            userAction = input.nextInt();

            if (userAction == 1) {
                if (balance >= 100) {
                    balance -= 100;
                    transactionCount++;
                    System.out.println("Withdrawal successful. Current balance: $" + balance);
                } else {
                    System.out.println("Insufficient Funds!");
                }
            } else if (userAction == 2) {
                balance += 100;
                transactionCount++;
                System.out.println("Deposit successful. Current balance: $" + balance);
            }
        } while (userAction != 0);

        System.out.println("\n=== Receipt ===");
        System.out.println("Final Balance: $" + balance);
        System.out.println("Total Transactions: " + transactionCount);
        
        input.close();
    }
}
