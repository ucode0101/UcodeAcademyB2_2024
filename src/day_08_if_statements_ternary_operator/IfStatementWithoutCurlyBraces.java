package day_08_if_statements_ternary_operator;

public class IfStatementWithoutCurlyBraces {

    public static void main(String[] args) {

        // print max number
        int n1 = 55;
        int n2 = 789;

        if (n1 > n2){
            System.out.println(n1);
        }
        else {
            System.out.println(n2);
        }

        System.out.println("=================================");
        // if statement without curly braces
        if (n1 > n2)
            System.out.println(n1);
        else
            System.out.println(n2);

        System.out.println("===========================================");
        int day = 5;
        String weekDay;

        // with if else-if
        if (day == 1)
            weekDay ="Monday";

        else if (day == 2)
            weekDay = "Tuesday";

        else if (day == 3)
                    weekDay = "Wednesday";

        else if (day == 4)
                weekDay = "Thursday";

        else if (day == 5)
                 weekDay = "Friday";

        else if (day == 6)
            weekDay = "Saturday";

        else if (day == 7)
            weekDay = "Sunday";

        else
            weekDay = "Invalid day of the week";

        System.out.println(weekDay);


    }
}
