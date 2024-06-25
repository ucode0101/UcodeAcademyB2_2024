package day_35_custom_class_and_object;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUpTask2 {
    public static void main(String[] args) {
        //Warm up task 2:
        //Write a program to check if a number is even or odd
        //if the number is even multiply it by 2 else multiply it by 3

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(22,1,2,45,56,89,20,21,23));

        for (int i=0; i< list.size(); i++){
            if (list.get(i) % 2 ==0){
                list.set(i, list.get(i) * 2);
            } else {
                list.set(i, list.get(i) * 3);
            }
        }

        System.out.println(list);

        System.out.println("===============================");

        String str = "testing";

        ArrayList<String> strings = new ArrayList<>(Arrays.asList(str.split("")));

        System.out.println(strings);
    }
}
