package day_13_string_class_continue;

public class EqualsVsEqualsIgnoreCase {
    public static void main(String[] args) {
        String str = "java";
        String str2 = "JAVA";

        boolean isEqual = str.equals(str2); // false because not ignoring case sensitivity
        System.out.println(isEqual);

        boolean isEqual2 = str.equalsIgnoreCase(str2); // true because ignoring case sensitivity
        System.out.println(isEqual2);

    }
}
