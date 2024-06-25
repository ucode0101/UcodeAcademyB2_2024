package day_11_scanner_continue_string_class_intro;

import java.util.Scanner;

public class ScannerPractice1 {
    public static void main(String[] args) {
        // write a program to ask if the user wants some calculation
        // if the user says yes, the calculator will start if the user say no the calculator will not start
        // we take true for Yes, and false for No

        Scanner input = new Scanner(System.in);
        System.out.println("Hi there, what is your name?");

        String name = input.next();

        String name2 = "Yes";

        System.out.println("Do you want to play some game "+name+" ?");

        boolean answer = input.nextBoolean();

        int num1 =0;
        int num2 =0;
        String operator="";

        // since we are getting the input string from user, == operator always return false in this example
        if (answer){ // means -> answer == true
            System.out.println("Please enter a valid number "+name);
            num1 = input.nextInt();

            System.out.println("Please enter second number");

            num2 = input.nextInt();

            System.out.println("Please enter one these arithmetic operator *, /, +, -");

            operator = input.next();

            switch (operator){

                case "*":
                    System.out.println(num1 * num2);
                    break;
                case "/":
                    System.out.println(num1 / num2);
                    break;
                case "+":
                    System.out.println(num1 + num2);
                    break;
                case "-":
                    System.out.println(num1 - num2);
                    break;
                default:
                    System.out.println("Invalid operator");
                    break;

            }


        } else {
            System.out.println("No problem "+ name);
        }
        input.close();

    }
}
