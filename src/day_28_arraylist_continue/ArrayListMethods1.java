package day_28_arraylist_continue;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(23);
        list.add(56);
        list.add(90);

        System.out.println(list);

        System.out.println(list.get(1));
        Integer num = list.get(2);

        System.out.println(num);
        list.add(2, 100);

        System.out.println(list);


        list.set(2,101); // Replacing item/objet at index 2 with new item/object
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        Integer item = 56; // We are using Wrapper class, so we can pass 56 as an item/or
                           // if pass 56 directly, it will take as index
        list.remove(item);
        System.out.println(list);


    }
}
