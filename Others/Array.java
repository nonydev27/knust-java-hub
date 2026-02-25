import java.util.Scanner;

public class Array{
    public static void main(String[] args){
        // int[] a = {3,5,1,2,4};
        // int i,j, temp;

        // for(i=4;i>=0;i--)
        //     for(j=0;j<i;j++)
        // if(a[j] > a[j+1]){
        //     temp = a[j];
        //     a[j] = a[j+1];
        //     a[j+1] = temp;
            
        // }

        // System.out.print(a[i]);

        String[] names = {"Ama", "Lofi", "Abena"};
      
        int age = 0;

Scanner scanner = new Scanner(System.in);

  System.out.print("What is your age?");
        age = scanner.nextInt();

        System.out.print("Your are "+age+" years old");

        // for(int i =0; i<names.length; i++){
        //     System.out.println(names[i]);
        // }
    }
}