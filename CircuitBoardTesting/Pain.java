package CircuitBoardTesting;
public class Pain {
  public static void main(String[] args){
for(int i=0; i<100; i++){
        if(i%2 ==0){
            if(i==0) continue;
            if(i==20) break;
            else
                System.out.println(i);
        }
    }

}
}