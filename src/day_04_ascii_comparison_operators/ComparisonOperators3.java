package day_04_ascii_comparison_operators;

public class ComparisonOperators3 {

    public static void main(String[] args) {

        System.out.println( 10 + 10 > 19);
        System.out.println(89 / 2 == 10);

        boolean isGreater = 28 + 18 >=40;

        System.out.println("isGreater: "+isGreater);

        boolean isEqual = 89 + 12 - 15 == 89;
        System.out.println("isEqual: "+isEqual);

        boolean isNotEqual = 21 * 3 -122 + 89 !=100;

        System.out.println("isNotEqual: "+isNotEqual);

        boolean isEqual3 = 'a' + 'b' - 'c' + 22 -11 == 111;


        System.out.println("isEqual3: "+isEqual3);
        System.out.println("========================");

        byte b = 10;
        short sh = 19;
        int n = 89;
        long l = 11;
        double d = 10.0;

        System.out.println(d == b);


       boolean isFalse = b == sh;
        System.out.println(isFalse);

       // System.out.println(10 == "java"); does not work


    }
}
