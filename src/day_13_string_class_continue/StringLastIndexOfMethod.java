package day_13_string_class_continue;

public class StringLastIndexOfMethod {

    public static void main(String[] args) {

        String str = "selenium and java";
        // find the index of first 'e'
        int firstE = str.indexOf('e');
        System.out.println("Index of first 'e': "+ firstE);

        // find the index of last 'e'
        int lastE = str.lastIndexOf('e');
        System.out.println("Index of last 'e': "+ lastE);

        // find the index of unique characters
        int anyCharIndex = str.indexOf('n');
        int anyCharIndex2 = str.lastIndexOf('n');
        System.out.println(anyCharIndex);
        System.out.println(anyCharIndex2);

        System.out.println("======================================");

        int eFirst = str.indexOf('e');
        int eLast = str.lastIndexOf("me");

        System.out.println(eFirst);
        System.out.println(eLast);






    }
}
