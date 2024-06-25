package day_54_list_and_set_continue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetAndListPractice2 {
    public static void main(String[] args) {

        // Task 1:
        // remove all odd number from set
        Set<Integer> set = new HashSet<>(Arrays.asList(3,4,6,88,71,23,45,66,21,84));

        // This doesn't work with Set
//        for (Integer i : set){
//            if(i % 2 !=0){
//                set.remove(i);
//            }
//        }
//        System.out.println(set);

        // We need to use Iterator or removeIf() with predicate/lambda

        set.removeIf(x -> x % 2 !=0);

        System.out.println(set);

        System.out.println("============================================");


        // Task 2:
        // Sort String in ascending order
        String str = "begcda";

        // one way with Array
        char [] arr = str.toCharArray();
        Arrays.sort(arr);
        str = new String(arr);
        System.out.println(str);


        System.out.println("=======================================");

        // another way with Set
        String str2 = "begcda";

        Set<String> set2 = new TreeSet<>(Arrays.asList(str2.split("")));

        String result ="";
        for (String each : set2){
            result += each;
        }

        System.out.println(result);


    }
}
