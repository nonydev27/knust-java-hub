package CheckDayStatus_switches;
  public class Main{
    public static void main(String[] args) {
        
        System.out.println("THIS PROGRAM IS DESIGNED TO ALTERNATE USING SWITCHES");
SSS
        String day = "Monday";

        switch(day){
            case "Monday" : System.out.println("It is Monday!");
            break;
            case "Tuesday" : System.out.println("It is Tuesday!");
            break;
            case "Wednesday" : System.out.println("It is Wednesday!");
            break;
            case "Thursday" : System.out.println("It is Thursday!");
            case "Friday" : System.out.println("It is Friday");
            case "Saturday" : System.out.println("It is Saturday!");
            case "Sunday" : System.out.println("It is Sunday!");
            default : System.out.println("Day does not exist!");
        };

    }
};
