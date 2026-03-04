class WarehouseAnalysis {
    public static void main(String[] args) {
        int i;
        String weightClass;
        int heavyCount = 0;
        int mediumCount = 0;
        int lightCount = 0;
        int heaviestBox = 0;
        double heaviestBoxWeight = 0.0;
        double totalWeight = 0.0;
        double averageWeight = 0.0;
        double[] boxWeights = {12.5, 55.0, 45.0, 18.0, 22.5, 60.0, 30.0, 15.0, 50.0, 10.0};

        for (i = 0; i < boxWeights.length; i++){
            if (boxWeights[i] > 50){
                weightClass = "Heavy";
                heaviestBox = i+1;
                heaviestBoxWeight = boxWeights[i];
                heavyCount += 1;
            } else if ((boxWeights[i] >= 20) && (boxWeights[i] <= 50)) {
                weightClass = "Medium";
                mediumCount += 1;
            } else {
                weightClass = "Light";
                lightCount += 1;
            }

            totalWeight += boxWeights[i];
            averageWeight = totalWeight / boxWeights.length;


            System.out.print("Box ID: " + (i+1) + " | ");
            System.out.println("Classification: " + weightClass);
        }

        System.out.println(" ");
        System.out.println("============================================================");
        System.out.println("Total Weight:   " + totalWeight + "kg");
        System.out.println("Average Weight: " + averageWeight + "kg");
        System.out.println("============================================================");
        System.out.println("Heavy-weight Boxes:  " + heavyCount);
        System.out.println("Medium-weight Boxes: " + mediumCount);
        System.out.println("Light-weight Boxes:  " + lightCount);
        System.out.println("============================================================");
        System.out.println("Heaviest Box: " +
                " Index: " + heaviestBox +
                " | Weight: " + heaviestBoxWeight + "kg");

    }
}
