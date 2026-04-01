package CircleClass;

import java.util.*;
public class Oluchi {
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
       

        double radius;
        
        System.out.println("Enter radius: ");
        radius = input.nextDouble();
        
         Circle oluchi = new Circle(radius);
         System.out.println(oluchi.getRadius());
    }
}
