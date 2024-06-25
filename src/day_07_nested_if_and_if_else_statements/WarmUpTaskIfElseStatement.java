package day_07_nested_if_and_if_else_statements;

public class WarmUpTaskIfElseStatement {
    public static void main(String[] args) {
        // 2. Write a Java program to implement following logic using if statement
        // 1.if hour is less than 12 noon, greet with Good Morning
        //2. if hour is greater than or equal 12 noon but less than 3 pm, greet with Good Afternoon
        //3. if hour is greater than or equal to 3 pm, greet with Good Evening

        int hour = 17; // we assume the hour is between 0 and 23

            if (hour < 12){
                System.out.println("Good Morning");
            }
            else if(hour >=12 && hour <15){
                System.out.println("Good afternoon");
            }
            else {
                System.out.println("Good Evening");
            }






    }
}
