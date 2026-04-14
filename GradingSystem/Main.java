
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Exam Score: ");
        int exam = sc.nextInt();
        System.out.print("Enter Assessment Score: ");
        int assess = sc.nextInt();
        System.out.print("Enter Fees Paid: ");
        double fees = sc.nextDouble();

        boolean passReq1 = (exam >= 25 && assess >= 15);
        boolean passReq2 = (exam + assess == 39) && 
                           ((exam == 25 && assess == 14) || (exam == 24 && assess == 15));
        
        System.out.println("Exam: " + (exam >= 25 ? "Passed" : "Failed"));
        System.out.println("Assessment: " + (assess >= 15 ? "Passed" : "Failed"));

        if ((passReq1 || passReq2) && fees == 100) {
            System.out.println("Certificate Issued.");
        } else if (exam < 25 && assess < 15) {
            System.out.println("Repeated.");
        } else {
            System.out.println("Failed.");
        }
    }
}