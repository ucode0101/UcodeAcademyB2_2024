package day_30_arraylist_predicate_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class ArrayListPractice2 {

    public static void main(String[] args) {


        // Write a program to remove all numbers between 5 and 15 from ArrayList
        // Use predicate:

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6,2,11,23,4,1,1,2,3,44,5,665,544,4,12,11));

        Predicate<Integer> predicate = x -> x >=5 && x <=15;

        list.removeIf(predicate);

        System.out.println(list);

        System.out.println("=========================================");

        // Write a program to remove any number that is greater than 40, or it is odd number

        Predicate<Integer> predicate2 = x -> x >40 || x % 2 !=0;
        list.removeIf(predicate2);

        System.out.println(list);



    }
}
