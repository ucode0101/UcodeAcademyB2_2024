package day_30_arraylist_predicate_lambda;

import java.util.Arrays;
import java.util.Comparator;

public class SortArrays {
    public static void main(String[] args) {

        int  [] numbers = {4,1,3,2,5,8,6,7};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String [] str = {"test","java","api","selenium"};

        // Long way, but still works
//        for (int i=0; i< str.length; i++){
//
//            for (int j=0; j< str.length; j++){
//
//                if (str[i].length() < str[j].length()){
//                    String temp = str[i];
//                    str[i] = str[j];
//                    str[j]= temp;
//                }
//
//            }
//        }

        // Using Comparator Interface. (not our topic)
        Arrays.sort(str, Comparator.comparing(String::length));

        System.out.println(Arrays.toString(str));
    }
}
