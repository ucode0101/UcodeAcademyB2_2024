package day_26_local_date_and_wrapper_class_intro;

public class WrapperClassIntro {

    public static void main(String[] args) {

        byte bPrimitive = 12;

        Byte wrapperByte = bPrimitive; // Autoboxing

        Byte b2 = 10;
        byte b3 = b2; // Unboxing

        Byte b4 = Byte.MIN_VALUE;
        byte b5 = Byte.MAX_VALUE;

        System.out.println(b4);
        System.out.println(b5);

        short maxShor = Short.MAX_VALUE; //unboxing
        short minShort = Short.MIN_VALUE; // unboxing

        int maxInt = Integer.MAX_VALUE; // unboxing
        int minInt = Integer.MIN_VALUE; // unboxing

        Long maxLong = Long.MAX_VALUE;
        long minLong = Long.MIN_VALUE;
        String s = "23";

        byte  b12 = Byte.parseByte("21");




    }
}
