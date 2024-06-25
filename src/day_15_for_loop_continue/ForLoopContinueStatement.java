package day_15_for_loop_continue;

import java.util.Scanner;

public class ForLoopContinueStatement {
    public static void main(String[] args) {
        // write a program to print numbers that are divisible by 3 from 1 to 50

        for (int i=1; i <=50; i++){
            if (i % 3 !=0){
               continue; // skip current iteration and got the next iteration -> continue == skip
            }
            System.out.println(i);
            //System.out.println("Hello");
        }

        System.out.println("=========================================");
        // String input from the user and print all characters one by one except 'a'

        System.out.println("Enter a word");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        for (int i=0; i< str.length(); i++) { // i< str.length() -> i<= str.length()-1;
            if (str.charAt(i) == 'e'){
                continue;
            }
            System.out.println(str.charAt(i));
        }


    }
}
