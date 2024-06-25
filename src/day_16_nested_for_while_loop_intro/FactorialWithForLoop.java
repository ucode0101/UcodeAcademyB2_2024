package day_16_nested_for_while_loop_intro;

import java.util.Scanner;

public class FactorialWithForLoop {

    public static void main(String[] args) {
        // Factorial of a number is the sum of multiplication of all integers smaller
        // than that positive number 5*4*3*2*1
        // factorial of 5 is 120
        // 5 * 4 = 20
        // 20 * 3 = 60
        // 60 * 2 = 120
        // 120 * 1 = 120

        /// write a program to returns the factorial of a number
        // take a number from 5 to 20 and return its factorial number

        System.out.println("Enter a number 5 to 20");
        int input = new Scanner(System.in).nextInt();

        int factorial = 1;


        for (int i = input; i >=1; i--){

            factorial *= i;

        }

        System.out.println(factorial );

    }
}
