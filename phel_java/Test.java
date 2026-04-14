import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please state your name:");
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Welcome to this java platform!");

        input.close();   
    }
}