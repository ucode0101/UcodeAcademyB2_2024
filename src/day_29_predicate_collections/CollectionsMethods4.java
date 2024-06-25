package day_29_predicate_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethods4 {
    public static void main(String[] args) {

        // Collections.min() method


        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(4,3,77,1,8,99,6,54,78));

        int min = Collections.min(numList);
        System.out.println(min);



    }
}
