package day_15_for_loop_continue;

import java.util.Scanner;

public class ForLoopPractice5 {
    public static void main(String[] args) {
        // write a program to take a sentence from the user and check how many times "and" appears
        //

        System.out.println("Please enter a sentence");
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        int andCount =0;
        // java and selenium and api


        for (int i=0; i<= sentence.length()-3; i++){
            String str = sentence.substring(i,i+3);
            if (str.equals("and")){
                andCount +=1;
            }
        }
        System.out.println("Number of 'and' in a sentence: "+ andCount);
    }
}
