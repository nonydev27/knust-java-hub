package AverageTemperature;

public class Pain {
    /**QUESTION 2*
A refrigerated warehouse has 8 sensors. Write a program in Java to calculate the average temperature, 
ignore any sensor reading that is above 10°C, as those are considered "Sensor Errors."

1. *Setup:*
• Create an array of 8 temperatures: {2.5, 3.0, 15.0, 4.2, -1.0, 22.0, 3.8, 5.0}.
• Initialize double sum = 0.0.
• Initialize int validSensorCount = 0.

2. *The Loop:*
• Use a for loop to iterate through the array.

3. *The Logic (The Filtering):*
• For each temperature, check if it is less than or equal to 10.0.
• If valid:
• Add the temperature to the sum.
• Add 1 to validSensorCount.
• If invalid (above 10.0):
• Print: "Sensor [i]: [temp]C - ERROR: Reading Ignored".

4. *Final Summary:*
• After the loop, calculate the Average of Valid Sensors (Sum / validSensorCount).
• Print the Total Valid Sensors Found.

• Print the Final Average Temperature. */

public static void main(String[] args){
        double sum = 0.0;
        // double[] temperature = new double[9];
        double[] temperature = {2.5, 3.0, 15.0, 4.2, -1.0, 22.0, 3.8, 5.0};
        int validSensorCount = 0;
        System.out.println("==========================================================");

        for(int i =0; i<temperature.length; i++){
            if(temperature[i] <= 10.0){
                System.out.println("This temperature is valid");

                temperature[i] += sum;
                validSensorCount += 1;
            }

            if(temperature[i] >10.00){
                System.out.println("This temperature is invalid");
                System.out.println("Sensor"+i+temperature+"C - ERROR: Reading Ignored");
            }
        }


}

}
