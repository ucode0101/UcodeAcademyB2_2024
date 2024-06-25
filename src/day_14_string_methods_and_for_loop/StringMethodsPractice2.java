package day_14_string_methods_and_for_loop;

import java.util.Scanner;

public class StringMethodsPractice2 {
    public static void main(String[] args) {

        // Take String input from user and check
        // if String length is odd, convert the first half of the string to upper case
        // if String length is even, convert the second half of the string to upper case

        System.out.println("Please enter a string");
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();
        String result ="";

        if (word.length() % 2 !=0){
           result = word.substring(0, word.length()/2).toUpperCase();
        }
        else {
            result = word.substring(word.length()/2).toUpperCase();
        }
        System.out.println(result);
        System.out.println(word.length());

        System.out.println("=========================");
        String str = "tests";
        System.out.println(str.substring(0,str.length()/2));

    }
}
