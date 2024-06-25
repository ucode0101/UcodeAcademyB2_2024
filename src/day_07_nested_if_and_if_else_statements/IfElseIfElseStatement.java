package day_07_nested_if_and_if_else_statements;

public class IfElseIfElseStatement {

    public static void main(String[] args) {
        // write a program to find the largest number from 3 numbers
        int num1 = 481;
        int num2 = 89;
        int num3  = 138;

        if (num1 > num2 && num1 > num3){ // checking for the  first possible true condition
            System.out.println(num1 +" is the largest number");
        }
        else if (num2 > num1 && num2 > num3){ // checking for the second possible condition
            System.out.println(num2 +" is the largest number");
        }
        else { // else block will be executed if none of the above conditions are true
            System.out.println(num3 +" is the largest number");
        }


    }
}
