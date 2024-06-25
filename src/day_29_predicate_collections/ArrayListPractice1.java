package day_29_predicate_collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

        System.out.println(list);

        System.out.println("======================");
        System.out.println();

        for (int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println();
        System.out.println("============================");


        for (int each : list){
            System.out.print(each* each);
        }
        System.out.println();
        System.out.println("========================");


        // this is forEach void method, it is used to print collection type/ArrayList
        list.forEach(x ->System.out.println(x));

        System.out.println("===============================================");

        // Write a program to multiply each number by itself and print it

        list.forEach(k -> System.out.println(k * k));




    }
}
