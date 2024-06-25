package day_25_methods_loops_strings_arrays_recap;

import java.util.Arrays;

public class CustomMethodSortString {
    public static void main(String[] args) {
        String str ="java";

        //String s = sortString(str); if we want to store in a new variable
        str = sortString(str); // sort and assign back to itself

        System.out.println(str);

        System.out.println(sortString("ktyelsdouqwe;ljasdg;fhasas;ldfjg;asjidf;lj"));

        System.out.println("======================");

        sortString2("selenium");

    }

    public static String sortString(String str){

        char ch [] = str.toCharArray();
        Arrays.sort(ch);

       // String sorted = new String(ch);

        return  new String(ch);
    }

    public static void sortString2(String str){

        char ch [] = str.toCharArray();
        Arrays.sort(ch);

         String sorted = new String(ch);

        System.out.println(sorted);
    }

}
