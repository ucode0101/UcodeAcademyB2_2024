package day_30_arraylist_predicate_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class ArrayListPractice3 {
    public static void main(String[] args) {

        // Write a program to remove all word that starts with A or ends with a

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple","Grapes","Test","java","API"));

        // Create predicate first with lambda expression
       // Predicate<String> predicate = x -> x.startsWith("A") || x.endsWith("a");

        //list.removeIf(predicate);// pass predicate here

        list.removeIf(s -> s.startsWith("A") || s.endsWith("a"));

        System.out.println(list);

        System.out.println("=========================================");
        // Write a program to remove digits/numbers form ArrayList<Character>

        ArrayList<Character> charList = new ArrayList<>(Arrays.asList('a','1','3','b','c','4','7','9','%','@'));

        Predicate<Character> digits = c -> Character.isDigit(c);

        charList.removeIf(digits);

        System.out.println(charList);

        System.out.println("========================");
        charList.add('5'); // just added one number so we can remove it again

        // write a program to remove all non-alphabets from ArrayList<Character>
        Predicate<Character> nonLetter = x -> !Character.isLetter(x);
        charList.removeIf(nonLetter);
        System.out.println(charList);


    }
}
