package day_30_arraylist_predicate_lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class ArrayListPractice4 {
    public static void main(String[] args) {
        // Write a program to remove divisible by 3, and by 5

        ArrayList<Integer> list = new ArrayList<>();
        for (int i=1; i<=50; i++){
            list.add(i);
        }

        Predicate<Integer> removeDivisible = x -> x % 3 ==0 || x % 5 ==0;

        list.removeIf(removeDivisible);

        System.out.println(list);


    }
}
