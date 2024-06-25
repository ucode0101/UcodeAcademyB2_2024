package day_15_for_loop_continue;

import java.util.Scanner;

public class ForLoopPractice3 {
    public static void main(String[] args) {
        // write a java program to take string input containing numbers, special chars, and letter from the user
        // and store all number in separate string, specials in separate, and letters in separate string
        // lets assume all character are lower, or we can convert to lower case.

        System.out.println("Please enter a word or sentence");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String letters ="";
        String numbers ="";
        String specialChar ="";

        for (int i=0; i< word.length(); i++){
            if (word.charAt(i) >='a' && word.charAt(i) <='z'){
                letters += word.charAt(i);
            }
            else if (word.charAt(i) >='0' && word.charAt(i) <='9'){
                numbers += word.charAt(i);
            }
            else {
                specialChar += word.charAt(i);
            }

        }
        System.out.println("Letters: "+letters);
        System.out.println("Numbers: "+numbers);
        System.out.println("Special Character: "+specialChar);

    }
}
