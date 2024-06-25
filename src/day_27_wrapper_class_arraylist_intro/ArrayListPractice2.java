package day_27_wrapper_class_arraylist_intro;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {

       // Integer [] ar = {1,2,3,4,5,6,7};
        ArrayList<Integer> list = new ArrayList<>();

        // addAll()
        list.addAll(Arrays.asList(1,2,33,42,43,4,76,77,90));
        System.out.println(list);

        System.out.println("==============================");

        ArrayList<String> strList = new ArrayList<>();

        strList.addAll(Arrays.asList("java","python","api"));

        // remove(index) removing element/object at the given index
        strList.remove(1);
        System.out.println(strList);

        System.out.println("=============================");

        strList.add("java");

        // remove(object/element) removing first matching object/element
        System.out.println(strList);

        strList.remove("java");
        System.out.println(strList);

        System.out.println("================================");
        System.out.println(list);

        Integer index = 77;
        list.remove(2);
        System.out.println(list);

        list.remove(index);
        System.out.println(list);

        System.out.println("===============================");

        ArrayList<Character> chList = new ArrayList<>();
        chList.addAll(Arrays.asList('a','y','d','k'));

        chList.remove(2);
        System.out.println(chList);

        Character ch = 'k';
        chList.remove(ch);

        System.out.println(chList);


        // clear()
        System.out.println("========================");
        chList.clear();
        System.out.println(chList);



    }
}
