package day_55_map_and_enum_intro;

import java.util.HashMap;
import java.util.Map;

public class MapMethods1 {
    public static void main(String[] args) {

        Map<Integer, Character> map = new HashMap<>();

        map.put(1,'A');
        map.put(2,'B');
        map.put(2,'C'); // will replace 'B'
        map.put(2, 'X'); // will replace 'C'

        System.out.println(map);

        System.out.println(map.get(6));


        char ch = map.remove(2);
        System.out.println(map);

        System.out.println(ch);

        System.out.println(map.remove(99));

        map.put(5, 'D');

       int c = map.size();

        System.out.println(c);
        System.out.println(map.size());

        System.out.println("==============================================");

        Map<Character, String> map2 = new HashMap<>();

        map2.put('a', "java");
        map2.put('b',"selenium");
        map2.put('c',"api");

        boolean b1 = map2.containsKey('a');
        System.out.println(b1);

        System.out.println(map2.containsKey('k'));

        boolean b2 = map2.containsValue("java");
        System.out.println(b2);

        System.out.println(map2.containsValue("test"));

    }
}
