public class Rate {
    public static void main(String[] args) {
        int rates[] = {2,3,4,3,5,3,4,5,2,2,3,3,4,5,1,2,4,1,2,2};

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        
        for(int i=0; i<rates.length; i++){
            // System.out.println(rates[i]);

            switch (rates[i]) {
                case 1:
                    count1++;
                    break;

                case 2:
                    count2++;
                    break;

                case 3:
                    count3++;
                    break;

                case 4:
                    count4++;
                    break;
                    
                case 5:
                    count5++;
                    break;
                default:
                    
                    throw new AssertionError();
            }
        }

        System.out.println("Number of appearances for 1: " + count1);
        System.out.println("Number of appearances for 2: " +count2);
        System.out.println("Number of appearances for 3: " + count3);
        System.out.println("Nummber of appearances for 4: " + count4);
        System.out.println("Number of appearances for 5: " +count5);       
        
        
        System.out.println("======================================");
        System.out.println("In terms of highest ranking :)");

        if((count1 > count2 )&& (count1 > count3) && (count1 > count4) && (count1 > count5)){
            System.out.println("1 is the highest");
        }else if ((count2 > count1 )&& (count2 > count3) && (count2 > count4) && (count2 > count5)) {
            System.out.println("2 is the highest");
        }else if((count3 > count1 )&& (count3 > count2) && (count3 > count4) && (count3 > count5)){
            System.out.println("3 is the highest");
        }else if((count4 > count1 )&& (count4 > count2) && (count4 > count3) && (count4 > count5)){
            System.out.println("4 is the highest");
        }else{
            System.out.println("5 is the highest");
        }

        // if((count1 > count2 )&& (count1 > count3) && (count1 > count4) && (count1 > count5)){
        //     System.out.println("2 is the second highest");
        // }else if((count2 > count1 )&& (count2 > count3) && (count2 > count4) && (count2 > count5)){
        //     System.out.println("2 is the second highest");
        // }else if((count3 > count1 )&& (count3 > count2) && (count3 > count4) && (count3 > count5)){
        //     System.out.println("2 is the second highest");
        // }else if((count4 > count1 )&& (count4 > count3) && (count4 > count3) && (count4 > count5)){
        //     System.out.println("2 is the second highest");
        // }else if((count5 > count1 )&& (count5 > count3) && (count5 > count4) && (count5 > count2)){
        //     System.out.println("2 is the second highest");
        // }
       

        // int count[] = {count1,count2,count3, count4, count5};

        //loop through the counts and display the highest to the lowest
    }
}
