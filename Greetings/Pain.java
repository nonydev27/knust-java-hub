
import java.util.Scanner;

public class Pain {
    public static void main(String[] args) {
        System.out.println("This program takes the name of the user and then displays a greeting!");

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) { 
            System.err.println("Enter your name: ");
            scanner.nextLine();
        }

        System.out.println("Good day "+name);
        scanner.close();
    }}

