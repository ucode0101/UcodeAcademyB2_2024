package day_34_wrapper_class_arraylist_recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListRecap3 {
    public static void main(String[] args) {
        ArrayList<Character> ch = new ArrayList<>(Arrays.asList('a','b','c','e','f'));

        ch.addAll(Arrays.asList('g','h','i'));

        System.out.println(ch);

        boolean b = ch.contains('c');
        System.out.println(b);

        ch.removeAll(Arrays.asList('a','i','d'));
        System.out.println(ch);

       ch.retainAll(Arrays.asList('b','c'));
        System.out.println(ch);



        System.out.println("=============================================");

        ArrayList<Integer>  nums = new ArrayList<>(Arrays.asList(4,1,6,8,3,9,2,22,1,1,1));

        Collections.sort(nums);
        System.out.println(nums);

        Collections.swap(nums, 0,1);
        System.out.println(nums);

        Collections.replaceAll(nums, 1,0);
        System.out.println(nums);



    }
}
