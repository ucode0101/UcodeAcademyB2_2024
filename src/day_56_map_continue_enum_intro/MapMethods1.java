package day_56_map_continue_enum_intro;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods1 {
    public static void main(String[] args) {
        Map<Integer, Integer> map1 = new TreeMap<>();
        map1.put(1,1);
        map1.put(5,5);
        map1.put(10,9);

        Map<Integer, Integer> map2 = new LinkedHashMap<>();

        map2.put(5,5);
        map2.put(10,9);
        map2.put(1,1);


        boolean b1 = map1.equals(map2);
        System.out.println(b1);

        System.out.println(map1);
        System.out.println(map2);

        System.out.println("========================");

        Map<Integer, Character> map3 = new HashMap<>();

        map3.put(1,'a');
        map3.put(2,'b');
        map3.put(3,'c');

        // replace(key, value)

        map3.replace(1, 'x');
        System.out.println(map3);

        map3.replace(10, 't');
        System.out.println(map3);

        System.out.println("============================================");

        // replace(key, oldValue, newValue)
        map3.replace(2,'b','p');
        System.out.println(map3);

        // replace(key, value)
        map3.replace(5,'e');
        System.out.println(map3);

    }
}
