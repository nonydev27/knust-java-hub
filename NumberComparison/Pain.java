package NumberComparison;

import java.util.*;
public class Pain {
   /*Write a program with a loop that lets the user enter a 
   series of integers. The user should enter -99 to signal 
   the end of the series. After all the numbers have been entered, 
   the program should display the largest and smallest numbers entered. */ 

   public static void main(String[] args){
    System.out.println("This program will display the largest and smallest number entered from the you the user.");
    System.out.println("=================== ================= ====================");

    System.out.println();

    int num;
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a series of integers (-99 to stop):");

    while (true) {
        num = scanner.nextInt();

        if (num == -99) {
            break;
        }

        if (num > largest) {
            largest = num;
        }

        if (num < smallest) {
            smallest = num;
        }
    }

    System.out.println("Largest number entered: " + largest);
    System.out.println("Smallest number entered: " + smallest);

    scanner.close();

   }
}
