package day_28_arraylist_continue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice6 {

    public static void main(String[] args) {

       // Write a program to remove all odd numbers from ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(23,56,11,14,56,77,888,12,1,3,5,7,19,44));



        for (int i=0; i< list.size(); i++){

            //int x = list.get(i);

            if (list.get(i) % 2 !=0){
                list.remove(i);
                //System.out.println(list.size());
               i--; // We want to make sure the index matches for next iteration if we remove odd num



            }
        }
        System.out.println(list);

    }
}
