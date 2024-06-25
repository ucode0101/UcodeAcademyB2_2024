package office_hours.day_02_switch_review;

public class SwitchStatementOldVsUpdated {
    public static void main(String[] args) {

        // write a program to check the days of the week,
        // if day is 1 to 5 print weekdays, if day is 6 to 7 print weekend
        // other print incorrect day of the week
        int day = 3;

        // using old switch statement
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
                switch (day){
                    case 1,2,3,4,5 -> System.out.println("Weekday");
                    case 6,7 -> System.out.println("Weekend");
                    default -> System.out.println("Invalid day");
                }
                break;
            case 5:
                if (true){
                    System.out.println("Hello");
                }
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
        System.out.println("=================================");
        // using old switch statement simplified
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
                System.out.println("Invalid day");
        }
        System.out.println("=======================");
        // using enhanced/update switch
        switch (day){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid day");
        }

        // can we do, nested switch ?
        // can we use old and enhance switch together
        // can we use if, ternary, switch old/new all together

        // using update switch inside old switch

        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                switch (day){
                    case 1,2,3,4,5 -> System.out.println("Weekday");
                    case 6,7 -> System.out.println("Weekend");
                    default -> System.out.println("Invalid day");
                }
            case 6:
            case 7:
                switch (day){
                    case 1,2,3,4,5 -> System.out.println("Weekday");
                    case 6,7 -> System.out.println("Weekend");
                    default -> System.out.println("Invalid day");
                }
            default:
                System.out.println("Invalid day");
        }


    }

}
