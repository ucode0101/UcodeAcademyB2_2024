package day_09_if_ternary_recap_switch_statement;

public class SwitchStatementUpdated {
    public static void main(String[] args) {
        // write a program to print day of the week based on the number
        // for example 1 -> Monday, 2 -> Tuesday etc..

        int weekDay = -1;
        String str = "";
        // we assign the result to String variable based on the matching case
        String result = switch (weekDay){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day of the week";
        };
        System.out.println(result);
        System.out.println("================================================");

        // print day of the week based on the matching case
        switch (weekDay){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day of the week");
        }
    }
}
