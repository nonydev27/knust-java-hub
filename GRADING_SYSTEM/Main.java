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

        // So this checks whether the exam has been passed or not
        if (examScore >= 25 && assesment >= 15) {
            isPassed = true;
        } 
        // 2. Check Condoned (Only if standard pass failed)
        // Logic: Total must be 39, split as 24/15 or 25/14
        else if ((examScore == 24 && assesment == 15) || (examScore == 25 && assesment == 14)) {
            isPassed = true;
            isCondoned = true;
        }

        // 3. Final Output Logic
        if (isPassed) {
            if (isCondoned) {
                System.out.println("Academic Status: PASSED (CONDONED)");
            } else {
                System.out.println("Academic Status: PASSED");
            }

            // Check Fees (Only matters if they passed)
            if (Fees >= 100) {
                System.out.println("Result: CERTIFICATE ISSUED");
            } else {
                System.out.println("Result: NO CERTIFICATE (Fees unpaid)");
            }
        } else {
            System.out.println("Academic Status: FAILED");
            System.out.println("Result: REPEATED");
        }
    }
}