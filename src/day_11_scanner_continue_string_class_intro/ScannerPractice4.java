package day_11_scanner_continue_string_class_intro;

import java.util.Scanner;

public class ScannerPractice4 {
    public static void main(String[] args) {

        // take a number from user and check if it is even or odd
        // if it is even multiply it by 4, if it is odd multiply it by 5

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");

        int number = input.nextInt();

        if (number % 2 ==0){
            System.out.println(number * 4);
        }
        else {
            System.out.println(number * 5);
        }

    }
}
