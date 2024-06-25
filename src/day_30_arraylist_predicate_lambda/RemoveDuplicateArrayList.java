package day_30_arraylist_predicate_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicateArrayList {
    public static void main(String[] args) {

        // Write a program that remove all duplicates
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,1,2,3,4,5,5,6));
        // -> 4,6
        ArrayList<Integer> uniques = new ArrayList<>();
        //contains() -> is used to check if ArrayList/List contains given object/item/element
        // Brute force/ Traditional way

        for(int i=0;i< list.size(); i++){
            int count =0;
           for (int j=0; j< list.size(); j++){

               if (list.get(i).equals(list.get(j))){
                   count++;
               }
           }
           if (count ==1){
               uniques.add(list.get(i));
           }

        }
        System.out.println(uniques);
        System.out.println("===============================");

        // Using removeIf() and frequency


        // x % 2 ==0
        int frequencyOfNum = Collections.frequency(list, 1);
      //  System.out.println(frequencyOfNum);

        list.removeIf(x -> Collections.frequency(list, x ) ==1 );
        System.out.println(list);









    }
}
