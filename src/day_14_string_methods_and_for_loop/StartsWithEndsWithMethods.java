package day_14_string_methods_and_for_loop;

public class StartsWithEndsWithMethods {
    public static void main(String[] args) {
        String str = "Programming";
        // check if str starts with "pr"
        boolean isTrue = str.startsWith("p");

        boolean isTrue2 = str.endsWith("mm");

        System.out.println(isTrue);
        System.out.println(isTrue2);

        // check if str starts with "P" or "p"

        boolean b3 = str.startsWith("p") || str.startsWith("P");
        System.out.println("B3 "+b3);

        System.out.println("===================================");
        // check is str starts with or ends with or contains "r" ignoring case sensitivity

        boolean b4 = str.contains("P");
        boolean b5 = str.startsWith("P");
        System.out.println(b4);
        System.out.println(b5);


    }
}
