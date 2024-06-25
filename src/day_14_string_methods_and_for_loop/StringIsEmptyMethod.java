package day_14_string_methods_and_for_loop;

public class StringIsEmptyMethod {
    public static void main(String[] args) {
        String str ="java";


        // isEmpty() method is used to check if a string is empty or not
        // and it returns boolean true/false.

       if (!str.isEmpty()){ // if str is not empty
           System.out.println(str.charAt(1));
       }

       // check if the string is empty, if it is, add some string to it and print first char
        // if it is not empty print the last char

        if (str.isEmpty()){
            str += "testing";
            System.out.println(str.charAt(0));
        } else {
            System.out.println(str.charAt(str.length()-1));
        }


        boolean b1 = !true;
        System.out.println(b1);

        System.out.println("===========================");

        String str2 = "java";
        String str3 = "java";

        System.out.println(str2.equals(str3));





    }
}
