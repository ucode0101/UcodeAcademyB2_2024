package day_12_string_class_continue;

import java.util.Scanner;

public class StringMethodWithScanner2 {
    public static void main(String[] args) {
        // Write a program to print the middle char from the string.
        // String length can be any length

        String str = "selenium";

        int middle = str.length()/2;
        char middleChar = str.charAt(middle);
        System.out.println(middleChar);

        System.out.println("========================================================");

        // write a program to take string input from user
        // if the length is more than 10, and it is even, take first and last characters
        // if the length is more than 10, and it is odd, take first, middle, and last character
        // if the length is less or equal to 10,take middle character only

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence or a word");

        String sentence = input.nextLine();
        int x = sentence.length();

        if (x >10 && x % 2 ==0){
            System.out.println("First character: "+ sentence.charAt(0));
            System.out.println("Last character: "+ sentence.charAt(x-1));
            System.out.println("The length is: "+x);
        }
        else if (x > 10 && x % 2 !=0){
            System.out.println("First character: "+ sentence.charAt(0));
            System.out.println("Middle character: "+ sentence.charAt(x / 2));
            System.out.println("Last character: "+ sentence.charAt(x-1));
            System.out.println(x);

        }
        else {
            System.out.println(sentence.charAt(x/2));
            System.out.println(x);
        }




    }
}
