package day_13_string_class_continue;

public class StringSubstringMethod {
    public static void main(String[] args) {

        String str = "selenium";

        // to take/substring from index 2 to the end
        String str2 = str.substring(2);

        System.out.println(str2);

        String str3 = str.substring(0,8);
        System.out.println(str3);


        // take first 4 characters as string from str using substring()

        String fourChars = str.substring(0,4);
        System.out.println(fourChars);

        // take first 2 chars, last 2 chars and middle 2 chars from str as string

        String str4 = str.substring(0,2); // se
        str4 += str.substring(3,5); // en

        str4 += str.substring(6); //um

        // seenum
        System.out.println(str4);

        System.out.println("=============================================");
        // take first 2 chars, last 2 chars and middle 2 chars from str as string
        // use method chaining

        String str5 = str.substring(0,2).concat(str.substring(3,5)).concat(str.substring(6)).toUpperCase();
        System.out.println(str5);

        // take first 2 chars, last 2 chars and middle 2 chars from str as string
        // use + operators
        String str6 = str.substring(0,2).toUpperCase() + str.substring(3,5).toUpperCase() + str.substring(6).toUpperCase();
        System.out.println(str6);




    }
}
