package day_11_scanner_continue_string_class_intro;

public class StringCharAtMethod {
    public static void main(String[] args) {

        // index starts from 0 in Java
        //                        0123
        String str = "java";

        char firstChar = str.charAt(0); // it will return the first char from str
        System.out.println(firstChar);

        char secondChar = str.charAt(1); // it will return the second char from str
        System.out.println(secondChar);

        char thirdChar = str.charAt(2);
        System.out.println(thirdChar);

        char fourthChar = str.charAt(3);
        System.out.println(fourthChar);

        System.out.println("===============================");

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));

        System.out.println("========================");
        System.out.println(str.charAt(2));

        System.out.println("=====================");

        // reverse a string using charAt() method

        String revers = "" + str.charAt(3) + str.charAt(2)+ str.charAt(1)+ str.charAt(0);
                  // java          //  a           v             a               j

        System.out.println(revers);

        String word = "java 12 and selenium &(&&^*";





    }
}
