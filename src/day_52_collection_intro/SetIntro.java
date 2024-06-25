package day_52_collection_intro;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetIntro {
    public static void main(String[] args) {


        // Regular way
        HashSet<Integer> nums = new HashSet<>();

        nums.add(444);
        System.out.println(nums);

        // Reference type
        Set<Integer> set = new HashSet<>();

        set.add(8585);

        // set does not allow duplicates
        set.addAll(Arrays.asList(5, 5, 5, 7, 6, 6, 6, 1, 1, 12));

        System.out.println(set);

        System.out.println("=======================================");

        boolean isThere = set.add(5); // expecting false because it already exists in set
        System.out.println(isThere);

        boolean isThere2 = set.add(4); // expecting true because it doesn't exist in set
        System.out.println(isThere2);


        System.out.println("===================================================");

        String str = "collection";

     // write a program to find first repeated character in a string

        char[] ch = str.toCharArray();

        for (char c : ch){

            if (str.indexOf(c) != str.lastIndexOf(c)){
                System.out.println(c);
                break;
            }
        }


    }


}

