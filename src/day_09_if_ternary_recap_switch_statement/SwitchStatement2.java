package day_09_if_ternary_recap_switch_statement;

public class SwitchStatement2 {
    public static void main(String[] args) {
        // write a program to print day of the week based on the number
        // for example 1 -> Monday, 2 -> Tuesday etc..

        int weekDay = 1;
        String day = "";

       switch (weekDay){


            case 1:
                System.out.println("Monday"); // we can print
               // day = "Monday"; // we can either assign to a variable
                break;
            case 899:
                System.out.println("Tuesday");
            break;

            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");

                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
               break;

            default:
                System.out.println("Invalid day of the week");
                break;

        }
    }
}
