package day_29_predicate_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethods5 {

    public static void main(String[] args) {
        // Write a program  to reverse ArrayList Integer
        // you can you store the result in new arraylist

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        ArrayList<Integer> result = new ArrayList<>();

        for (int i=list.size()-1; i>=0; i--){

            result.add(list.get(i));
        }
        System.out.println("Result "+result);

        Collections.reverse(list);
        System.out.println("Used reverse method: "+list);

        ArrayList<String> strList = new ArrayList<>(Arrays.asList("java","python","js","api"));
        Collections.reverse(strList);

        System.out.println(strList);

        ArrayList<Character> chList = new ArrayList<>(Arrays.asList('a','b','c','d'));
        Collections.reverse(chList);
        System.out.println(chList);







    }
}
