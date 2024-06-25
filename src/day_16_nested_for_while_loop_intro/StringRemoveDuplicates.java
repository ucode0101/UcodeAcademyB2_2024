package day_16_nested_for_while_loop_intro;

import java.util.Scanner;

public class StringRemoveDuplicates {

    public static void main(String[] args) {
        // write a program to take input from the user and remove all duplicates
        // example "aabbcc" -> "abc"
        System.out.println("Please enter a word or sentence");

        Scanner input = new Scanner(System.in);

        String word = input.nextLine();
        String result="";

        for (int i=0; i <= word.length()-1; i++){
            String s = ""+word.charAt(i);

            if (!result.contains(s)){
                result +=word.charAt(i);
            }

        }
        System.out.println(result);

    }
}
