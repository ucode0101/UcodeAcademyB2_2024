package day_07_nested_if_and_if_else_statements;

public class NestedIfElseStatement {
    public static void main(String[] args) {
        // write a program to check if the number is even number
        // Pre condition -> it must greater than 60

        int num = 61;

        if ( num > 60){  // we check if num is greater than 60

            if (num % 2 == 0){  // if num is greater than 60, we check if it is even
                System.out.println("The number is even");
            }
            else { // if num is greater than 60, but it is odd number
                System.out.println("The number is Odd");
            }


        }
        else { // this one will be executed if the number is less than 60
            System.out.println("The number is not greater than 60");
        }

        System.out.println("==============================================");

        // write a program to check if the number is greater than 60 and less than 150
        // and, it is an Odd number

        if ( num > 60 && num < 150 ){

            if (num % 2 !=0){
                System.out.println("The number  is odd number");
            }
            else {
                System.out.println("The number is not odd number");
            }

        }
        else {
            System.out.println("The number is less than 60 or greater than 150");
        }

    }
}
