package KioskSystem;
import java.util.Scanner;
public class Main {

    /*
Develop a Java program named *KioskSystem* that simulates a fast-food ordering terminal. The program must allow for multiple items to be added to a cart before final checkout.

1. *Iterative Logic:*
• Implement a do-while loop to keep the terminal active until the user chooses to "Checkout" (Option 3).

2. *Item Pricing & Inventory:*
• Burger: $5.99
• Fries: $2.50
• The program should prompt the user for a quantity whenever an item is selected.

3. *Validation:*
• Use decision statements to handle the menu choices.
• Inside the Burger and Fries cases, ensure the user cannot enter a negative quantity. If they do, display an error and do not add to the total.

4. *Data Accumulation:*
• Track the Grand Total cost of all items.
• Track the Total Item Count (e.g., 2 burgers + 1 fries = 3 items).
\
5. *Output Requirements:*
• Provide feedback after every successful addition (e.g., "Added 2 Burgers to cart").
• Upon checkout, display the total number of items purchased and the final bill amount formatted to 2 decimal places. */


public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
        
        // Data Accumulation variables
        double grandTotal = 0.0;
        int totalItemCount = 0;
        
        // Item Prices
        double burgerPrice = 5.99;
        double friesPrice = 2.50;

        System.out.println("WELCOME TO NONY'S FAST FOOD!");
        System.out.println("======= WE ARE OPEN =======");

        String choice;
        boolean checkout = false;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Burger ($5.99)");
            System.out.println("2. Fries ($2.50)");
            System.out.println("3. Checkout");
            System.out.print("CHOICE: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("How many Burgers? ");
                    int bQty = Integer.parseInt(scanner.nextLine());
                    if (bQty >= 0) {
                        grandTotal += bQty * burgerPrice;
                        totalItemCount += bQty;
                        System.out.println("Added " + bQty + " Burgers to cart.");
                    } else {
                        System.out.println("Error: Quantity cannot be negative.");
                    }
                    break;

                case "2":
                    System.out.print("How many Fries? ");
                    int fQty = Integer.parseInt(scanner.nextLine());
                    if (fQty >= 0) {
                        grandTotal += fQty * friesPrice;
                        totalItemCount += fQty;
                        System.out.println("Added " + fQty + " Fries to cart.");
                    } else {
                        System.out.println("Error: Quantity cannot be negative.");
                    }
                    break;

                case "3":
                    checkout = true;
                    break;

                default:
                    System.out.println("Invalid Selection! Please choose 1, 2, or 3.");
            }

        } while (!checkout);

        // Final Checkout Output
        System.out.println("\n============================");
        System.out.println("TOTAL ITEMS: " + totalItemCount);
        System.out.printf("GRAND TOTAL: $%.2f\n", grandTotal);
        System.out.println("THANK YOU FOR PATRONIZING!");
        System.out.println("============================");
        
        scanner.close();
    
 
}   



}
