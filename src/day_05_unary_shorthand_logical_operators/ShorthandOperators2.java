package day_05_unary_shorthand_logical_operators;

public class ShorthandOperators2 {

    public static void main(String[] args) {
        String str = "java";

        // concatenation
        // long way
        str = str + " and selenium";
        System.out.println(str);

        // shorthand
        str += " and api";
        System.out.println(str);

        System.out.println("========================");





        // How to find if a number is even
        int z = 198;

        boolean isEvenNum = z % 2 ==0;
        System.out.println(isEvenNum);

        // how to find if a number is odd

        int w = 279;

        boolean isOddNum = w % 2 != 0;
        System.out.println(isOddNum);


    }
}
