package day_28_arraylist_continue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        ArrayList<Integer> numList = new ArrayList<>();
        numList.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));


        for (int i=0; i< numList.size(); i++){

            //int num = numList.get(i);
            if (numList.get(i) % 2 !=0){
                numList.remove(i);
            }

        }
        System.out.println(numList);




//        numList = removeOddNumbers(numList);
//
//        System.out.println(numList);


    }

    // Write a method to remove all odd number from ArrayList Integer
    public static ArrayList<Integer> removeOddNumbers(ArrayList<Integer> list){

        for (int i=0; i< list.size(); i++){

            int num = list.get(i);

            if (num % 2 !=0){
                list.remove(i);

            }


        }
        return list;

    }
}
