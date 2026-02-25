public class Exam{
    public static void main(String[] args){
        long[] indexNumbers = {10021007, 10021107, 10021207, 10021307, 10021407 ,10021507, 10021607, 10021707, 10021807, 10021907,
            10022007, 10022107, 10022207, 10022307, 10022407
        };

        int[] midsemMarks = {65, 46, 22, 32, 80, 12, 45, 25, 67, 23, 45, 56, 34, 81, 73};
        double[] calculatedMidsemMarks = new double[15];
        
        int[] examMarks = {78, 54, 90, 32, 66, 60, 48, 65, 45, 33, 45, 67, 90, 67, 54};
        double[] calculatedExamMarks = new double[15];

        System.out.printf("%-15s | %-12s | %-10s%n", "Index Number", "Final Score", "Grade");
        System.out.println("---------------------------------------------");
        
        double[] finalScores = new double[calculatedMidsemMarks.length];
        for(int i= 0; i<finalScores.length; i++){
            calculatedMidsemMarks[i]= ((midsemMarks[i]/100.0)*30);
            calculatedExamMarks[i]= ((examMarks[i]/100.0)*70);
            
            finalScores[i] = calculatedExamMarks[i] + calculatedMidsemMarks[i]; 

            String grade;
            if (finalScores[i] >= 70) grade = "A";
            else if (finalScores[i] >= 65) grade = "B";
            else if (finalScores[i] >= 60) grade = "C";
            else if (finalScores[i] >= 50) grade = "D";
            else if (finalScores[i] >= 40) grade = "E";
            else grade = "F";

            System.out.printf("%-15d | %-12.2f | %-10s%n", 
                      indexNumbers[i], 
                      finalScores[i], 
                      grade);
        }
    }
    
}
