package day_13_string_class_continue;

public class StringIndexOf {

    public static void main(String[] args) {
        String str = "selenium";

        // find the index of first e in str
        int e = str.indexOf('e');
        System.out.println(e);

        // find the index of i in str
        int i = str.indexOf('i');
        System.out.println(i);

        // find the index of y from str
        int y = str.indexOf('y');
        System.out.println(y);

        System.out.println("===============================================");

        // find the index of s
        int e1 = str.indexOf("e");
        System.out.println(e1);

        int i1 = str.indexOf("i");
        System.out.println(i1);

        int y1 = str.indexOf("y");
        System.out.println(y1);

    }
}
