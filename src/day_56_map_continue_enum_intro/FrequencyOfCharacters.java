package day_56_map_continue_enum_intro;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        // Task 2
        // write a program to find frequency of character from String
        // e.g. String str="java"; -> {j=1,a=2,v=1}

        String str = "java";

        // One way we have done it in the past without map
        // we will not get the expected result
        String result ="";

        for (int i=0; i< str.length(); i++){
            int temp =0;

            for (int j=0; j< str.length(); j++){

                if (str.charAt(i) == str.charAt(j)){
                    temp++;
                }
            }
            if (!result.contains(""+str.charAt(i))){
                result += ""+str.charAt(i)+temp;
            }

        }

        System.out.println(result);

        System.out.println("=====================================");

        // another way with map to get exact expected result
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i=0; i < str.length(); i++){

            Character key = str.charAt(i);

            if (!map.containsKey(key)){
                map.put(key, 1);
            }
            else {
                map.put(key, map.get(key)+1);
            }
        }

        System.out.println(map);

        System.out.println("========================================");

        // another way with map

        Map<Character, Integer> map2 = new LinkedHashMap<>();

        for (int i=0; i< str.length(); i++){
            Character key = str.charAt(i);

            map2.put(key, map2.getOrDefault(key, 0)+1);


        }

        System.out.println(map2);


    }



}
