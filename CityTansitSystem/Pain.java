package CityTansitSystem;

public class Pain {
    /**QUESTION 4*
A city transit system uses a prepaid card for bus rides. Each ride costs a flat fee, but the system also has a "Security Lockout" if a user attempts to use a card with a zero or negative balance too many times. You are required to write a program in Java that performs the following constraints:

1. *Variables:*
• Initialize double cardBalance = 15.00.
• Set a constant double RIDE_COST = 2.50.
• Initialize int failedAttempts = 0.

2. *The Loop:*
• Use a while loop that continues as long as cardBalance is greater than or equal to RIDE_COST.
• Additional Constraint: The loop must also stop if failedAttempts reaches 3.

3. *The Logic:*
• Inside the loop, ask the user: "Do you want to take a ride? (Enter 1 for Yes, 0 for No):".
• If the user enters 1:
• Subtract RIDE_COST from cardBalance.
• Display: "Ride successful! Remaining balance: [cardBalance]".
• If the user enters anything else (like 0):
• Increment failedAttempts.
• Display: "No ride taken. Warning: [failedAttempts]/3 inactivity marks.".

4. *Final Summary:*
• After the loop, print the final balance.
• Specific Logic: If the loop stopped because the balance was too low, print: "Insufficient funds for another ride.".
• If it stopped because of failed attempts, print: "Session timed out due to inactivity.". */
}
