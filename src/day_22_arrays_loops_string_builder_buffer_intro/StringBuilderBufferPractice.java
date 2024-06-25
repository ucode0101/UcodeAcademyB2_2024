package day_22_arrays_loops_string_builder_buffer_intro;

public class StringBuilderBufferPractice {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("selenium");

        // String s1 = str; // does not compile/doesn't work

        // by new keyword and
        String s2 = new String(str); // it works
        System.out.println(s2);

        // toString() method to convert StringBuilder/Buffer to String
        String s3 = str.toString();
        System.out.println(s3);

        System.out.println("==========================================");

        // revers a string
        String word = "java";
        String reverse = "";
        // with loop
        for (int i=word.length()-1; i>=0; i--){

            reverse += word.charAt(i);
        }
        System.out.println(reverse);

        System.out.println("=======================================");

        // reverse(); -> this method is used to reverse StringBuilder/Buffer

        str.reverse();
        System.out.println(str);

        System.out.println("===========================================");

        // reverse a String using StringBuilder/Buffer reverse() method

        String s = "Tajikistan";
        StringBuilder temp = new StringBuilder(s);

        s = temp.reverse().toString();

        // if you want to reverse it without creating an object/variable
       // s = new StringBuilder(s).reverse().toString();
        System.out.println(s);


    }
}
