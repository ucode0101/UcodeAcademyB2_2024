package day_12_string_class_continue;

import java.util.Scanner;

public class StringTrimMethod {
    public static void main(String[] args) {
        String str = "     java and selenium  ";

        str = str.trim();
        System.out.println(str);

        System.out.println("=======================");

        String str2 = "    Testing trim method    ";

        String str3 = "Java " + str2.trim();
        System.out.println(str3);
        

    }
}
