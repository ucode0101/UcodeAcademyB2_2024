package day_05_unary_shorthand_logical_operators;

public class ShorthandOperators {

    public static void main(String[] args) {

        long l = 10;

        // to add 10 to a variable

        l = l + 10; // we are adding 10 to l
        System.out.println(l);

        int num = 15;
        num = num - 5; // we are deducting 5 from num
        System.out.println(num);

        int num2 = 25;
        num2 = num2 / 5;
        System.out.println(num2);

        int num3 = 19;

        num3 = 200;

        System.out.println("=============================");

        int x = 10;
        int y = 25;

       // x = x + y; // long way
        //System.out.println(x);
        x += y; // shorthand/ short way
        System.out.println(x);

        System.out.println("====================================");

        // addition
        int number = 55;
        number = number + 77; // long way

        number += 10; // shorthand operator/short way
        System.out.println(number);

        // Deduction
        int number2 = 180;
        // long way
        number2 = number2 - 80;

        // shorthand operator
        number2 -= 20;
        System.out.println(number2);

        double d  = 140.5;
        double d1 = 20.5;
        // long way
        d = d * d1;

        // shorthand operator
        d *= d1;

        System.out.println(d);

        System.out.println("====================");

        // division
        long lNum = 100;
        // long way
        lNum = lNum / 20;

        // shorthand operator
        lNum /= 10;
        System.out.println(lNum);

        // Remainder
        int n1 = 120;
        int n2 = 21;

        // long way
        n1 = n1 % n2;

        // shorthand
        n1 %= n2;
        System.out.println(n1);



























    }
}
