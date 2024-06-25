package day_27_wrapper_class_arraylist_intro;

import java.util.ArrayList;

public class ArrayListPractice1 {

    public static void main(String[] args) {


        // How to declare/create ArrayList

        ArrayList<Byte> byteList = new ArrayList<>();

        ArrayList<Short> shortList = new ArrayList<>();

        ArrayList<Integer> integerList = new ArrayList<>();

        ArrayList<Float> floatList = new ArrayList<>();

        ArrayList<Long> longList = new ArrayList<>();

        ArrayList<Double> doubleList = new ArrayList<>();

        ArrayList<Character> charList = new ArrayList<>();

        ArrayList<Boolean> booleanList = new ArrayList<>();

        ArrayList<String> strList = new ArrayList<>();

        System.out.println("=========================================");

        strList.add("java");
        strList.add("selenium");
        strList.add("API");

        System.out.println(strList);

        // set()
        strList.set(2, "TestNG");
        System.out.println(strList);

        System.out.println("=====================================");

        boolean bb = integerList.add(10);
        System.out.println("bb "+bb);
        integerList.add(89);
        integerList.set(1, 20);
        System.out.println(integerList);

        System.out.println("=============================");

        // isEmpty();

        boolean isItEmpty = byteList.isEmpty();
        System.out.println(isItEmpty);
        System.out.println(strList.isEmpty());












    }
}
