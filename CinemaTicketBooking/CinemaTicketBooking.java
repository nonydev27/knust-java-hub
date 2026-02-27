        /*A local cinema requires a kiosk application to handle ticket sales. 
        You are tasked with writing a Java program named CinemaTicketBooking that allows users to select multiple ticket types and provides a final summary.

1. Looping Structure:
* Use a do-while loop to display a menu of options to the user repeatedly.
* The menu must continue to appear until the user selects the "Finish Booking" option (Option 4).

2. Pricing & Selection:
Implement the following ticket categories:
* Option 1 (Regular): ₵25.00
* Option 2 (Student): ₵15.00
* Option 3 (VIP): ₵50.00
* Any input other than 1, 2, 3, or 4 should trigger an "Invalid option" message.

3. Data Tracking:
* Maintain a running count of the total number of tickets booked.
* Accumulate the total cost of all selected tickets.

4. Categorization & Summary:
After the user finishes booking (exits the loop), display a summary based on the following logic:
* If no tickets were purchased, display "No tickets booked."
* If between 1 and 3 tickets were purchased, classify it as a "Standard booking."
* If more than 3 tickets were purchased, classify it as a "Group booking."

5. Output Formatting:
* Print the total ticket count and the total cost (formatted to 2 decimal places). */

import java.util.Scanner;

public class CinemaTicketBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ticket prices
        final double REGULAR_PRICE = 25.00;
        final double STUDENT_PRICE = 15.00;
        final double VIP_PRICE = 50.00;

        int totalTickets = 0;
        double totalCost = 0.0;
        int choice;

        // Menu loop
        do {
            System.out.println("\n--- Cinema Ticket Booking Menu ---");
            System.out.println("1. Regular Ticket (₵25.00)");
            System.out.println("2. Student Ticket (₵15.00)");
            System.out.println("3. VIP Ticket (₵50.00)");
            System.out.println("4. Finish Booking");
            System.out.print("Select an option: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    totalTickets++;
                    totalCost += REGULAR_PRICE;
                    System.out.println("Regular ticket added.");
                    break;
                case 2:
                    totalTickets++;
                    totalCost += STUDENT_PRICE;
                    System.out.println("Student ticket added.");
                    break;
                case 3:
                    totalTickets++;
                    totalCost += VIP_PRICE;
                    System.out.println("VIP ticket added.");
                    break;
                case 4:
                    System.out.println("Finishing booking...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 4);

        // Summary
        System.out.println("\n--- Booking Summary ---");
        if (totalTickets == 0) {
            System.out.println("No tickets booked.");
        } else {
            System.out.println("Total tickets: " + totalTickets);
            System.out.printf("Total cost: ₵%.2f%n", totalCost);

            if (totalTickets >= 1 && totalTickets <= 3) {
                System.out.println("Booking type: Standard booking");
            } else if (totalTickets > 3) {
                System.out.println("Booking type: Group booking");
            }
        }

        scanner.close();
    }
}
