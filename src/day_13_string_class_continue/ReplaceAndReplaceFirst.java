package day_13_string_class_continue;

public class ReplaceAndReplaceFirst {

    public static void main(String[] args) {

        String word = "is automation is a fun";

        // replace all "a" with "b"

        String aToB = word.replace("a","b");
        System.out.println(aToB);

        // replace first "a" with "b"
        String firstAToB = word.replaceFirst("a","b");
        System.out.println(firstAToB);

        // replace all "is" with "was"
        String isWas = word.replace("is","was");
        System.out.println(isWas);

        // replace first "is" with "was"

        String firstIsWas = word.replaceFirst("is","was");
        System.out.println(firstIsWas);

        System.out.println("==============================================");

        // replace all "a" & "o" with "x"
        String replaceAoToX = word.replace("ao", "x"); // it doesn't work
        System.out.println(replaceAoToX);



    }
}
