package day_15_for_loop_continue;

import java.util.Scanner;

public class ForLoopBreakStatement {
    public static void main(String[] args) {
        // write a program to print from 1 to 50, and break/stop/terminate the loop
        // if any number is divisible by 9

        for (int i=1; i<=50; i++){
            if (i == 9){
                break;
            }
            System.out.println(i);
        }

        System.out.println("================================");
        // take string input from the user and print all characters one by one in reverse
        // if you find 'y' in the string break/stop/exit/terminate

        System.out.println("Please enter a word or sentence");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        for (int i=word.length()-1; i>=0; i--){

            if (word.charAt(i) == 'y'){
                break;
            }
            System.out.print(word.charAt(i));
        }


    }
}
