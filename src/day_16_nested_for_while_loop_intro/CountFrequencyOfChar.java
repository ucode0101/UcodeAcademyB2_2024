package day_16_nested_for_while_loop_intro;

import java.util.Scanner;

public class CountFrequencyOfChar {
    public static void main(String[] args) {
        // write a program to find frequency of char characters in a String
        // take input from the user
        // "java" -> j1a2v1

        System.out.println("Please enter a word or words");
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();

        String result = "";

        // assume the word is "java"
        for (int i=0; i<= word.length()-1; i++){ // i is 'a'
            int count =0;

            for (int j=0; j<= word.length()-1; j++ ){

                if (word.charAt(i) == word.charAt(j)){ //  j is 'a'

                    count +=1;
                }

            }
            if (!result.contains(""+word.charAt(i))){

                result += ""+ word.charAt(i)+ count;
                // j1a2
            }

        }
        System.out.println(result);


    }
}
