package day_25_methods_loops_strings_arrays_recap;

import java.util.Arrays;

public class StringVsStringBuilderAndBuffer {

    public static void main(String[] args) {
        // String literal
        String str1 = "Java"; // string is a sequence of character

        // by/using  new keyword
        String str2 = new String("API");

        StringBuilder str3 = new StringBuilder(str1);

        String str4 = str3.toString(); // if you don't want to use -> new String(str3);

        int i = 1234;

        String str5 = String.valueOf(1234);
        System.out.println(str5);

        char gender = 'M';
        int [] abc = {1,2,3,4,5};





        String person = String.format("Name: Mike, Gender: %s",gender);
        String personInfo ="Name: Mike, age: 26, gender: %s email: test@test.com";

        System.out.println("================================================");

        personInfo = String.format(personInfo, Arrays.toString(abc));
        System.out.println("Person info: "+personInfo);


        System.out.println(person);

        System.out.println("=========================");

        String name = "James", phone ="+123456789", email ="test@test.com";

        String info ="Name: %s, Phone: %s, Email: %s";

        info = String.format(info, name, phone, email);

        System.out.println(info);











    }
}
