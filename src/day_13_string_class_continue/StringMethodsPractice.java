package day_13_string_class_continue;

import java.util.Scanner;

public class StringMethodsPractice {
    public static void main(String[] args) {

        // Take string from user and check if the first char is upper or lower case
        // if it is upper case convert it to lower, if it is lower case convert it to upper case
        System.out.println("Please enter a word");

        Scanner input = new Scanner(System.in);

        String word = input.nextLine();
        String result ="";

        if (word.charAt(0) >='a' && word.charAt(0) <='z'){
            // now we need to get the first char as string so can replace
            String firstChar =""+ word.charAt(0);
            word = word.replaceFirst(firstChar,firstChar.toUpperCase());
        } else {
            // now we need to get the first char as string so can replace
            String first = ""+ word.charAt(0);

            word = word.replaceFirst(first,first.toLowerCase());
        }
        System.out.println(word);

    }
}
