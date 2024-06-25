package day_56_map_continue_enum_intro;

import java.util.*;

public class FindSumOfKeysFromMap {

    public static void main(String[] args) {

        // Task 1:
        // write a program to find sum of all keys from Map

        Map<Integer, String> map = new HashMap<>();

        map.put(44, "test");
        map.put(12, "java");
        map.put(19, "selenium");
        map.put(76, "api");
        map.put(38, "sql");

        // one way is to use keySet() to get all keys from the map and store in Set
       //Set<Integer> set = new HashSet<>(map.keySet());
      // Set<Integer> set = map.keySet();

        // another way we can directly loop through

        int sumOfKeys = 0;

        for (Integer each : map.keySet()){

            sumOfKeys += each;
        }
        System.out.println("sum of keys: "+ sumOfKeys);

        // another way to store keys to List<Integer>

        List<Integer> list = new ArrayList<>(map.keySet());
        int sum =0;
        // we can loop through the list and get sum
        for (int i : list){
            sum +=i;
        }
        System.out.println(sum);



    }
}
