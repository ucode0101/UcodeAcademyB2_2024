package day_54_list_and_set_continue;

import java.util.*;

public class SetAndListPractice3 {

    public static void main(String[] args) {
        // remove all names from list/set that has length of 5 or more using removeIf()

        Set<String> set = new HashSet<>(Arrays.asList("java","testing","selenium","test","sql"));

        List<String> list = new ArrayList<>(Arrays.asList("java","testing","selenium","test","sql"));

        set.removeIf(x -> x.length() >5);

        list.removeIf(x -> x.length() >5);

        System.out.println(set);
        System.out.println(list);

        System.out.println("==================================");

        list.remove("java");
        set.remove("java");

        System.out.println(set);
        System.out.println(list);

        System.out.println("=============================");

        list.remove(1);
        set.remove(1);

        System.out.println(set);
        System.out.println(list);

        System.out.println("==============================");

        list.add("JUnit");
        set.add("JUnit");

        System.out.println(list);
        System.out.println(set);

        System.out.println("====================================");

        list.add(1, "code");
        System.out.println(list);

//        set.add(0, "code"); does not work in Set

        System.out.println("==========================================");

        String listStr = list.toString().replaceAll("[\\[\\]]","");

        String setStr = set.toString().replaceAll("[\\[\\]]","");

        System.out.println("listStr: "+listStr);
        System.out.println("setStr: "+setStr);


    }
}
