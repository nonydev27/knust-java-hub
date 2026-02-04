package CheckDayStatus_switches;
  public class Main{
    public static void main(String[] args) {

        //Clearly what this program is ideally about is to learn about switches
        //Switches are alternatives for If, if else, etc statements
        //The code simply checks the day, if it's indeed there, it renders, else there's a default message
        
        System.out.println("THIS PROGRAM IS DESIGNED TO ALTERNATE USING SWITCHES");

        String day = "Saturday";

        switch(day){
            case "Monday" : System.out.println("It is Monday!");
            break;

            case "Tuesday" : System.out.println("It is Tuesday!");
            break;

            case "Wednesday" : System.out.println("It is Wednesday!");
            break;

            case "Thursday" : System.out.println("It is Thursday!");
            break;

            case "Friday" : System.out.println("It is Friday");
            break;

            case "Saturday" : System.out.println("It is Saturday!");
            break;

            case "Sunday" : System.out.println("It is Sunday!");
            break;

            default : System.out.println("Day does not exist!");
        };

    }
};
