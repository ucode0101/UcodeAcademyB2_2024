package day_53_collection_list_and_set;

import java.sql.Array;
import java.util.*;

public class SetPractice2 {

    public static void main(String[] args) {

        // write a program to remove duplicates and sort elements in ArrayList

        List<Integer> list = new ArrayList<>(Arrays.asList(8,4,1,3,3,6,6,8,9,9,2,1,2,3,4));
        List<Integer> result = new ArrayList<>();

//        Set<Integer> set = new HashSet<>(Arrays.asList(8,4,1,3,3,6,6,8,9,9,2,1,2,3,4));
//        Collections.sort(set); doesn't work with Set

        // first way without Set
        Collections.sort(list);

        for (Integer elm : list){
            if (!result.contains(elm)){
                result.add(elm);
            }
        }
        System.out.println(result);

        System.out.println("====================================");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(8,4,1,3,3,6,6,8,9,9,2,1,2,3,4));
        // second way with set

        Set<Integer> treeSet = new TreeSet<>(list2);

        list2 = new ArrayList<>(treeSet);
        System.out.println(list2);

        System.out.println("======================================");

        // third way
        List<Integer> list3 = new ArrayList<>(Arrays.asList(8,4,1,3,3,6,6,8,9,9,2,1,2,3,4));


        list3 = new ArrayList<>(new TreeSet<>(list3));
        System.out.println(list3);


    }
}
