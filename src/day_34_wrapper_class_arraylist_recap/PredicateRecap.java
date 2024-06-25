package day_34_wrapper_class_arraylist_recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateRecap {
    public static void main(String[] args) {

        // write a program to remove all even numbers from ArrayList
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,22,2,3,33,23,4,55,6,6,22,12));


        //Predicate<Integer> p = i -> i % 2 ==0;

        //nums.removeIf(p);

        //nums.removeIf(x -> x % 2 ==0); // it removes all even numbers

        nums.removeIf(a -> a % 2 !=0); // it removes all odd numbers


        System.out.println(nums);

        System.out.println("==================================");

        ArrayList<String> str = new ArrayList<>();
        str.addAll(Arrays.asList("java","testing","api","sql"));

        // remove all item/object that has length of 3 or less

        str.removeIf(x -> x.length() <=3);
        System.out.println(str);


    }
}
