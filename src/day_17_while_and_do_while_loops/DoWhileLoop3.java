package day_17_while_and_do_while_loops;

import java.util.Scanner;

public class DoWhileLoop3 {
    public static void main(String[] args) {
        // write a program to take input from user "yes" or "no"
        // if the user enters something else, keep asking
        System.out.println("Please enter yes or no");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();

       do {
           if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")){
               System.out.println("You entered: "+ answer);
               break;
           } else {
               System.out.println("Please enter 'yes' or 'no'");
               answer = input.nextLine();
           }
       } while (true);

    }
}
