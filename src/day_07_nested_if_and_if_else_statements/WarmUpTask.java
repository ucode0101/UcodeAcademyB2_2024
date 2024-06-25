package day_07_nested_if_and_if_else_statements;

public class WarmUpTask {
    public static void main(String[] args) {
        // 2. Write a Java program to implement following logic using if statement
        // 1.if hour is less than 12 noon, greet with Good Morning
        //2. if hour is greater than or equal 12 noon but less than 3 pm, greet with Good Afternoon
        //3. if hour is greater than or equal to 3 pm, greet with Good Evening

        int hours = 15; // we assume that the number is between 0 and 23

        if (hours < 12){
            System.out.println("Good Morning");
        }

        if (hours >= 12 && hours <15){
            System.out.println("Good Afternoon");
        }

        if (hours >= 15 ){
            System.out.println("Good evening");
        }



    }
}
