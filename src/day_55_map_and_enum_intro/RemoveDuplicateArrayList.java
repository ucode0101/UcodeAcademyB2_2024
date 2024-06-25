package day_55_map_and_enum_intro;

import java.util.*;

public class RemoveDuplicateArrayList {

    public static void main(String[] args) {

        // Task 1:
        // write a program to remove duplicate from ArrayList

        List<String> list = new ArrayList<>(Arrays.asList("test","test","java","java","api","api"));
        List<String> result = new ArrayList<>();

        for (String each : list){

            if (!result.contains(each)){
                result.add(each);
            }

        }

        System.out.println(result);

        System.out.println("===============================================");

        Set<String> unique = new LinkedHashSet<>(list);

        list = new ArrayList<>(unique);

        System.out.println(list);

        System.out.println("========================================");

        // Task 2:
        // Write a program to remove duplicates from String Array

        String [] arr = {"test","test","java","java","api","api"};

        Set<String> set = new LinkedHashSet<>(Arrays.asList(arr));

        arr = new String[set.size()];

        int index =0;
        for (String each : set){
            arr[index] = each;
            index ++;

        }

        System.out.println(Arrays.toString(arr));

        System.out.println("==================================");


        String [] arr2 = {"test","test","java","java","api","api"};


        arr2 = removeDuplicate(arr2);

        System.out.println(Arrays.toString(arr2));


    }

    // another way with Stream api
    public static String [] removeDuplicate(String [] arr){

        String [] res = Arrays.stream(arr).distinct().toArray(String [] :: new);

        return res;

    }
}
