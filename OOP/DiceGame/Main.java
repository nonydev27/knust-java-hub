package OOP.DiceGame;

import java.util.Scanner;

// Class representing a player in the dice game
class Player {
    // Private fields for name and score
    private String name;
    private int score;

    // Constructor to initialize player
    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    // Method to increment score when player wins a round
    public void win() {
        score++;
    }

    // Getter for score
    public int getScore() {
        return score;
    }

    // Getter for name
    public String getName() {
        return name;
    }
}

// Class representing a dice for rolling
class Dice {
    // Method to roll the dice and return a random number between 1 and 6
    public int roll() {
        return (int)(Math.random() * 6) + 1;
    }
}

// Class managing the game logic
class Game {
    // Private fields for players and dice
    private Player user;
    private Player computer;
    private Dice dice;

    // Constructor to initialize the game with user name
    public Game(String userName) {
        this.user = new Player(userName);
        this.computer = new Player("Computer");
        this.dice = new Dice();
    }

    // Method to play a single round
    public void playRound() {
        int userRoll = dice.roll();
        int compRoll = dice.roll();

        System.out.println("Round results: ");
        System.out.println(user.getName() + " rolled a " + userRoll);
        System.out.println(computer.getName() + " rolled a " + compRoll);

        if (userRoll > compRoll) {
            user.win();
        } else if (compRoll > userRoll) {
            computer.win();
        } else {
            System.out.println("It's a tie");
        }

        System.out.println("Current score: ");
        System.out.println(user.getName() + ": " + user.getScore());
        System.out.println(computer.getName() + ": " + computer.getScore());
        System.out.println("-----------------------------------------");
    }

    // Method to announce the winner after all rounds
    public void announceWinner() {
        if (user.getScore() > computer.getScore()) {
            System.out.println(user.getName() + " wins the game with a score of " + user.getScore());
        } else if (computer.getScore() > user.getScore()) {
            System.out.println(computer.getName() + " wins");
        } else {
            System.out.println("It's a tie");
        }
    }
}

// Main class to run the dice game
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the DICE GAME");
        System.out.println("-------------------------");
        System.out.println("Enter your name: ");
        String userName = input.nextLine();

        System.out.println("Welcome " + userName + " to the DICE GAME");
        System.out.println("You will be playing against the computer");
        System.out.println("-----------------------------------------");
        System.out.println("The game will run for 10 rounds");
        System.out.println("-----------------------------------------");
        System.out.println("The player with the highest score wins");
        System.out.println("-----------------------------------------");
        System.out.println("Let's begin");
        System.out.println("-----------------------------------------");

        // Create game instance
        Game game = new Game(userName);

        // Play 10 rounds
        for (int i = 0; i < 10; i++) {
            game.playRound();
        }

        // Announce winner
        game.announceWinner();

        input.close();
    }
}