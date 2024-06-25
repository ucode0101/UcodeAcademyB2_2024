package day_23_decimal_format_arrays_loops_review;

public class StringBuilderBufferReplaceMethod {
    public static void main(String[] args) {

        // Task 2:
        //Write a program to replace all 'a' with 'b' using StringBuilder or StringBuffer.

        // if we it with String and replace() method
        // it is easy
        String str = "java";

        // with String and replace() method
        str = str.replace("a","b");

        System.out.println(str);

        System.out.println("=============================================");

        StringBuilder str2 = new StringBuilder("jvaa");

        //str2.replace("a","b");  It doesn't work with StringBuilder/Buffer

        for (int i=0; i< str2.length(); i++){

            if (str2.charAt(i) == 'a'){
                str2.replace(i, i+1,"b");
            }
        }
        System.out.println(str2);



    }
}
