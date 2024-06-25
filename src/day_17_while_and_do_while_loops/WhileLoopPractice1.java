package day_17_while_and_do_while_loops;

import java.util.Scanner;

public class WhileLoopPractice1 {

    public static void main(String[] args) {

        // write a program to ask user to enter a positive number
        // If the user enters a negative, keep asking until the user enters a positive number

        System.out.println("Please enter a positive number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        // one way is to check if the number is positive
        while (num <0){
            System.out.println("Please enter a positive number");
            num = input.nextInt();
        }
        System.out.println(num);

        // another way, is to use if statement inside while loop
//        while (true){
//            if (num <0){
//                System.out.println("Please enter a positive number");
//                num = input.nextInt();
//            } else {
//                System.out.println(num);
//                break;
//            }
//        }



    }
}
