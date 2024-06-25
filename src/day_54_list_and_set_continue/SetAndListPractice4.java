package day_54_list_and_set_continue;

import java.util.*;

public class SetAndListPractice4 {
    public static void main(String[] args) {

        // Write a program to convert List/Set to String Array

        Set<String> set = new HashSet<>(Arrays.asList("java","api","selenium","sql"));

        List<String> list = new ArrayList<>(Arrays.asList("java","api","selenium","sql"));

        //String [] setArray = (String[]) set.toArray(); doesn't work

        //String [] listArray = (String[]) list.toArray(); doesn't work

        String [] setArray = set.toString().replaceAll("[\\[\\],]","").split(" ");
        System.out.println(Arrays.toString(setArray));


        String [] listArray = list.toString().replaceAll("[\\[\\],]","").split(" ");

        System.out.println(Arrays.toString(listArray));




    }
}
