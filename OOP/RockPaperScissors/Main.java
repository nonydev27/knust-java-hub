package OOP.RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

// Interface for choice to demonstrate polymorphism
interface Choice {
    // Method to get the choice
    String getChoice();
}

// Class implementing Choice for user input
class UserChoice implements Choice {
    // Private scanner for user input
    private Scanner sc;

    // Constructor to initialize scanner
    public UserChoice(Scanner sc) {
        this.sc = sc;
    }

    // Implementation of getChoice for user
    public String getChoice() {
        System.out.print("Enter rock, paper, or scissors: ");
        return sc.next().toLowerCase();
    }
}

// Class implementing Choice for computer random selection
class ComputerChoice implements Choice {
    // Implementation of getChoice for computer
    public String getChoice() {
        Random random = new Random();
        int r = random.nextInt(3) + 1;
        return (r == 1) ? "rock" : (r == 2) ? "paper" : "scissors";
    }
}

// Class to handle the game logic
class RockPaperScissorsGame {
    // Method to determine the winner based on choices
    public void determineWinner(String user, String computer) {
        if (user.equals(computer)) {
            System.out.println("Tie!");
        } else if ((user.equals("rock") && computer.equals("scissors")) ||
                   (user.equals("scissors") && computer.equals("paper")) ||
                   (user.equals("paper") && computer.equals("rock"))) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}

// Main class to run the game
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create instances of choices and game
        UserChoice userChoice = new UserChoice(sc);
        ComputerChoice computerChoice = new ComputerChoice();
        RockPaperScissorsGame game = new RockPaperScissorsGame();

        // Get choices
        String user = userChoice.getChoice();
        String comp = computerChoice.getChoice();
        System.out.println("Computer chose: " + comp);

        // Determine winner
        game.determineWinner(user, comp);

        sc.close();
    }
}