package day_33_methods_method_overloading_recap;

public class ReturnMethodPractice2 {

    // Create a method that takes 2 String as arguments and returns first or last
    // character from the string. If user gives first, it returns fist char if else last char

    public static char getFirstOrLastChar(String str, String firstOrLast){

        if (firstOrLast.equalsIgnoreCase("first")){
            return str.charAt(0);
        }
        return  str.charAt(str.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(getFirstOrLastChar("java", "test"));
    }



}
