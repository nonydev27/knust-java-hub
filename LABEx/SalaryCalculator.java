import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // List of senior staff names for check
        String seniorStaff = "John Rose Cynthia George Emmanuel Stephen Alfred";

        System.out.println("CSM 281 - JB PABBI AND SONS CONSULTANTS LIMITED");
        System.out.print("Enter number of employees to process: ");
        int numEmployees = input.nextInt();

        double totalDeductionsAll = 0;
        double totalNetPayAll = 0;

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\n--- Employee " + (i + 1) + " ---");
            System.out.print("Name: ");
            String name = input.next();
            System.out.print("Hours Worked: ");
            double hours = input.nextDouble();
            System.out.print("Number of Children: ");
            int children = input.nextInt();

            // 1. Determine Rank and Rates
            boolean isSenior = seniorStaff.contains(name);
            double regRate = isSenior ? 50.0 : 35.0;
            double otRate = isSenior ? (1.5 * 50) : (1.25 * 35);

            // 2. Calculate Gross Pay
            double grossPay;
            if (hours > 40) {
                grossPay = (40 * regRate) + ((hours - 40) * otRate);
            } else {
                grossPay = hours * regRate;
            }

            // 3. Calculate Deductions
            double incomeTax = grossPay * 0.15;
            double nhil = grossPay * 0.01;
            double districtTax = grossPay * 0.03;
            double getFund = (children > 3) ? (children - 3) * 1.0 : 0.0;

            double totalDeductions = incomeTax + nhil + districtTax + getFund;
            double netPay = grossPay - totalDeductions;

            // Accumulate totals
            totalDeductionsAll += totalDeductions;
            totalNetPayAll += netPay;

            // Output Individual Data
            System.out.printf("Gross Pay: %.2f GHC\n", grossPay);
            System.out.printf("Net Pay: %.2f GHC\n", netPay);
        }

        // Final Computations
        double averageNetPay = totalNetPayAll / numEmployees;

        System.out.println("\n======================================");
        System.out.printf("Total Deductions (All): %.2f GHC\n", totalDeductionsAll);
        System.out.printf("Total Net Pay: %.2f GHC\n", totalNetPayAll);
        System.out.printf("Average Net Pay: %.2f GHC\n", averageNetPay);
        System.out.println("======================================");
        
        input.close();
    }
}