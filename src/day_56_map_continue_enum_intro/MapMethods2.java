package day_56_map_continue_enum_intro;

import java.util.HashMap;
import java.util.Map;

public class MapMethods2 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "java");
        map.put(2,"sql");
        map.put(3,"testng");
        map.put(null, "abc");
        map.put(5, null);


        if (!map.containsKey(1)){
            map.put(1, "junit");
        }

        System.out.println(map);

        System.out.println("====================================");

        map.putIfAbsent(2, "api"); // will not add/override existing one
        System.out.println(map);

        map.putIfAbsent(5, "aaa"); // will override/replace null with "aaa"

        System.out.println(map);

        map.putIfAbsent(null, "zzz");

        System.out.println(map);





    }
}
