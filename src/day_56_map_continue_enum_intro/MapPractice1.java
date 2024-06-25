package day_56_map_continue_enum_intro;

import java.util.*;

public class MapPractice1 {
    public static void main(String[] args) {
        // Write to remove key and its value from the map
        // if the key length is more than 7

        Map<String, Integer> map = new HashMap<>();

        map.put("automation",1);
        map.put("java",2);
        map.put("selenium", 3);
        map.put("api", 4);

        System.out.println(map);

        System.out.println("================================");

        // store all keys in Set<String>
        Set<String> set = new HashSet<>(map.keySet());

//        for (String key : set){
//            if (key.length() >7){
//                map.remove(key);
//            }
//        }

        // throws exception, because we are using getSet() method in the loop
//        for (String key : map.keySet()){
//
//            if (key.length() > 7){
//                map.remove(key);
//            }
//        }

        // using Iterator
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            if (key.length() > 7){
                iterator.remove();
            }
        }



        System.out.println(map);

    }
}
