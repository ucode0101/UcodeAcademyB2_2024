package day_15_for_loop_continue;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // Palindrome is a string that reads the same in reverse -> civic, anna
       // write program to check if a string is palindrome

        System.out.println("Please enter a word");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String reverse = "";

        for (int i=word.length()-1; i>=0; i--){
            reverse += word.charAt(i);
        }
        if (word.equalsIgnoreCase(reverse)){
            System.out.println(word+" is Palindrome");
        }
        else {
            System.out.println(word+ " is not Palindrome");
        }



    }
}
