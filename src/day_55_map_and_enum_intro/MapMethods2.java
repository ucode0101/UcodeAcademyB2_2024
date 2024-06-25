package day_55_map_and_enum_intro;

import java.util.*;

public class MapMethods2 {
    public static void main(String[] args) {

        Map<Double, Integer> map = new HashMap<>();
        map.put(1.0, 10);
        map.put(2.0, 55);
        map.put(3.0, 100);
        map.put(4.0, 55);
        System.out.println(map);

        System.out.println("=============================================================");

        Set<Double> keys = map.keySet();
        System.out.println("Keys: "+keys);

        List<Integer> values = new ArrayList<>(map.values());
        System.out.println("Values: "+values);
    }
}
