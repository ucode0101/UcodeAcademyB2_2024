package day_30_arraylist_predicate_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice6 {
    public static void main(String[] args) {

        // Write a program to remove duplicates from int Array and sort

        int [] arr = {3,1,1,2,5,1,5,4,3,5,6,7,4,6,3,9,8,1};

        // Longer way, but works and acceptable
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : arr){
            if (!list.contains(each)){
                list.add(each);
            }
        }

        Collections.sort(list);
        System.out.println("ArrayList: "+list);


        arr = new int[list.size()];

        for (int i =0; i< list.size(); i++){
            arr[i] = list.get(i);
        }
        System.out.println("Array: "+ Arrays.toString(arr));


        // Sort and remove duplicate using Stream API/Java Stream
        int [] arr2 = {3,1,1,2,5,1,5,4,3,5,6,7,4,6,3,9,8,1};

        arr2 = Arrays.stream(arr2).distinct().sorted().toArray();

        System.out.println("Using Stream ");
        System.out.println(Arrays.toString(arr2));

        // Write a program to find max
        int min = Arrays.stream(arr2).sorted().distinct().toArray()[0];

        int max = Arrays.stream(arr2).sorted().distinct().toArray()[Arrays.stream(arr2).sorted().distinct().toArray().length-1];
        System.out.println(max);
        System.out.println(min);



    }
}
