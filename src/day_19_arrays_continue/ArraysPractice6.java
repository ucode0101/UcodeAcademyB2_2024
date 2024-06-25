package day_19_arrays_continue;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysPractice6 {
    public static void main(String[] args) {
        String [] strings = {"java","tea","api","hi","selenium","testng"};
        System.out.println(Arrays.toString(strings));

        // Arrays.sort(strings) doesn't sort String Array based on the length element
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));

        System.out.println("===================================");
        // sorting based on String length
        ///Arrays.sort(strings, Comparator.comparing(String::length));

        //System.out.println(Arrays.toString(strings));



    }
}
