import java.util.Scanner;

public class CircuitBoardTest_Q5 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double boardHealth = 100.0;
        int spikeCount = 0;
        int userChoice = 1; //1 to continue, 0 to stop
        double spikeDamage;

        do {
            System.out.println("======================================================");
            System.out.print("Enter damage caused by this spike: ");
            spikeDamage = input.nextDouble();
            boardHealth -= spikeDamage;

            System.out.println("Board Health: " + boardHealth);
            System.out.println("======================================================");

            if (boardHealth > 0) {
                System.out.println("Continue Testing? (1 for yes, 0 for No): ");
                userChoice = input.nextInt();
            } else {
                System.out.println("Board is fried!");
            }
            System.out.println(" ");
            spikeCount++;

        } while ((boardHealth > 0) && (userChoice == 1));{
            System.out.printf("Spikes board survived: %d%n", spikeCount);
            if (boardHealth <= 0){
                System.out.println("TEST TERMINATED: Component Destroyed.");
            }
        }
    }
}
