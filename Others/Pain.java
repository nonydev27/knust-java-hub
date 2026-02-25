public class Pain {

    /*Task: Write a method that reverses an array without creating a new/second array.

    Input: [1, 2, 3, 4, 5]

    Expected Output: [5, 4, 3, 2, 1] */
    public static void main(String[] args){

        int[] arr = {6,2,3,1,5,4};

        for(int i =0; i<arr.length; i++){  
                System.out.print(arr[i]);  
            int temp = 0;
                for(int j = i+1; j<arr.length;j++){
                    if(arr[j] < arr[i]){
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }

                

        }
        System.out.println("\nsorted array is given as: ");
        for(int i =0;i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }

    
}