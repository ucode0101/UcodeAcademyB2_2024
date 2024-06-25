package day_53_collection_list_and_set;

import java.util.*;

public class ListAndSet {

    public static void main(String[] args) {

        // regularly how we created in the past (we can still go this way)
        ArrayList<Character> arrayList = new ArrayList<>();

        List<Character> chList = new ArrayList<>();
        chList.addAll(Arrays.asList('c','c','b','a','a','b','b','c','c'));

        System.out.println(chList.get(3));

        System.out.println(chList);

        System.out.println("======================================================");

        // regular way
        //HashSet<Character> hashSet = new HashSet<>();

        Set<Character> setChar = new HashSet<>();
        setChar.addAll(Arrays.asList('c','c','b','a','a','b','b','c','c'));
        System.out.println(setChar);

        System.out.println("========================================");

        Iterator<Character> iterator = setChar.iterator();

        System.out.println(iterator.next());

        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }






    }
}
