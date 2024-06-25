package day_56_map_continue_enum_intro;

import java.util.*;

public class FindLongestStringValueFromMap {

    public static void main(String[] args) {
        // Task 3
        // Write a program to find the longest string value from Map

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "java");
        map.put(2, "selenium");
        map.put(3,"automation");
        map.put(4, "testing");

        String longString = "";

        // one way is to store all values in Set<String>
        Set<String> set = new HashSet<>(map.values());

        // another way is to store all values in List<String>

        List<String> list = new ArrayList<>(map.values());

        // another way we can directly call map.values() in the loop

        for (String each : map.values()){

            if (longString.length() < each.length()){
                longString = each;
            }
        }
        System.out.println(longString);

    }
}
