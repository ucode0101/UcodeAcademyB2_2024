package day_24_custom_methods;

public class CustomMethodPractice3 {
    public static void main(String[] args) {

        String str1 = "java";
        String str2 = "api";


        checkEquality(str1, str2);

        checkEquality("java","java");


    }

    // create a custom method to check if two strings are equal or not
    public static void checkEquality(String str1, String str2){

        boolean isEqual = str1.equals(str2);
        System.out.println(isEqual);

    }

}
