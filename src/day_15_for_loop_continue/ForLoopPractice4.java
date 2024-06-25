package day_15_for_loop_continue;

import java.util.Scanner;

public class ForLoopPractice4 {
    public static void main(String[] args) {
        // write a program to take string input (numbers and letters in ) from the user
        // and add sum of all number from the string in a int variable
        // example -> "j12a5va2" -> 10

        System.out.println("Please enter a word with numbers in it");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int sumOfNumber =0;

        for (int i=0; i< word.length(); i++){
            char ch = word.charAt(i);
            if (ch >='0' && ch <='9'){

                sumOfNumber += (int) (ch - '0'); // subtracting 0 converts character to integer
               // sumOfNumber +=(int) word.charAt(i); doesn't get the expected result
            }
        }
        System.out.println(sumOfNumber);

    }
}
