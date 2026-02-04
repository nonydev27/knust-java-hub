package VotingSystem;
import java.util.Scanner;

public class Pain{
    public static void main(String[] args){
        System.out.println("This code will check if a user is eligible to vote or not!"); 
        System.out.println("***************** 2026 VOTING SYSTEM ***********************");

        Scanner scanner = new Scanner(System.in);

        int age;
        String firstname;
        String Lastname;

        System.out.println("Enter your firstname: ");
        firstname = scanner.nextLine();
        
        System.out.println("Enter your lastname: ");
        Lastname = scanner.nextLine();

        System.out.println("Dear "+Lastname+" "+firstname+",");
        System.out.println("Failure to input wrong age attracts serious charges as a citizen of Java Kingdom! So be wise!");

        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        if(age>= 18){
            System.out.println("You are eligible to vote!");
        }else{
            System.out.println("You are under arrest!");
        }

        scanner.close();
    }
}