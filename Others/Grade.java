import java.util.Scanner;
public class Grade {
    public static void main(String[] args){
        double[] a = new double [5];
        double totalGrade = 0.00;
        double averageGrade = 0.00;

        Scanner input = new Scanner(System.in);

        for(int i = 0; i<a.length; i++){
            System.out.println("Enter Grade: ");
            a[i] = input.nextDouble();
            totalGrade +=  a[i];
        }

        System.out.println();
        System.out.println("Total of all five grade is: "+ totalGrade);
        System.out.println();

        averageGrade = totalGrade/a.length;
        System.out.println("The average grade is, "+averageGrade);
    }
}


