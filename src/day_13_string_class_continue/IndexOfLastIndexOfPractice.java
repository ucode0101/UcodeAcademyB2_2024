package day_13_string_class_continue;

public class IndexOfLastIndexOfPractice {

    public static void main(String[] args) {
        String str = "selenium java";
        String temp = " ";
        System.out.println(temp.length());

        // take part of the string starting from the first space

        int spaceIndex = str.indexOf(" ");
        System.out.println(spaceIndex);

        // find the first char right after the space
        char ch = str.charAt(str.indexOf(" ")+1);

        System.out.println(ch);
        System.out.println("=======================");
        // take the first half until the white space from str
        String firstHalf = str.substring(0, str.indexOf(" ")); // selenium

        System.out.println(firstHalf);

        // take the second half from str starting from white space

        String secondHalf = str.substring(str.indexOf(" ")+1); // java
        System.out.println(secondHalf);


        String whiteSpaces = "   java  selenium   ";
        whiteSpaces = whiteSpaces.trim();
        System.out.println(whiteSpaces);


    }
}
