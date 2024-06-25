package day_55_map_and_enum_intro;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {

    public static void main(String[] args) {

        // Create an object from HashMap
        Map<String, Integer> map = new HashMap<>();

        // add pair to map
        map.put("a",100);
        map.put("b",200);

        // get value from the map
        System.out.println(map.get("a"));
        System.out.println(map.get("b"));

        // if the key does not exist, we'll get null
        System.out.println(map.get("x"));

        // print map directly
        System.out.println(map);

        System.out.println("==================================================");

        Map<Integer, Integer> map2 = new HashMap<>();

        map2.put(1, 55);
        map2.put(99, 87878);

        System.out.println(map2.get(1));
        System.out.println(map2.get(99));
        System.out.println(map2);

        System.out.println("=========================================");

        Map<Character, Boolean> map3 = new HashMap<>();
        map3.put('a',true);
        map3.put('b',false);
        map3.put('c',true);

        System.out.println(map3.get('c'));
        System.out.println(map3);


        System.out.println(map3.get('y'));
        System.out.println(map2.get(9));

    }
}
