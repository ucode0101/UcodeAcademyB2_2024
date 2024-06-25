package day_30_arraylist_predicate_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice5 {

    public static void main(String[] args) {

        // Write a program to find frequency of character in a string
        // java -> j1a2v1

        String str ="aaabkdkdadrdkajdlsjdfsdlfkja";

        String result ="";

        ArrayList<String> strList = new ArrayList<>(Arrays.asList(str.split("")));

        for (int i=0; i< strList.size(); i++){

            String temp = strList.get(i);

            int count = Collections.frequency(strList, temp);

            if (!result.contains(temp)){
                result += temp+count;
            }



        }

        System.out.println(result);



    }
}
