package day_34_wrapper_class_arraylist_recap;

import java.util.ArrayList;

public class ArrayListRecap {
    public static void main(String[] args) {


        ArrayList<String> str = new ArrayList<>();

        str.add("java");
        str.add("selenium");

        System.out.println(str);

        str.remove("java");
        System.out.println(str);

        str.add("api");

        str.remove(0);

        System.out.println(str);

        str.add("testing");

        boolean b = str.remove("sql");
        System.out.println(b);

        boolean b2 = str.remove("testing");

        System.out.println(b2);

        System.out.println(str.isEmpty());

        str.clear();

        System.out.println(str.isEmpty());


        System.out.println("==============================");


        ArrayList<String> str2 = new ArrayList<>();

        str2.add("java");
        str2.add("api");
        str2.add("java");

        str2.remove("java");

        System.out.println(str2);

        int a = str2.indexOf("java");
        System.out.println(a);

        str2.add("sql");
        System.out.println(str2);

        str2.set(1, "test");
        System.out.println(str2);
        str2.set(0, "abc");
        System.out.println(str2);




    }
}
