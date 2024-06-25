package day_29_predicate_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethods3 {
    public static void main(String[] args) {
        // Write a program to find max number from ArrayList

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,33,2,34,6,66,34,12,12,55,8,19));

        int max = list.get(0);

        for (int each : list){
            if (each > max){
                max = each;
            }

        }
        System.out.println(max);
        // max()
        int max2 = Collections.max(list);

        System.out.println(max2);
        System.out.println("====================");

        ArrayList<Character> chList = new ArrayList<>(Arrays.asList('a','d','i','w','j','k'));

        char ch = Collections.max(chList);
        System.out.println(ch);

        System.out.println("=========================================");


        ArrayList<String> strList = new ArrayList<>(Arrays.asList("wava","testing","seleniumm","z","postman","junit"));

        String str = Collections.max(strList);
        // For string, it does not return the longest string, it returns string that starts with highex char

        System.out.println(str);



    }
}
