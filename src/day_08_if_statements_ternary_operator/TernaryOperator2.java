package day_08_if_statements_ternary_operator;

public class TernaryOperator2 {

    public static void main(String[] args) {

        // write a program to give to grade based on average
        int math = 79;
        int history = 82;
        int geography = 77;
        int average = (math + history + geography) / 3;
        System.out.println(average);

        char grade;
        grade = (average >=90) ? 'A' : (average >=80 && average <90) ? 'B' :
                (average >=70 && average <80) ? 'C' : 'D';

        System.out.println(grade);


        System.out.println("=========================");
        // Write a program to check the day of the week
        // int day = 5; -> it is Friday
        //if the number is less than 1 or greater than 7 -> invalid

        int day = 5;
        String weekDay;

        // with if else-if
        if (day == 1){
            weekDay ="Monday";
        }
        else if (day == 2){
            weekDay = "Tuesday";
        }
        else if (day == 3){
            weekDay = "Wednesday";
        }
        else if (day == 4){
            weekDay = "Thursday";
        }
        else if (day == 5){
            weekDay = "Friday";
        }
        else if (day == 6){
            weekDay = "Saturday";
        }
        else if (day == 7){
            weekDay = "Sunday";
        }
        else {
            weekDay = "Invalid day of the week";
        }
        System.out.println(weekDay);

        System.out.println("================================");
        // with ternary operator (nested ternary operator)

        String dayOfWeek;

        dayOfWeek = (day == 1) ? "Monday" : (day == 2 ) ? "Tuesday" : (day == 3 ) ? "Wednesday" : (day == 4) ? "Thursday"
                    : (day == 5 ) ? "Friday" : (day == 6) ? "Saturday" : (day == 7) ? "Sunday" : "Invalid day of the week";

        System.out.println(dayOfWeek);



    }
}
