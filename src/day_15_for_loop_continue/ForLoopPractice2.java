package day_15_for_loop_continue;

import java.util.Scanner;

public class ForLoopPractice2 {

    public static void main(String[] args) {
        // take string input from user and check if the length is even or odd
        // if length is even, convert it to upper case and print all characters one by one
        // if length is odd, convert it to upper case and print all character in reverse

        System.out.println("Please enter a word or sentence");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        if (str.length() % 2 ==0){
            str = str.toUpperCase();
            for (int i=0; i<= str.length()-1; i++){
                System.out.print(str.charAt(i));
            }
        }
        else {
            str = str.toUpperCase();
            for (int i= str.length()-1; i>=0; i--){
                System.out.print(str.charAt(i));
            }
        }
    }
}
