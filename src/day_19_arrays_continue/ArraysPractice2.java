package day_19_arrays_continue;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {
        char [] chars = {'a','c','i','w','m'};

        char [] chars2 = new char[5];
        chars2[0] = 'a';
        chars2[1] = 'b';

        String [] strings = {"java","selenium","api","testng"};

        String[] strings2 = new String[4];

        strings2[0] = "java";
        strings2[1] = "api";

        String str = "selenium";

        char [] chArray = str.toCharArray();

        // print chArray directly using Arrays.toString()
        System.out.println(Arrays.toString(chArray));





    }
}
