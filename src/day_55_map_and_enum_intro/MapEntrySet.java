package day_55_map_and_enum_intro;

import java.util.HashMap;
import java.util.Map;

public class MapEntrySet {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("aa",1);
        map.put("bb",2);
        map.put("cc",3);
        map.put("dd",4);

        // loop/iterate over map

        for (Map.Entry<String, Integer> entry : map.entrySet()){

            System.out.println("Key: "+ entry.getKey());
            System.out.println("Value: "+entry.getValue());
        }

        System.out.println("==================================");

        System.out.println(map);

        System.out.println("Is map empty? "+ map.isEmpty());

        map.clear(); // removing all keys & values from the map

        System.out.println("is map empty? "+ map.isEmpty());
    }
}
