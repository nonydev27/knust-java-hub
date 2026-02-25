public class Array{
    public static void main(String[] args){
        int[] a = {3,5,1,2,4};
        int i,j, temp;

        for(i=4;i>=0;i--)
            for(j=0;j<i;j++)
        if(a[j] > a[j+1]){
            temp = a[j];
            a[j] = a[j+1];
            a[j+1] = temp;
            
        }

        System.out.print(a[i]);
    }
}