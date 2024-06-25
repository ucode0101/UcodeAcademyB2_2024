package day_12_string_class_continue;

public class StringLengthMethod {
    public static void main(String[] args) {

        // length()
        String str = "selenium";
        //            01234567
        // store the length of the string in int variable
        int len = str.length();

        // charAt(); takes index/number and return character at the given index from string

        // find last char from str
        char lastCharacter= str.charAt(str.length()-1);
        System.out.println(lastCharacter);

        System.out.println(len);
        // print the length of str directly
        System.out.println(str.length());

        System.out.println("============================");

        // write a program to find if the length of the string is even or odd
        String str2 = "testingJava";

        int n = str2.length();

        if (n %  2 ==0){ // or this way -> str2.length() % 2 ==0
            System.out.println("The length is even for "+str2);
            System.out.println(n);
        }
        else {
            System.out.println("The length is odd for "+str2);
            System.out.println(n);
        }



    }
}
