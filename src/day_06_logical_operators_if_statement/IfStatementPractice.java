package day_06_logical_operators_if_statement;

public class IfStatementPractice {

    public static void main(String[] args) {
        // Task:
        // Write Java program that will accept three numbers and return the greatest number.
        int num1 = 44;
        int num2 = 229;
        int num3 = 89;

        // if num1 is greater than num2 and num2
        // then this will be executed
        if ( num1 > num2 && num1 > num3){
            System.out.println("The greatest number is: "+ num1);
        }

        // if this is false the code will not be executed
        if ( num2 > num1 && num2 > num3){
            System.out.println("The greatest number is: "+ num2);
        }

        if (num3 > num1 && num3 > num2){
            System.out.println("The greatest number is: "+ num3);
        }


    }
}
