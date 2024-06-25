package day_14_string_methods_and_for_loop;

import java.util.Scanner;

public class StringMethodsPractice1 {

    public static void main(String[] args) {
        // Write a program to take String input from user and check:
        // if it starts "A" or "a" print "Starts with A"
        // if it ends with "A" or "a" print "Ends with A"
        // if it contains "ab" print "Has ab"
        // else convert the string to upper case and print it

        System.out.println("Please enter some string");

        Scanner input = new Scanner(System.in);

        String word = input.nextLine();
        if (word.toLowerCase().startsWith("a")){
            System.out.println("Starts with A");

        }
        else if (word.toLowerCase().endsWith("a")){
            System.out.println("Ends with A");
        }
        else if (word.toLowerCase().contains("ab")){
            System.out.println("Has ab");
        }
        else {
            //word = word.toUpperCase(); // convert to upper case and assign it to itself
            System.out.println(word.toUpperCase()); // convert to upper case and print
        }

    }
}
