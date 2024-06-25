package day_13_string_class_continue;

public class CharAtVsIndexOf {

    public static void main(String[] args) {
        // charAt() method takes index and returns character at specified index from string as char
        // If the index is lower than 0 or higher than string length, it throws an error/exception
        // indexOf() method takes char and returns index of specified character from string as int
        // if character doesn't exist, it returns -1

        String str = "java";

        char charAtIndex2 = str.charAt(2);
        System.out.println(charAtIndex2);

        int indexOfV = str.indexOf('w');
        System.out.println(indexOfV);

    }
}
