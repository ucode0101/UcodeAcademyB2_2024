package day_10_switch_statements_scanner_class;

public class SwitchMultiValuesPerCase {
    public static void main(String[] args) {
        // write a program to find if it is weekday or weekend
        // from 1 to 5 it should say "Weekday" and
        // from 6 to 7 it should say "Weekend
        int day = 31;

        switch (day){
            case 1:
                System.out.println("Weekday");
                break;
            case 2:
                System.out.println("Weekday");
                break;
            case 3:
                System.out.println("Weekday");
                break;
            case 4:
                System.out.println("Weekday");
                break;
            case 5:
                System.out.println("Weekday");
                break;
                // the rest of the case to 5
            case 6:
                System.out.println("Weekend");
                break;
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
        System.out.println("==================================");
        // since we are running the same statement/code for any matching case 1 to 5
        // we can use that statement/code only once

        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
        System.out.println("==============================");
        // we will do the same task with updated switch statement

        switch (day){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid");
        }






    }
}
