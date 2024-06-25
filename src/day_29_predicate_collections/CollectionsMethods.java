package day_29_predicate_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethods {

    public static void main(String[] args) {

        int [] nums = {5,3,1,7,9,2,4,6};
        Arrays.sort(nums);





        System.out.println(Arrays.toString(nums));

        System.out.println("============================");



        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,3,1,7,9,2,4,6)); // we can do it this way
        //list.addAll(Arrays.asList(5,3,1,7,9,2,4,6)); // or we can do it this way

        // sort()
        Collections.sort(list);
        System.out.println(list);

        System.out.println("=======================================");

        // swap()
      // Collections.swap(list, 0,7);
        System.out.println(list);
        // [1, 2, 3, 4, 5, 6, 7, 9] -> [2,1,4,3,6,5,9,7)
        // 2,1,

        // This one we'll do later

        for (int i=0; i<list.size()-1; i+=2){
            Collections.swap(list, i, i+1);

        }
        System.out.println(list);







    }
}
