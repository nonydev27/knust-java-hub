package OrganismPopulation;
import java.util.*;

public class Pain {
    /*Write a program that will predict the size of a population of organisms. The program should ask for the starting number of organisms, 
    their average daily population increase (as a percentage), and the number of days they will multiply. For example, a population might begin
     with two organisms, have an average daily increase of 50 percent, and will be allowed to multiply for seven days. The program should use a loop 
     to display the size of the population for each day.

    Input Validation: Do not accept a number less than 2 for the starting size of the population. 
    Do not accept a negative number for average daily population increase. Do not accept a number less than 1 for the number of days they will multiply. */

public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("ORGANISMS POPULATION SIZE PREDICTION");
    System.out.println("=====================================");

    int starting_number;
    double avg_dailypopulation;
    int repro_days;

    System.out.println("Enter the starting number of organisms: ");
    starting_number = scanner.nextInt();

    System.out.println("Enter the average daily population increase: ");
    avg_dailypopulation = scanner.nextDouble();

    System.out.println("Enter the number of days they will multiply: ");
    repro_days = scanner.nextInt();

    // System.out.println("Day Approximate\t\tPopulation");

    
    
    
}
 
}
