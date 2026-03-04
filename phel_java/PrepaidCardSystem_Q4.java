import java.util.Scanner;

class PrepaidCardSystem_Q4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double cardBalance = 15.00;
        final double RIDE_COST = 2.50;
        int failedAttempts = 0;
        int userChoice;

        while (cardBalance >= RIDE_COST) {
            System.out.println("_______________________________________________________");
            System.out.print("Do you want to take a ride?(Enter 1 for Yes, 0 for No): ");
            System.out.println("\n_______________________________________________________");
            userChoice = input.nextInt();

            if (userChoice == 1) {
                cardBalance -= RIDE_COST;
                System.out.printf("Ride successful!%nRemaining card balance: %.2f%n", cardBalance);
            } else {
                failedAttempts++;
                System.out.printf("No ride taken. Warning: %d/3 inactivity marks.%n", failedAttempts );
            }

            if (failedAttempts == 3) {
                System.out.println("Session timed out due to inactivity");
                break;
            }

        }
        System.out.printf("Final Card Balance: %.2f%n", cardBalance);
        if (cardBalance < RIDE_COST){
            System.out.println("Insufficient funds for another ride.");
        }
    }
}
