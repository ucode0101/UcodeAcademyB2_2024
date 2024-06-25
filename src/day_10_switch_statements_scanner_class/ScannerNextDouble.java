package day_10_switch_statements_scanner_class;

import java.util.Scanner;

public class ScannerNextDouble {
    public static void main(String[] args) {
        // write program to take input from the user
        // and check if remainder 3 is grater than 5

        double number;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number");

        number = input.nextDouble();

        if (number % 3 > 5){
            System.out.println(number+" remainder 3 is grater than 5");
        } else {
            System.out.println(number+" remainder 3 is not greater than 5");
        }

        input.close();

    }
}
