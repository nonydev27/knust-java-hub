import java.util.Scanner;

class CinemaTicketBooking {
    public static void main(String[] args){
        double regularPrice = 25.00;
        double studentPrice = 15.00;
        double VIPPrice = 50.00;
        double totalRegularPurchase = 0.0;
        double totalStudentPurchase = 0.0;
        double totalVIPPurchase = 0.0;
        double totalPurchase;
        int regularCount = 0;
        int studentCount = 0;
        int VIPCount = 0;
        int totalCount = 0;
        int option;

        Scanner input = new Scanner(System.in);

        do {
           System.out.printf("1. Regular - %.2f\n", regularPrice);
           System.out.printf("2. Student - %.2f\n", studentPrice);
           System.out.printf("3. VIP     - %.2f\n", VIPPrice);
           System.out.println("4. Finish Booking");

           System.out.println("Choose an option to proceed: ");
           option = input.nextInt();

           if (option == 1){
               regularCount += 1;
               totalRegularPurchase += regularPrice;
           } else if (option == 2) {
               studentCount += 1;
               totalStudentPurchase += studentPrice;
           } else if (option == 3){
               VIPCount += 1;
               totalVIPPurchase += VIPPrice;
           } else {
               totalCount = 0;
               totalPurchase = 0.0;
           }

           totalPurchase = totalRegularPurchase + totalStudentPurchase + totalVIPPurchase;
           totalCount = regularCount + studentCount + VIPCount;

        } while ((option == 1) || (option == 2) || (option == 3));{
            if (option == 4){
                System.out.println("Done!");
                System.out.println(" ");
                System.out.println("==========================================");

                if (totalCount == 0){
                    System.out.println("No tickets booked.");
                } else if ((totalCount >= 1) && (totalCount <= 3)) {
                    System.out.println("Standard booking.");
                } else {
                    System.out.println("Group booking");
                }
                System.out.println("Total tickets booked: " + totalCount);
                System.out.printf("Total cost: %.2f", totalPurchase);

            } else {
                System.out.println("Invalid option!");
            }
        }


    }
}
