package day_15_for_loop_continue;

import java.util.Scanner;

public class ForLoopContinueAndBreak {

    public static void main(String[] args) {
        // take string input from user and print all characters one by one skip vowels
        // if you find 'y' break

        System.out.println("Please enter some word");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String vowels = "aeiou";

        for (int i=0; i< word.length(); i++){
            String s =""+ word.charAt(i);
            if (vowels.contains(s)){
                continue;
            }
           if (word.charAt(i) == 'y'){
                break;
            }
            System.out.print(word.charAt(i));
        }
    }
}
