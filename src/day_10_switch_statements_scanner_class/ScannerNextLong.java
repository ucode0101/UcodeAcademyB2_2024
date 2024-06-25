package day_10_switch_statements_scanner_class;

import java.util.Scanner;

public class ScannerNextLong {

    public static void main(String[] args) {
        // write a program to take input from the user
        // and check if it is greater than 100 or not

        long number;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number");

        number = input.nextLong();

        if (number > 100){
            System.out.println(number+" is greater than 100");
        }
        else {
            System.out.println(number+" is less than 100");
        }
    }
}
