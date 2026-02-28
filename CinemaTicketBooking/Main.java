import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
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

        System.out.println("WELCOME TO THE CINEMA");
        System.out.println("=====================");

        double regular = 25.00;
        double student = 15.00;
        double vip = 50.00;
        double amount = 0.00;
        
        int choice;

        Scanner input = new Scanner(System.in);
       
        
        do {

        System.out.println("Please make a selection");
        System.out.println();

        System.out.println("1. (Regular): GHC 25.00");
        System.out.println("2. (Student): GHC 15.00");
        System.out.println("3. (VIP): GHC 50.00");
        System.out.println("4. Finish booking");

        choice = input.nextInt();

        switch(choice){
            case 1: System.out.println("You have chosen Regular!");
            amount += regular;
            break;

            case 2: System.out.println("You have chosen Student!");
            amount += student;
            break;

            case 3: System.out.println("You have chosen VIP!");
            amount += vip;
            break;

            case 4: System.out.println("Done booking");
            break;
            
            default: System.out.println("Invalid option!");

        }

        } while (choice !=4);

    }
}
