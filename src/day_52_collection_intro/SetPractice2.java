package day_52_collection_intro;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetPractice2 {

    public static void main(String[] args) {


        // write a program to remove all duplicate from String
        String str = "collection";

        Set<Character>   set = new HashSet<>();
        for (char ch : str.toCharArray()){
            set.add(ch);
        }

        System.out.println(set);

        String result = "";

        for (char c : set){
            result += c;
        }
        System.out.println(result);

        System.out.println("==========================");

        // shorter way with set
        String rs = String.valueOf(set).replaceAll("[\\[\\] , ]", "");
        System.out.println(rs);


        System.out.println("======================================");
        // write a program to remove all duplicate from String
        // do it without creating any additional String

        str = String.valueOf(set).replaceAll("[\\[\\] , ]","");
        System.out.println(str);





    }
}
