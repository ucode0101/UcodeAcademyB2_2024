package day_52_collection_intro;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {

        Set<Character> characterSet = new HashSet<>();

        // add multiple elements/items at once
        characterSet.addAll(Arrays.asList('a','b','c','d','e'));

        boolean b1 = characterSet.containsAll(Arrays.asList('a','b','c','i'));
        System.out.println(b1);

        System.out.println(characterSet);

        System.out.println(characterSet.size());

        characterSet.clear();

        System.out.println(characterSet);
        System.out.println(characterSet.size());




    }
}
