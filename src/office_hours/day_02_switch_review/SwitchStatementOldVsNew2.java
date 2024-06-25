package office_hours.day_02_switch_review;

public class SwitchStatementOldVsNew2 {
    public static void main(String[] args) {
        // if you have multiple cases should you use tradition switch or enhanced/update
        // if you want to take the same action if any of the case match the value
        // it is better to use enhanced/update switch because it allows you to have multiple values
        // per case. Tradition switch allows only 1 value pers case.

        String str = "";
        int day = 4;
        switch (day){
            case 1:
                System.out.println("It is Monday");
                str = "Monday";
                break;
            case 2:
                str = "Tuesday";
                break;
            // other cases for remaining day...
            default:
                str = "Invalid day";
                break;
        }
        // using update switch, we can assign value to a variable directly

        String str2 = switch (day){
            case 1 ->  "Monday";
            case 2 -> "Tuesday";
            // other cases for remaining day...
            default -> "Invalid day";
        };

    }
}
