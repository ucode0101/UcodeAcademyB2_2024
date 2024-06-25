package day_17_while_and_do_while_loops;

import java.util.Scanner;

public class WhileLoopContinueBreak {

    public static void main(String[] args) {

        // take input from the user and print all characters one by one
        // except a, b, and c. If you find 'y' in the string, exit the loop

        System.out.println("Enter a word or sentence");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int i=0;
        while ( i< word.length()){

            if (word.charAt(i) == 'a' || word.charAt(i) == 'b' || word.charAt(i) == 'c'){
                i++;
                continue;
            }
            if (word.charAt(i) == 'y'){
                break;
            }
            System.out.print(word.charAt(i));

        }




    }
}
