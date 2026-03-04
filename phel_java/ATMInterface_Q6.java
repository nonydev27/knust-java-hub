import java.util.Scanner;

class ATMInterface_Q6 {
    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance = 1000.0;
        int transactionCount = 0;
        int userAction;

        do {
            System.out.println("===============================");
            System.out.println("Choose an option to proceed.");
            System.out.println("===============================");
            System.out.println("1. Withdraw $100");
            System.out.println("2. Deposit $100");
            System.out.println("0. Exit & Print Receipt");

            userAction = input.nextInt();

            if (userAction == 1){
                if (balance >= 100){
                    balance -= 100;
                    transactionCount++;
                } else {
                    System.out.println("Insufficient funds!");
                }
            } else if (userAction == 2) {
                balance += 100;
                transactionCount++;
            }
        } while (userAction != 0);

        System.out.println(" ");
        System.out.println("===============================");
        System.out.println("Final Balance: " + balance);
        System.out.println("Total Transactions: " + transactionCount);
        System.out.println("===============================");
    }
}
