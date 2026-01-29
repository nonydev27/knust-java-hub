import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int examScore;
        int Fees;
        int assesment;

        System.out.println(" Enter Exam Score: ");
        examScore = input.nextInt();

        System.out.println(" Enter Assesment Score: ");
        assesment = input.nextInt();

        System.out.println(" Enter Amount Paid(Fees): ");
        Fees = input.nextInt();

        boolean isPassed = false;
        boolean isCondoned = false;

    
        if (examScore >= 25 && assesment >= 15) {
            isPassed = true;
        } 
      
        else if ((examScore == 24 && assesment == 15) || (examScore == 25 && assesment == 14)) {
            isPassed = true;
            isCondoned = true;
        }

     
        if (isPassed) {
            if (isCondoned) {
                System.out.println("Academic Status: PASSED (CONDONED)");
            } else {
                System.out.println("Academic Status: PASSED");
            }

         
            if (Fees >= 100) {
                System.out.println("Result: CERTIFICATE ISSUED");
            } else {
                System.out.println("Result: NO CERTIFICATE (Fees unpaid)");
            }

          

                 if ((examScore != 24  && assesment != 15) || (examScore !=25 && assesment != 14)){
                System.out.println("You have failed to meet the necesary pass mark!");
            }
       

        } else {
            System.out.println("Academic Status: FAILED");
            System.out.println("Result: REPEATED");
        }

        
    }
}