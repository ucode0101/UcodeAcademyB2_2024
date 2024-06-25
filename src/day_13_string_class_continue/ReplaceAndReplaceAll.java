package day_13_string_class_continue;

public class ReplaceAndReplaceAll {
    public static void main(String[] args) {
        String word = "automation is a maybe fun";

        // replace all "a" and "b" with "x"
        String str1 = word.replace("ab", "x");// doesn't work
        System.out.println(str1);

        String str2 = word.replaceAll("[a,b]","c");

        System.out.println(str2);


        System.out.println("===========================================");

        // Remove all number from string using replaceAll()
        String mixString  = "a245a3@bc10jav>?88123sele*nium0916475test";

        String strWithoutNumber = mixString.replaceAll("[0-9,@>?*]","");
        System.out.println(strWithoutNumber);

        System.out.println("=====================================");

        // Remove All upper case letters from string
        String upperAndLower = "AJjdTGGetHOIUERaTYOIEtTOIUETlsjdlsdkjstheeekjdjk";

        String lowerCaseOnly = upperAndLower.replaceAll("[A-Z]","");
        System.out.println(lowerCaseOnly);

        System.out.println("=================================");

        String upperCaseOnly = upperAndLower.replaceAll("[a-z]","");
        System.out.println(upperCaseOnly);


    }
}
