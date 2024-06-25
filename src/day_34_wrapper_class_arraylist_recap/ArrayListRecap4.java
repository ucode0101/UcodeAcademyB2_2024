package day_34_wrapper_class_arraylist_recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListRecap4 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(5,6,2,2,6,2,6,4,3,1,6,7,9,4));

        int max = Collections.max(nums);
        int min = Collections.min(nums);


        System.out.println(max);
        System.out.println(min);

        System.out.println("============================");
        System.out.println(nums);

        Collections.reverse(nums);

        System.out.println(nums);

        System.out.println("=================================");

        // find how many times 2 appears in ArrayList

        int count =0;
        for (int i : nums){
            if (i == 2){
                count++;
            }
        }

        System.out.println(count);

        int count2 = Collections.frequency(nums,2);
        System.out.println(count2);
        System.out.println("=======================================");

        ArrayList<Character> ch = new ArrayList<>(Arrays.asList('a','b','b','a','b','c','d','a'));

        int c = Collections.frequency(ch,'a');
        System.out.println(c);


    }
}
