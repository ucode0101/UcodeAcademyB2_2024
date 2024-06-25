package day_12_string_class_continue;

public class StringEqualsMethod {

    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");

        boolean isEqual = str1 == str3;

        System.out.println(isEqual);

        // using equals() method
        boolean isEqual2 = str1.equals(str3);

        System.out.println(isEqual2);

        System.out.println(str2.equals(str1));
        System.out.println(str2.equals(str3));
        System.out.println(str1.equals(str3));

        System.out.println("===============================");

        String s1 = "Java";
        String s2 = "JAVA";

        // equals() method is case sensitive
        System.out.println("using equals method: "+ s1.equals(s2)); // false

        // equalsIgnoreCase() method is Not case sensitive
        // it ignores if they are in upper case or lower
        System.out.println("using equalsIgnoreCase method: " +s1.equalsIgnoreCase(s2)); // true

        System.out.println("===================================");
        // java is case sensitive that means 'A' is not equal to 'a'
        // "java" is not equal to "Java" because in one of the 'J' is upper case
        // for example a name can start with upper case letter or can be all upper case letter
        // for example 'A' is not equal to 'a' because 'A' is 65 and 'a' is 97 in ASCII


        String w = "java";
        String w2 = "JavA";

        System.out.println(w.equals(w2));
        System.out.println(w.equalsIgnoreCase(w2));


        String word1 = w.toUpperCase();
        String word2 = w2.toLowerCase();

        System.out.println(word1.equalsIgnoreCase(word2));






    }
}
