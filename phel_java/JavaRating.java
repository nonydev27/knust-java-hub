import java.util.Arrays;

public class JavaRating {
    static void main(String[] args){
        int[] rating = {2, 3, 4, 3, 5, 3, 4, 5, 2, 2, 3, 3, 4, 5, 1, 2, 4, 1, 2, 2};
        int count_1 = 0;
        int count_2 = 0;
        int count_3 = 0;
        int count_4 = 0;
        int count_5 = 0;

        for (int i = 0; i < rating.length; i++){
            switch (rating[i]){
                case 1:
                    count_1++;
                    break;
                case 2:
                    count_2++;
                    break;
                case 3:
                    count_3++;
                    break;
                case 4:
                    count_4++;
                    break;
                case 5:
                    count_5++;
                    break;
                default:
                    System.out.println("NaN");
            }
        }
//        System.out.println("1 appears " +count_1);
//        System.out.println("2 appears " +count_2);
//        System.out.println("3 appears " +count_3);
//        System.out.println("4 appears " +count_4);
//        System.out.println("5 appears " +count_5);
        int[][] counts = {{1, count_1}, {2, count_2}, {3, count_3}, {4, count_4}, {5, count_5}};

        for (int i = 0 ; i < counts.length - 1; i++){
            for (int j = i +1; j < counts.length; j++){
                if (counts[i][1] < counts[j][1]){
                    int[] temp = counts[i];
                    counts[i] = counts[j];
                    counts[j] = temp;
                }
            }
        }
        for (int i = 0; i < counts.length; i++){
            System.out.println(counts[i][0] + " appears " + counts[i][1] + " times");
        }


    }
}
