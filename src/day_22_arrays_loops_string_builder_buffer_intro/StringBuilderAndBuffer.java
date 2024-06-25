package day_22_arrays_loops_string_builder_buffer_intro;

public class StringBuilderAndBuffer {

    public static void main(String[] args) {

        StringBuilder str1 = new StringBuilder("java");

        StringBuffer str2 = new StringBuffer("java");


        str1.append("and");// adding/appending "and" at the end of "java"

        str2.append("2");// adding/appending "2" at the end of "java"

        System.out.println(str1);
        System.out.println(str2);

        System.out.println("============================================");

        // you can append number
        str1.append(9);

        // you can append character
        str1.append('t');
        System.out.println(str1);

        // you can append as much as you want
        str1.append(" I like java and the");
        System.out.println(str1);


        System.out.println("=============================");
        System.out.println(str2);
        // insert value/str/object at specific index

       str2.insert(0,"java 1 "); // java 1 will be inserted at the beginning
        System.out.println(str2);

        str2.insert(1, "p");
        System.out.println(str2);

        System.out.println("==================================");

        // replace from index 0, until but not including index 3 with new value
        str2.replace(0, 3, "BBB");
        System.out.println(str2);

        // delete from index 0 until but not including index 3
        str2.delete(0,3);
        System.out.println(str2);

        System.out.println("=======================");

        // delete last two characters from str2
        str2.delete(str2.length()-2, str2.length());

        System.out.println(str2);

        System.out.println("=================");

        str2.deleteCharAt(1);
        System.out.println(str2);









    }
}
