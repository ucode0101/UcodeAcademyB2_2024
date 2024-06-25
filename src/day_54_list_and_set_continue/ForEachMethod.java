package day_54_list_and_set_continue;

import java.util.*;

public class ForEachMethod {

    public static void main(String[] args) {

        Set<Character> set = new LinkedHashSet<>(Arrays.asList('a','b','c','d','e'));

        List<Character> list = new LinkedList<>(Arrays.asList('a','b','c','d','e'));

        // using for each method
        set.forEach(x -> System.out.print(x)); // one way

        System.out.println("\n=================================");

        list.forEach(x -> System.out.print(x)); // one way

        System.out.println("\n===================================");

        set.forEach(System.out::print); // second way (preferred)

        System.out.println("\n============================");

        list.forEach(System.out::print); // second way (preferred)

    }
}
