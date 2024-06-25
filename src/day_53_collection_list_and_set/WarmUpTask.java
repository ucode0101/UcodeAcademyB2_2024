package day_53_collection_list_and_set;

import java.util.HashSet;
import java.util.Set;

public class WarmUpTask {
    public static void main(String[] args) {

        // Write a program to find first repeated character in a String

        String str = "collection";

        // one way without Collection
        for (char ch : str.toCharArray()){

            if (str.indexOf(ch) != str.lastIndexOf(ch)){

                System.out.println(ch);
                break;
            }
        }

        System.out.println("============================================");

        // other way with Set
        // "collection"; not getting what we want
        Set<Character> set = new HashSet<>();
        for (char c : str.toCharArray()){

            if (!set.add(c)){
                System.out.println(c);
                break;
            }
            set.add(c);

        }

        System.out.println("======================================");

        Character result = findRepeated(str);

        if (result != null){

            System.out.println(result);
        } else {
            System.out.println("No repeated character");
        }


    }

    // we will cover with map -> not getting what we want
    public static Character findRepeated(String str){
        Set<Character> seen = new HashSet<>();
        Set<Character> repeat = new HashSet<>();

        for (char c : str.toCharArray()){

            if (seen.contains(c)){

                if (!repeat.contains(c)){
                    repeat.add(c);
                    return c;

                }
            } else {
                seen.add(c);
            }


        }



        return null;

    }
}
