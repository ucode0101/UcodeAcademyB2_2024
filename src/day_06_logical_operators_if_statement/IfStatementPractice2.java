package day_06_logical_operators_if_statement;

public class IfStatementPractice2 {
    public static void main(String[] args) {
        /*
        Task 1:
        1. Write a Java program that will accept two numbers and check if two numbers are equal or not.
        */
        int num1 = 50;
        int num2 = 47;

        if (num1 == num2){
            System.out.println("These numbers are equal");
        }
        System.out.println("====================================");

        // if two number are equal, or they are even number multiply num1 by num2 and print the resul

        //   false       or  it needs true and true in order to return true
        if (num1 == num2 || num1 % 2 == 0 && num2 % 2 == 0){

            num1 *= num2;
            System.out.println(num1);
        }








        /*
        Task 2:
        2. Write a Java program to implement following logic using if statement
        1. if hour is less than 12 noon, greet with Good Morning
        2. if hour is greater than or equal 12 noon but less than 3 pm, greet with Good Afternoon
        3. if hour is greater than or equal to 3 pm, greet with Good Evening
                 */
    }
}
