package day_03_variables_arithmetic_operators;

public class ArithmeticOperators {

    public static void main(String[] args) {
        // multiplication
        int multiplyNumbers = 10 * 10;
        System.out.println(multiplyNumbers);

        int m2 = 5 * 5 * 5;
        System.out.println(m2);

        double d5 = 10 * 5 / 5;
        System.out.println(d5);

        // division with variables that take whole number
        byte num2 = 10 / 4;
        short sh = 12/ 5;
        int num3 = 89 / 10;
        System.out.println(num2);
        System.out.println(sh);
        System.out.println(num3);

        // division with variables that take numbers with decimals
        double d1 = (double) 10 / 4; // without casting to double, the result will be 2.0
        float f1 = (float) 12/ 5; // without casting to float, the result will be 2.0
        System.out.println(d1);
        System.out.println(f1);

        double d2 = 10d / 4d;
        float f2 = 12f / 5f;
        System.out.println(d2);
        System.out.println(f2);

        double d3 = 10.0 / 4.0;
        float f3 = 12.0f / 5.0f;
        System.out.println(d3);
        System.out.println(f3);

        System.out.println("=============================");

        // addition
        System.out.println( 50 + 10);

        int outcome = 12 + 6 / 3;
        System.out.println(outcome);

        System.out.println(5 + 5 * 2);

        // subtraction
        System.out.println(10 - 19);
        System.out.println(89 - 79);

        // modulus / Remainder

        System.out.println(19 % 5);
        System.out.println(20 % 5);

        System.out.println( 5 % 2 );
        System.out.println(4 % 2);

        System.out.println(5 + 2 * 4);

        System.out.println(10 / 2 - 3);
        System.out.println(8 + 12 * 2 - 4);

        System.out.println(4 + 17 % 2 -1);

        System.out.println(6 - 3 * 2 + 7 - 1);

        System.out.println( (5 + 2) * 4);

        byte a =5;
        byte b = 10;
        byte c = 5;
        byte d = 10;

        double average = (a+b+c+d) / 4.0;
        System.out.println(average);


    }
}
