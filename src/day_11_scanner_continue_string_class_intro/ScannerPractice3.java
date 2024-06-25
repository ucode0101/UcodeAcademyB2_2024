package day_11_scanner_continue_string_class_intro;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        // write a program to take 4 number from user and return the average number

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");

        int num1 = input.nextInt();

        System.out.println("Enter second number");

        int num2 = input.nextInt();

        System.out.println("Enter third number");

        int num3 = input.nextInt();

        System.out.println("Enter fourth number");

        int num4 = input.nextInt();

        int average = (num1 + num2 + num3 + num4) / 4;
        System.out.println(average);


    }
}
