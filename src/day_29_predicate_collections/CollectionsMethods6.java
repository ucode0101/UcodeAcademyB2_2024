package day_29_predicate_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethods6 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,1,2,3,4,4,444,5,5,5,5,5));

        //set() -> To set/assign a new value at the given index
        list.set(7, 555);
        System.out.println(list);
        System.out.println("=======================");
        int [] a = {1,2,3,4,5,6,7,8};
        a[3]=99;
        System.out.println(Arrays.toString(a));

        System.out.println("=======================");

        // Collections.replaceAll()

        Collections.replaceAll(list, 5, 7);
        System.out.println(list);





    }
}
