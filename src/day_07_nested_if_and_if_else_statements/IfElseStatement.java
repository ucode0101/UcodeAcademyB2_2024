package day_07_nested_if_and_if_else_statements;

public class IfElseStatement {

    public static void main(String[] args) {
        // 1. Write a Java program:
        //2) Display whether the number is an odd number or even number.

        int number = 25;

        if (number % 2 == 0){
            System.out.println("It is even number");
        }
        else {

            System.out.println("It is odd number");
        }

        System.out.println("================================================");
        // Write a java program to check if the number is greater than 50 and it is even

        if (number > 50 ){ // if statement true, that means else will not run even
                          // inner If statement is false

            if (number % 2 == 0){
                System.out.println("Number is greater than 50, and it is even");
            }
            else {
                System.out.println("The number is odd number");
            }
        }
        else {
            System.out.println("The number is less than 50");

        }

    }
}
