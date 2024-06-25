package day_28_arraylist_continue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods4 {

    public static void main(String[] args) {

        ArrayList<Double> list = new ArrayList<>();

        list.add(4.5);
        list.addAll(Arrays.asList(7.8,22.2,8.0, 12.12, 11.0, 8.0));

        System.out.println(list);
        // removeAll()

       list.removeAll(Arrays.asList(7.8,8.0, 11.0));

        System.out.println(list);

        System.out.println("=============================");

        //retainAll()

        ArrayList<Integer> intArray = new ArrayList<>();
        intArray.addAll(Arrays.asList(2,2,1,2,4,5,6,4,3,3,4,5));

        intArray.retainAll(Arrays.asList(2,1,3));
        System.out.println(intArray);


    }
}
