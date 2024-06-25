package day_19_arrays_continue;

import java.util.Arrays;

public class SplitAndToCharArray {
    public static void main(String[] args) {
        String str = "I love java";

        // convert str to char Array using toCharArray() method
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));

        System.out.println("==================================");
        // convert str to String Array using split() method


        String [] string = str.split(""); // this will convert each character as a String
        System.out.println(Arrays.toString(string));

        System.out.println("===============================================");

        // convert str to String Array split from white spaces
        String [] strings2 = str.split(" ");
        System.out.println(Arrays.toString(strings2));

        System.out.println("==============================");
        // write a program to find how many words are there in a sentence

        String sentence = "I love java and I love selenium";
        String [] s = sentence.split(" ");

        System.out.println(Arrays.toString(s));

        System.out.println("Total words in sentence is: "+s.length);



    }
}
