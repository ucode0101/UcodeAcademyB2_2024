package day_27_wrapper_class_arraylist_intro;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "123";

        byte b1 = Byte.parseByte(str);
        Byte b2 = Byte.parseByte(str);

        int n1 = Integer.parseInt(str);

        Integer n2 = Integer.parseInt(str);

        float f1 = Float.parseFloat(str);
        Float f2 = Float.parseFloat(str);

        double d1 = Double.parseDouble(str);
        Double d2 = Double.parseDouble(str);

        // MAX_VALUE; return the max value the variable can hold
        // MIN_VALUE; returns the min value the variable can hold

        System.out.println(b1+"\n"+b2);

        System.out.println("===============================================");


    }
}
