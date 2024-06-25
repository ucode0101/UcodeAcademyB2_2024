package day_12_string_class_continue;

public class StringLowerUpperConcat {

    public static void main(String[] args) {
        String str1 = "java";
       // str1 += "Selenium";
        String str2 = "API" + str1;

        str2 = str2.concat(str1);
        System.out.println(str2);

        System.out.println("========================");

        String str3 = "testing";
        str3 += "Java"; // means -> str3 = str3 + "Java";


        String str4 = "testing";

        str4 = str4.concat("Java");

        // using concat method more than once
        String str5 = str3.concat(str4+" ").concat(str1).concat("Fun");

        System.out.println(str4);
        System.out.println(str5);

        String str6 = "java";
        str6 = str6.concat(" and Java");

        System.out.println("=========================================");

        // toLowerCase(); is used to convert string to lower case
        String word = "JAVA";

        // convert word to lower case
        word = word.toLowerCase();
        System.out.println(word);

        String word2 = "selenium";
        // convert word2 to upper case
        word2 = word2.toUpperCase();
        System.out.println(word2);

        System.out.println("========================================");

        // don't get too confused on this for now, we'll do more practice on chaining methods
        String result = word.toUpperCase().concat(word2.toLowerCase());
        System.out.println(result);
        System.out.println("=======================");
        System.out.println(word);
        System.out.println(word2);

        System.out.println("=======================================");

        String s = "java";

        String firstLastUpper =""+ s.toUpperCase().charAt(0) + s.toUpperCase().charAt(s.length()-1);
        System.out.println(firstLastUpper);

        System.out.println("==================================");
        // if string length is even convert it to upper, else convert it to lower
        String s2 = "TeStIngtEstINg";
        if (s2.length() % 2 ==0){
            s2 = s2.toUpperCase();
        } else {
            s2 = s2.toLowerCase();
        }
        System.out.println(s2);









    }
}
