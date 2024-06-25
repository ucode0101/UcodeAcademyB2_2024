package day_15_for_loop_continue;

import java.util.Scanner;

public class CatAndDog {
    public static void main(String[] args) {
        // Write a program to check if "cat" & "dog" appear the amount of time in sentence

        System.out.println("Please enter a sentence containing cat and dog in");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        int dogCount=0;
        int catCount=0;

        for (int i=0; i<=word.length()-3; i++){
            String str = word.substring(i,i+3);

            if (str.equalsIgnoreCase("cat")){
                catCount ++;
            }
            else if (str.equalsIgnoreCase("dog")){
                dogCount ++;
            }
        }
        if (catCount == dogCount){
            System.out.println("Dog and Cat appeared same number of times in the sentence");
        }
        else {
            System.out.println("No Dogs or Cats appeared in the sentence");
        }
    }
}
