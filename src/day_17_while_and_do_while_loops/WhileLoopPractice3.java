package day_17_while_and_do_while_loops;

import java.util.Scanner;

public class WhileLoopPractice3 {
    public static void main(String[] args) {
        // write a program to ask user to enter from 1 to 7
        // and print day of the week 1 -> Mon, 2 -> Tue, etc.
        // if the number is not in the range of 1 to 7, keep asking to enter a number

        System.out.println("Please enter a number from 1 to 7");

        Scanner input = new Scanner(System.in);
        int number =0;

        // check to make sure it a number first
//        if (input.hasNextInt()){
//            number = input.nextInt();
//
//        }

      // Assume user enters a valid number
        while ( number <1 || number >7){
            System.out.println("Please enter a valid number");
            number = input.nextInt();
        }



    }
}
