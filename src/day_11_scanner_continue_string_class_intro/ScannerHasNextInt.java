package day_11_scanner_continue_string_class_intro;

import java.util.Scanner;

public class ScannerHasNextInt {

    public static void main(String[] args) {
        // write a program to take 2 numbers from the user
        // and return sum numbers

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");

        int num1 =0;
        int num2 =0;
        if (scanner.hasNextInt()){

            num1 = scanner.nextInt();
            System.out.println("Please enter second number");

        } else {
            System.out.println("Please enter a valid number");
        }


        if (scanner.hasNextInt()){
            num2 = scanner.nextInt();
        }


        scanner.close();
        System.out.println(num1+num2);



    }
}
