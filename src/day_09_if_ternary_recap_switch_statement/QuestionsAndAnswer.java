package day_09_if_ternary_recap_switch_statement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class QuestionsAndAnswer {

    public static void main(String[] args) {
        // option 1 -> I'll ask question, you answer
        // option 2 -> I'll pick random person to answer the question

        // 1. what is Java, and what is JDK?
        // 2. what is variable in Java?
        // 3. How many non-primitive data types are there in Java, and name at least 5
        // what is comparison operators in Java ?
        // what is JRE/what does it stand for in Java?
        // What is ternary Operator?





        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Dilafruz","Gulshan","Khurshed", "Nilu","Shoina","Timur"));


        int randomName = new Random( ).nextInt(names.size() );

        System.out.println(names.get(randomName));



    }
}
