package day_14_string_methods_and_for_loop;

import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {
        // Task 1:
        //Write a program to take input from user and  check if first and last character are equal.
        // If they are equal,convert them to upper case, if not convert the whole string to upper case.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter some word or sentence");

        String word = input.nextLine();
        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length()-1);
        String firstLetter =""+ word.charAt(0);
        String lastLetter = ""+ word.charAt(word.length()-1);
        String result ="";


        if (firstChar == lastChar){

//            word = word.substring(0,1).toUpperCase() + word.substring(1, word.length()-1)
//                    + word.substring(word.length()-1).toUpperCase();

           // result += firstLetter.toUpperCase() + word.substring(1,word.length()-1)+ lastLetter.toUpperCase();
            result = word.substring(0,1).toUpperCase() + word.substring(1,word.length()-1) + word.substring(word.length()-1).toUpperCase();

        } else {
//            word = word.toUpperCase();
            result = word.toUpperCase();
        }
        System.out.println(result);
    }
}
