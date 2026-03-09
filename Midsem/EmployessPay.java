package Midsem;
import java.util.*;

public class EmployessPay {
    public static void main(String[] args){

        double grosspay = 0.00;
        double netpay = 0.00;
        double average_netpay = 0.00;
        double total_netpay = 0.00;
        double salary = 0.00;

        String name = "";
        int hours = 0;
        int stream;

        Scanner input = new Scanner(System.in);


        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("How many hours have you worked for? ");
        hours = input.nextInt();

        System.out.println("Please choose your stream: ");
        System.out.println("1. JUNIOR STAFF");
        System.out.println("2. SENIOR STAFF");

        stream = input.nextInt();
        
        if(hours<40 && stream==1){
            
            salary += salary;

        }else if(hours<40 && stream==2){
            salary += 50*hours;
        }
        
    }
}
