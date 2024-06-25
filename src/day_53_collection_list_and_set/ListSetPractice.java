package day_53_collection_list_and_set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ListSetPractice {
    public static void main(String[] args) {

        Set<Character> set = new HashSet<>();
        set.addAll(Arrays.asList('a','b','c','d'));

        Set<Character> set2 = new HashSet<>(Arrays.asList('b','a','e'));

        boolean b = set.contains('c');
        System.out.println(b);

        boolean b2 = set.containsAll(Arrays.asList('a','b','d'));
        System.out.println(b2);

        set.remove('c');
        System.out.println(set);

        System.out.println(set.equals(set2));

        Object [] a = set.toArray();
        System.out.println(Arrays.toString(a));
    }
}
