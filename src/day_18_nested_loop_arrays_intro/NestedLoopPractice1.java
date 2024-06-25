package day_18_nested_loop_arrays_intro;

import java.util.Scanner;

public class NestedLoopPractice1 {
    public static void main(String[] args) {


        // Task 8:
        //Write a program that takes a string as input and counts the most repeated character in the string.
        //example -> javava => most repeated character is 'a' 3
        //Hint: can be done with nested loop

        System.out.println("Please enter some word");

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        int i=0;

        int count=0;
        char repeatedChar ='\n';

        while (i <str.length()){
            int j=0;


            int tempCount =0;

            while (j < str.length()){



                if (str.charAt(i) == str.charAt(j)){
                    tempCount ++;
                }
                j++;

            }
            if (count < tempCount){
                count = tempCount;
                repeatedChar = str.charAt(i);
            }
            i++;

        }
        System.out.println(repeatedChar + " --> "+ count);


    }
}
