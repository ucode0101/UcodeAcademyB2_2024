package day_29_predicate_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateIntro {

    public static void main(String[] args) {
        // Remove all odd numbers from ArrayList
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,5,7,4,8,6,13,11));

        Predicate<Integer> predicate = x -> x % 2 ==0;

        list.removeIf(predicate);
        System.out.println(list);

        // Remove all word that has 3 or fewer characters
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("java","api","selenium","js","automation","sql","testing"));

        Predicate<String> stringPredicate = x -> x.length() >=3;
        strList.removeIf(stringPredicate);
        System.out.println(strList);


        // We can do it with for loop and if condition, but our code or logic might be officiant
//        for (int i=0; i< list.size(); i++){
//
//            if (list.get(i) % 2 !=0){
//                list.remove(i);
//                i--;
//            }
//
//        }



    }
}
