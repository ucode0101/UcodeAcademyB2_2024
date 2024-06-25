package day_12_string_class_continue;

import java.util.Scanner;

public class StringMethodsWithScanner1 {
    public static void main(String[] args) {

        // write a program to take string input from user and check
        // if the length is even or odd. If it is even print the first, if odd print the last char

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any String");

        // storing user input in String
        String word = input.nextLine();

        // storing the length of the word in int
        int wordLength = word.length();

        if (wordLength % 2 == 0){
            System.out.println(word.charAt(0));
            System.out.println(wordLength);
        } else {
            System.out.println(word.charAt(wordLength-1));
            System.out.println(wordLength);


        }


    }
}
