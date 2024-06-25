package day_28_arraylist_continue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods3 {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("java");
        list1.add("selenium");
        list1.add("sql");

        boolean b = list1.contains("sql");
        System.out.println(b);
        System.out.println("=========================================");

        //isEmpty()
        boolean b2 = list1.isEmpty();
        System.out.println(b2);
        //list1.clear();

        System.out.println(list1.isEmpty());

        System.out.println("===========================");

        // contains(item/objects)
        boolean b4 = list1.contains("java");
        System.out.println(b4);

        System.out.println("========================================");

        boolean b5 = list1.containsAll(Arrays.asList("sql","selenium","java"));

        System.out.println(b5);



    }
}
