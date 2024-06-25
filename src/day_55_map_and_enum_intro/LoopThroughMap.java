package day_55_map_and_enum_intro;

import java.util.*;

public class LoopThroughMap {
    public static void main(String[] args) {

        Map<Integer, Character> map = new HashMap<>();

        map.put(3,'c');
        map.put(4,'d');
        map.put(1,'a');
        map.put(2,'b');

        System.out.println(map);

        System.out.println("=================================");
        // for each method
        map.forEach( (key, value )-> System.out.println(key+" "+value));

        System.out.println("====================================");

        // keySet() -> returns all keys as Set
       // Set<Integer> set = map.keySet();

        // loop over the keys only
        for (Integer each : map.keySet()){
            System.out.println(each);
        }

        System.out.println("==================================");

        // values(); -> returns all values as Collection (as List)

       // List<Character> list = new ArrayList<>(map.values());

        for (Character each : map.values()){
            System.out.println(each);
        }

    }
}
