package day_14_string_methods_and_for_loop;

public class StringContainsMethod {
    public static void main(String[] args) {

        String str = "selenium";

        // check if str contain "e" anywhere in it

        boolean b2 =str.contains("e");
        System.out.println(b2);

        // check if str contains "en" and print yes, else print no
        if (!str.contains("en")){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }
}
