package LABEx;

import java.util.Arrays;

public class ShopSalesTracker {
    public static void main(String[] args) {
        // Data for Shop A (4x3 matrix)
        int[][] shopA = {
            {42, 48, 50},
            {52, 58, 60},
            {46, 49, 58},
            {50, 51, 61}
        };

        // Data for Shop B (4x3 matrix)
        int[][] shopB = {
            {57, 63, 60},
            {70, 67, 73},
            {67, 65, 62},
            {72, 69, 75}
        };

        // I. Monthly Combined Sales
        System.out.println("--- Monthly Combined Sales ---");
        int[][] combined = new int[4][3];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                combined[i][j] = shopA[i][j] + shopB[i][j];
                System.out.print(combined[i][j] + " ");
            }
            System.out.println();
        }

        // II. Quarterly Sales for each shop
        int[] qSalesA = calculateQuarterly(shopA, "Shop A");
        int[] qSalesB = calculateQuarterly(shopB, "Shop B");

        // IV. Annual Sales
        int annualA = Arrays.stream(qSalesA).sum();
        int annualB = Arrays.stream(qSalesB).sum();
        System.out.println("\nAnnual Sales - Shop A: " + annualA + ", Shop B: " + annualB);

        // VI. Diagonal Difference (using Shop A as example)
        calculateDiagonalDifference(shopA);
    }

    public static int[] calculateQuarterly(int[][] shop, String name) {
        int[] quarterly = new int[4];
        System.out.println("\nQuarterly Sales for " + name + ":");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                quarterly[i] += shop[i][j];
            }
            System.out.println("Q" + (i + 1) + ": " + quarterly[i]);
        }
        return quarterly;
    }

    public static void calculateDiagonalDifference(int[][] matrix) {
        int leading = 0, trailing = 0;
        for (int i = 0; i < 3; i++) { // Only for square portion 3x3
            leading += matrix[i][i];
            trailing += matrix[i][2 - i];
        }
        System.out.println("\nDiagonal Difference: " + Math.abs(leading - trailing));
    }
}