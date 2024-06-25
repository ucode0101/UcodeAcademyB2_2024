package day_35_custom_class_and_object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTask3 {
    public static void main(String[] args) {

        // Write a program to find frequency of characters
        // java -> j1a2v1
        String str = "dkadlskdjfiejfclkjddlkjsldkfj";
        String result ="";

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

       for (int i=0; i< list.size(); i++){

           String temp = list.get(i);

           int count = Collections.frequency(list,temp );

           if (!result.contains(temp)){
               result += temp+ count;
           }

       }

        System.out.println(result);




    }
}
