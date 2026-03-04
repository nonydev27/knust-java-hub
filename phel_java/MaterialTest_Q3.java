import java.util.Scanner;

public class MaterialTest_Q3 {
    static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double structuralIntegrity = 100.0; //starting health of material
        int cycleCount = 0;
        final double FAILURE_THRESHOLD = 15.0;
        double pressureForce = 0.0;


        while (structuralIntegrity > FAILURE_THRESHOLD){
            System.out.print("Enter the pressure force for cycle " + (cycleCount + 1)+ ": ");
            pressureForce = input.nextDouble();
            structuralIntegrity -= pressureForce;

            if (pressureForce > 20.0) {
                structuralIntegrity -= 5.0;
            }

            System.out.println("Structural Integrity: " + structuralIntegrity);
            System.out.println("=================================================");

            cycleCount++;
        }
        System.out.println("\n");
        System.out.println("Material failure at cycle: " + cycleCount);
        System.out.println("Final Integrity level: " + structuralIntegrity);
    }
}
