package day_03_variables_arithmetic_operators;

public class NarrowingConversion {
    public static void main(String[] args) {
        int num = 10;

        byte myByte = (byte) num;

        byte myByte2 = 20;

        int num2 = myByte2;

        double myDouble = 5.99999999;

        int num3 = (int) myDouble;

        System.out.println(num3);

        byte byte2 = (byte) myDouble;
        System.out.println(byte2);


        double myDouble2 = 898989890909.00;

        byte byte3 =(byte) myDouble2;
        int num4 = (int) myDouble2;

        System.out.println(byte3);
        System.out.println(num4);

       long lNumber = 4484848;
        System.out.println("This is long number "+lNumber);


        float myFloat2 = 9.55f;

        // assigning float to double
        double myDouble3 = myFloat2;

        System.out.println(myDouble3);

        double d5 = 8.21;

        float f5 = (float) d5;
        System.out.println(f5);

        long l2 = 7878;
        int n2 = (int) l2;
        System.out.println(n2);

        double d3 = 5;
        System.out.println(d3);






    }
}
