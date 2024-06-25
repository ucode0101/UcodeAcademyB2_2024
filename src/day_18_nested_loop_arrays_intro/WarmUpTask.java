package day_18_nested_loop_arrays_intro;

import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {

        //Task 1:
        //Write a program that takes a string as input and prints the reverse of the string
        // java -> avaj
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word");

        String str = input.nextLine();
        String reverse ="";

        for (int i= str.length()-1; i>=0; i--){
            // store each character one by from char backward
            reverse += str.charAt(i);
            // print each char in reverse
            System.out.print(str.charAt(i));
        }

        // we can either use the input we took from the user
        // or we can use any other string


        System.out.println("\n==============================================\n");


        // Task 8:
        //Write a program that takes a string as input and counts the most repeated character in the string.
        //example -> javava => most repeated character is 'a' 3
        //Hint: can be done with nested loop


        int count=0; // we will store the count
        char repeatedChar = '\0'; // we will store the character that appears the most
        // java
        for (int i=0; i< str.length(); i++){
            // this tempCount will be reinitialized every time outer starts
            int tempCount=0;

            for (int j=0; j<str.length(); j++){
                if (str.charAt(i) == str.charAt(j)){
                    tempCount ++;
                }
            }
            if (count < tempCount){
                count = tempCount;
                repeatedChar = str.charAt(i);
            }

        }
        System.out.println(repeatedChar +" appears: "+count);



    }
}
