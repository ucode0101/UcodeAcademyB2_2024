package day_54_list_and_set_continue;

import java.util.*;

public class CollectionVsCollections {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(5,2,3,6,1,4));



        Collections.sort(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        Set<Integer> set = new HashSet<>(Arrays.asList(5,2,3,6,1,4));

       // Collections.sort(set); it doesn't work on Set
        System.out.println(Collections.max(set));
        System.out.println(Collections.min(set));

        Collections.reverse(list);


//        Collection<Integer> li = new ArrayList<>(Arrays.asList(1,2,3,4));
//
//        Iterable<Integer> li2 = new ArrayList<>(Arrays.asList(1,2,3,4));







    }
}
