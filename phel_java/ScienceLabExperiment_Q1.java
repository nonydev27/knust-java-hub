import java.util.Scanner;

public class ScienceLabExperiment_Q1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, i; //number of experiments
        double morningTemp; //morning temperature reading
        double eveningTemp;  //evening temperature reading
        double tempSum;
        double averageTemp; //average temperature for specific experiments
        double totalAverageTemp = 0.0;

        System.out.print("Enter the number of experiments: ");
        n = input.nextInt();
        System.out.println(" ");

        System.out.println("Enter the various temperature readings below (Degree Celsius).");
        System.out.println("=============================================================");
        for (i = 1; i <= n; i++){
            System.out.println(" ");
            System.out.printf("Experiment %d%n", i);
            System.out.print("Morning Reading: ");
            morningTemp = input.nextDouble();
            System.out.print("Evening Reading: ");
            eveningTemp = input.nextDouble();
            System.out.println("=============================================================");

            tempSum = morningTemp + eveningTemp;
            averageTemp = tempSum / 2;
            totalAverageTemp += averageTemp;

            if (averageTemp > 100){
                System.out.printf("Experiment %d%n", i);
                System.out.print(averageTemp + " C - " ); System.out.print("STATUS: UNSTABLE");
                System.out.println(" ");
            } else {
                System.out.printf("Experiment %d%n", i);
                System.out.print(averageTemp + " C - " ); System.out.print("STATUS: NORMAL");
                System.out.println(" ");
            }
        }
        System.out.println("=============================================================");
        System.out.printf("Final Grand Average: %f", totalAverageTemp);
        System.out.println("=============================================================");
    }
}
