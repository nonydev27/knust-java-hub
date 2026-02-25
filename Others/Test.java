public class Test {
    public static void main(String[] args){
        String str[ ] ={"Php", "Python", "Java", "VB", "html"};
        str[1] = "Better";
        String[] tim = new String[3];
        int num[] = new int[3];
        num[0] = 100;
        num[1] = 217;
        char[] mike = new char[3];
        mike[0] = 'C';
        mike[1] = 'A';
        mike[2] = 'B';

        boolean ann[] = new boolean[2];

        //String data type 'str'

        System.out.println("String array length is " + str.length);
        System.out.println(str[0]+str[1]+str[2]+str[3]+str[4]);

        //String data type 'tim'
        System.out.println(tim[0]+","+tim[1]+","+tim[2]);
        System.out.println("Integer array length: "+num.length);
        System.out.println("The result is, "+(num[0] +num[1]%str.length));
        System.out.println(num[0]+","+num[1]+","+num[2]);

        //String array length = 5
        //Php,Better,Java,VB, Html
        //null, null, null
        //integer array length = 3
        //the result is 102
        //100,217,0

    }
}
