package day_33_methods_method_overloading_recap;

import java.util.Arrays;

public class ReturnMethodPractice3 {

    public static char [] toChar(String str){
        return str.toCharArray();
    }

    // create  a method that takes string as an argument, reverse and return it as char Array
    public static char [] reverseToCharArray(String str){
        StringBuilder s = new StringBuilder(str);
        str = s.reverse().toString();

        return str.toCharArray();
    }

    public static void main(String[] args) {
        char [] ch = toChar("java");
        System.out.println(Arrays.toString(ch));

        char [] ch2 = reverseToCharArray("java");
        System.out.println(Arrays.toString(ch2));
    }
}
