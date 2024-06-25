package day_11_scanner_continue_string_class_intro;

import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {
        // Write a program that calculates the sum of numbers entered by the user
        // until user enters a negative number.
        // this task we will do with Loop when we start loop

        int sum =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a positive number");

        int number = input.nextInt();


        if (number <0){

            System.out.println("You entered a negative number");
            return;
        }

        sum = number;


        System.out.println("Please enter another positive number");
        int anotherNum = input.nextInt();


        if (anotherNum <0){
            System.out.println("You entered a negative number");
            return;
        }
        sum += anotherNum;

        System.out.println(sum);








    }
}
