package day_53_collection_list_and_set;

import java.util.*;

public class SetPractice {

    public static void main(String[] args) {

        // TreeSet -> sorts the element in ascending order

        Set<Character> treeSet = new TreeSet<>(Arrays.asList('f','c','d','a','b','e'));
        Set<Integer> treeSet2 = new TreeSet<>(Arrays.asList(5,1,2,3,6,4));

        System.out.println(treeSet);
        System.out.println(treeSet2);

        System.out.println("=======================================================");

        // LinkedHashSet -> maintains the insertion Order
        Set<Character> linkedHashSet = new LinkedHashSet<>(Arrays.asList('f','c','d','a','b','e'));
        Set<Integer> linkedHashSet2 = new LinkedHashSet<>(Arrays.asList(5,1,2,3,6,4));

        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet2);

        System.out.println("==========================================");

        // HashSet -> does not keep insertion order/may or may not maintain the insertion order

        Set<Character> hashSet = new HashSet<>(Arrays.asList('f','c','d','a','b','e'));
        Set<Integer> hashSet2 = new HashSet<>(Arrays.asList(5,1,2,3,6,4));

        Set<String> set = new HashSet<>(Arrays.asList("sql","java","well","api","selenium"));

        System.out.println(hashSet);
        System.out.println(hashSet2);
        System.out.println(set);

    }

}
