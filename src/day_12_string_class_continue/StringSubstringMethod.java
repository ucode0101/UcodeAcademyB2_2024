package day_12_string_class_continue;

public class StringSubstringMethod {

    public static void main(String[] args) {

        String word = "selenium";

        // substring word starting from index 3 to the end
        // take part of the word starting from index 3 to the end

        String half = word.substring(3);
        System.out.println(half);
        System.out.println(word.substring(2));
        System.out.println(word.substring(word.length()-1));




    }

}
