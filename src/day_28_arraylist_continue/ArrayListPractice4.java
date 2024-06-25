package day_28_arraylist_continue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice4 {

    public static void main(String[] args) {


        String str = "I started ArrayList and it is fun";
        String [] arr = str.split(" ");
        ArrayList<String> s = new ArrayList<>();
        s.addAll(Arrays.asList(str.split(" "))); // We can use string split method to store string into ArrayList

        //System.out.println(s);


        // Combine two string Array into ArrayList String
        String [] arr1 = {"java","junit","testng"};
        String [] arr2 = {"python","selenium","maven"};

        ArrayList<String> list = new ArrayList<>();

      //  list.addAll(Arrays.asList(arr1)); // We can add it this

        //list.addAll(Arrays.asList(arr2)); // We can add it this

        // not officiant way but we want to practice
        for (String each : arr1){

            list.add(each);
        }

        for (String each : arr2){

            list.add(each);
        }







       System.out.println(list);



    }



}
