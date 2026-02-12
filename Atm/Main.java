package Atm;

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
}
