package day_10_switch_statements_scanner_class;

import java.util.Scanner;

public class ScannerNextInt {
    public static void main(String[] args) {

        // task 1:
        // write a program to take the input from the user
        // and check if the number is even or odd

        // declare a variable
        int number;

        // create object/variable from Scanner class
        Scanner input = new Scanner(System.in);

        // some message to display
        System.out.println("Please enter a number");

        // assign the user input to number variable
        number = input.nextInt();

        if (number % 2 == 0){
            System.out.println(number +" is even number");
        }
        else {
            System.out.println(number+ " is odd number");
        }


    }
}
