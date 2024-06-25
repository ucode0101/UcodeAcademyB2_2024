package day_35_custom_class_and_object;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUpTask1 {
    public static void main(String[] args) {
    //Warm up task 1:
    //Write a program to remove all numbers that are less than 5 or greater
    // than 10 using removeIf() (lambda expression)

        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(2,1,3,4,55,6,7,88,12,34,3,1));

        // using for loop and some logic
//        for (int i=0; i< numList.size(); i++){
//            if (numList.get(i) <5 || numList.get(i) >10){
//                numList.remove(i);
//                i--;
//            }
//        }

        // using removeIf with lambda expression


        numList.removeIf(x -> x< 5 || x >10 );

        System.out.println(numList);

        System.out.println("============================================");

        // write a program to remove any number that are greater than 10 and it is even number

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(33,21,20,22,3,44,12,32,111,22));

        // using for loop and some logic
//        for (int i=0; i< list.size(); i++){
//            if (list.get(i) > 10 && list.get(i) % 2 ==0){
//                list.remove(i);
//                i--;
//            }
//        }

        // using removeIf() with lambda expression

        list.removeIf(x -> x >10 && x % 2 ==0);

        System.out.println(list);



    }
}
