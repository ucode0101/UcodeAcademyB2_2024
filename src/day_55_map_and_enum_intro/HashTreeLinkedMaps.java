package day_55_map_and_enum_intro;

import java.util.*;

public class HashTreeLinkedMaps {

    public static void main(String[] args) {

        Map<Integer, Integer>  hashMap = new HashMap<>();

        hashMap.put(1, 10);
        hashMap.put(null, 5);
        hashMap.put(3, null);
        hashMap.put(5, null);
        hashMap.put(null, 100); // this will override/replace that existing one

        System.out.println(hashMap);

        System.out.println("============================================");

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(2, "test");
        treeMap.put(9, "java");
        //treeMap.put(null, "api"); does not accept null key
        treeMap.put(3, null);
        treeMap.put(1, null);
        treeMap.put(6, null);

        System.out.println(treeMap);

        System.out.println("============================================");

        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1,10  );
        linkedHashMap.put(2,null);
        linkedHashMap.put(null, 90);
        linkedHashMap.put(6, 60);
        linkedHashMap.put(null, 100); // replaces/overrides  -> null, 90
        linkedHashMap.put(null, null); // replaces/overrides  -> null, 100

        System.out.println(linkedHashMap);

        System.out.println("=======================================");

        Map<Integer, Integer> hashTable = new Hashtable<>();
        hashTable.put(1,10);
        //hashTable.put(null, 19); // does not allow null key, throws NullPointerException
        //hashTable.put(5, null); // does not allow null value, throws NullPointerException
        hashTable.put(5,60);
        hashTable.put(23, 55);
        System.out.println(hashTable);

        System.out.println("==============================================");

        Map<Integer,Integer> map = new HashMap<>();
        map.putAll(hashMap);



        System.out.println(map);

        Map<Integer,Integer> map2 = map;
        System.out.println(map2);

    }
}
