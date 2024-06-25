package day_07_nested_if_and_if_else_statements;

public class NestedIfStatement {

    public static void main(String[] args) {

        // Write a program to check if the number is greater than 50 and it is even number

        int number =88;

        // one way we can do it using && logical And
        if (number >50 && number % 2 ==0){
            System.out.println("Greater than 50 and it is even number");
        }

        System.out.println("============================================");

        // another way we can do it with nested if
        if (number > 50){

            if (number % 2 == 0){

                System.out.println("Greater than 50 and it is even number");
            }

        }



    }

}
