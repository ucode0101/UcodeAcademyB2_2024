package day_27_wrapper_class_arraylist_intro;

import java.util.ArrayList;

public class ArrayListClassIntro {

    public static void main(String[] args) {

        int [] arr = new int[10]; // Primitive
        Integer [] arr2 = new Integer[18]; // non-primitive/object

        arr[0]=10;

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(14);
        list.add(90);
        list.add(55);
        //System.out.println(Arrays.toString(arr2));
        System.out.println(list);

        list.add(1,99);
        System.out.println(list);

        System.out.println("====================================");

        // get()
        int num = list.get(1);
        System.out.println(num);

        System.out.println("========================");


        // size();
        Integer n = list.size();
        int n2 = list.size();
        System.out.println(n);




    }
}
