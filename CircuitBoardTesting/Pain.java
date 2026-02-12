package CircuitBoardTesting;
public class Pain {
    /**QUESTION 5*
A quality control engineer is testing circuit boards. Each board is subjected to a "Power Spike." After each spike, 
the engineer checks the board's health. The process repeats as long as the board is functional and the engineer chooses to continue. 
Write a program in Java to perform the following technical specifications:

1. *Variables:*
• double boardHealth = 100.0.
• int spikeCount = 0.
• int userChoice = 1 (1 to continue, 0 to stop).

2. *The Loop:*
• Use a do-while loop. This ensures at least one power spike is applied.

3. *The Logic:*
• Action: Increment spikeCount and subtract a random damage value (prompt the user to enter the damage for this spike).
• Health Check: If boardHealth drops to 0 or less, the board is "FRIED."
• User Input: If the board is still alive (boardHealth > 0), ask the user: "Continue testing? (1 for Yes, 0 for No): ".
• Termination: The loop should repeat only if boardHealth > 0 AND userChoice == 1.

4. *Output:*
• Inside the loop, print the remaining health after each spike.
• After the loop, print the total number of spikes the board survived.
• If the board health is 0 or less, print: "TEST TERMINATED: Component Destroyed.". */


public static void main(String[] args){
    // System.out.println("");

    // double boardHealth = 100.0;
    // int spikeCount = 0;
    // int userChoice = 1;


    //Example of a do-while loop is below:
    // Scanner scanner = new Scanner(System.in);
    //     int number;

    //     do {
    //         System.out.print("Enter a number between 1 and 10: ");
    //         number = scanner.nextInt();
    //     } while (number < 1 || number > 10);

    //     System.out.println("Thank you! You entered: " + number);
}

}
