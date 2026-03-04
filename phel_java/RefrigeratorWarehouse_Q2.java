public class RefrigeratorWarehouse_Q2 {
    static void main(String[] args) {
        double[] temperature = {2.5, 3.0, 15.0, 4.2, -1.0, 22.0, 3.8, 5.0};
        double sum = 0.0;
        int validSensorCount = 0;
        double averageValidSensors = 0.0;

        for (int i = 0; i < temperature.length; i++){
            if (temperature[i] <= 10.0){
                sum += temperature[i];
                validSensorCount++;
            } else {
                System.out.println("Sensor " + (i + 1) + ": " + temperature[i] + "C - \n ERROR: Reading Ignored.");
            }
            averageValidSensors = sum / validSensorCount;
        }
        System.out.println(" ");
        System.out.println("===============================================");
        System.out.println("Total Valid Sensors: " + validSensorCount);
        System.out.printf("Average Temperature: %.2f%n", averageValidSensors);
        System.out.println("===============================================");
    }
}
