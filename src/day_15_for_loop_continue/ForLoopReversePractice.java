package day_15_for_loop_continue;

import java.util.Scanner;

public class ForLoopReversePractice {
    public static void main(String[] args) {
        // Reverse String in "java" -> "avaj"

        String str = "java";
        String reverse = "";

        // manually
       // reverse +=""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);

        for (int i=str.length()-1; i >=0; i--){
            // print it
            System.out.println(str.charAt(i));
            // assign each char to reverse
            reverse += str.charAt(i);
        }
        System.out.println(reverse);

        System.out.println("==========================================");

        // Scanner -> take string input from user and reverse
        System.out.println("Please enter a word or sentence");

        String s = new Scanner(System.in).nextLine();
        String result ="";

        for (int i= s.length()-1; i>=0; i--){
           // System.out.println(s.charAt(i));
            result += s.charAt(i);
        }
        System.out.println(result);







    }
}
