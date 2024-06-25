package day_28_arraylist_continue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {

    public static void main(String[] args) {

        ArrayList<Integer> numList = new ArrayList<>();
        numList.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println("Original: "+ numList);

        numList = multiplyItem(numList);

        System.out.println("After "+numList);

        System.out.println("==================================");

        numList = reverseArrayList(numList);
        System.out.println(numList);






    }

    public static ArrayList<Integer>  multiplyItem(ArrayList<Integer> list){

        // Write a method that takes ArrayList of Integer and multiply each item by itself

        for (int i=0; i< list.size(); i++){

           int tempResult =  list.get(i) * list.get(i);

           list.set(i, tempResult );
        }

        return list;

    }

    // Write a method that reverse ArrayList

    public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> list){

        ArrayList<Integer> result = new ArrayList<>();


        for (int i= list.size()-1; i>=0; i--){

            int num = list.get(i);

            result.add(num);
            //result.add(list.get(i));

        }
        return result;

    }


}
