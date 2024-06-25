package day_28_arraylist_continue;

import java.util.ArrayList;

public class ArrayListMethods2 {

    public static void main(String[] args) {

        ArrayList<String> strList = new ArrayList<>();

        strList.add("Mike");
        strList.add("James");
        strList.add("Kudrat");
        strList.add("Sara");

        System.out.println(strList);

        strList.remove(2);

        System.out.println(strList);


        strList.remove("Sara");
        System.out.println(strList);

        strList.clear();
        System.out.println(strList);
        System.out.println("===================================");

        ArrayList<Character> chList1 = new ArrayList<>();
        chList1.add('c');
        chList1.add('a');
        chList1.add('b');
        chList1.add('a');

        ArrayList<Character> chList2 = new ArrayList<>();
        chList2.add('a');
        chList2.add('b');
        chList2.add('c');


       boolean b =  chList1.equals(chList2);
        System.out.println(b);
        Character ch0 = 'a';
        System.out.println(chList1.indexOf(ch0));

        System.out.println("=============================");
        int ch3 = chList1.indexOf('a');
        System.out.println(ch3);


        chList1.lastIndexOf('a'); // this method takes an item/object and return the last index of matching one





    }

}
