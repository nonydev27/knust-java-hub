/*
int examScore, assessment;
bool req1, req2;
double feesPaid;

PRINT "Exam score:";
INPUT examScore;
PRINT "Assessment:";
INPUT assessment;
PRINT "Fees paid:";
INPUT feesPaid;

req1 = ((examScore >= 25) && (assessment >= 15));
req2 = (((examScore == 25) && (assessment == 14)) || ((examScore == 24) && (assessment == 15)));

IF (req1) {
    PRINT "You're eligible to receive a certificate";

    IF (feesPaid == 100) {
        PRINT "You can receive your certificate.";
    } ELSE {
        PRINT "But you haven't paid your fees in full, you cannot be issued with a certificate.";
    }
} ELSE IF (req2) {
    PRINT "You failed to meet the pass mark, but you're condoned!"

    IF (feesPaid == 100) {
        PRINT "You can receive your certificate.";
    } ELSE {
        PRINT "However, you haven't paid your fees in full, you cannot be issued a certificate.";
    }
} ELSE {
    PRINT "You failed! You shall not be issued with a certificate."
}

IF ((examScore >= 25) && (assessment >= 15)){
    System.out.println("You passed both components!");
} ELSE IF ((examScore < 25) && (assessment >= 15)) {
    System.out.println("You failed the exams, but you passed the assessment!");
} ELSE IF ((examScore >= 25) && (assessment < 15)) {
    System.out.println("You passed the exam, but you failed the assessment!");
} ELSE {
    System.out.println("You failed both components.\nYou will be repeated!");
}

* */

import java.util.Scanner;

public class Try1{
    public static void main(String[] args) {
        int examScore, assessment;
        boolean req1, req2;
        double feesPaid;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your exam score below:");
        examScore = input.nextInt();
        System.out.println("Enter your assessment score below:");
        assessment = input.nextInt();
        System.out.println("Enter amount of fees paid below:");
        feesPaid = input.nextDouble();

        req1 = ((examScore >= 25) && (assessment >= 15));
        req2 = (((examScore == 25) && (assessment == 14)) || ((examScore == 24) && (assessment == 15)));

        System.out.println();

        if (req1) {
            System.out.println("You're eligible to receive a certificate");
            if (feesPaid == 100) {
                System.out.println("You can receive your certificate.");
            } else {
                System.out.println("But you haven't paid your fees in full,\nyou cannot be issued with a certificate.");
            }
        } else if (req2) {
            System.out.println("You failed to meet the pass mark, but you're condoned!");
            if (feesPaid == 100) {
                System.out.println("You can receive your certificate.");
            } else {
                System.out.println("However, you haven't paid your fees in full,\nyou cannot be issued a certificate.");
            }
        } else {
            System.out.println("You failed!\nYou shall not be issued with a certificate.");
        }

        System.out.println("==================================================");

        if ((examScore >= 25) && (assessment >= 15)){
            System.out.println("You passed both components!");
        } else if ((examScore < 25) && (assessment >= 15)) {
            System.out.println("You failed the exams, but you passed the assessment!");
        } else if ((examScore >= 25) && (assessment < 15)) {
            System.out.println("You passed the exam but you failed the assessment!");
        } else {
            System.out.println("You failed both components.\nYou will be repeated!");
        }

        System.out.println("==================================================");
    }
}