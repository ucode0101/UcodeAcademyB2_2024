package day_23_decimal_format_arrays_loops_review;

import java.util.Arrays;
import java.util.Scanner;

public class WarmUpTaskSortString {
    public static void main(String[] args) {

        // Use Scanner to take input from the user
        // Write a program to sort String in ascending
        // "cab" -> "abc"

        System.out.println("Please enter a word");

        Scanner input = new Scanner(System.in);

        String word = input.nextLine();

        char [] chars = word.toCharArray();

        Arrays.sort(chars);

        // one way - the easiest way
        //word = new String(chars);

        // second way
        word = Arrays.toString(chars);

        // replace all [ , ]
        word = word.replaceAll("[\\[\\] ,]","");

        System.out.println(word);







    }
}
