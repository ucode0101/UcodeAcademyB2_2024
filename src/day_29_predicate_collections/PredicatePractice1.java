package day_29_predicate_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class PredicatePractice1 {

    public static void main(String[] args) {


        // Write a program to remove all characters between d and p
        Predicate<Character> predicate = c -> c >='d' && c <='p';

        ArrayList<Character> chList = new ArrayList<>(Arrays.asList('a','b','d','e','j','o','p','s','w'));

        chList.removeIf(predicate);
        System.out.println(chList);

        // Remove even numbers from ArrayList using lambda expression in removeIf()

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,5,7,4,8,6,13,11));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,5,7,4,8,6,13,11));

        list.removeIf(x -> x % 2 !=0);
        // get it done




        System.out.println(list);
        System.out.println(list);


    }
}
