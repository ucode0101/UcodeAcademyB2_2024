package day_11_scanner_continue_string_class_intro;

public class StringClass {
    public static void main(String[] args) {
        // By string literal
        String str = "java";  //    in the string pool there is only 1 "java" object
        String str2 = "java"; // str and str2 pointing to the same object in the pool
        str += " and API";

        // By new keyword
        String str3 = new String("java");
        String str4 = new String("java");
    }
}
