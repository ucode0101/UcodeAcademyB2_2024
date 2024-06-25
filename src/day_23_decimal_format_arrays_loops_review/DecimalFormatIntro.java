package day_23_decimal_format_arrays_loops_review;

import java.text.DecimalFormat;

public class DecimalFormatIntro {
    public static void main(String[] args) {

        double d = 10.0 / 3;
        // will print lots of numbers after .
        System.out.println(d);

        // will print lots of numbers after .
        System.out.println(11.0 / 3);

        System.out.println("====================================");

        // round to 2 numbers after .
        DecimalFormat df = new DecimalFormat("0.00");

        // OR
       // DecimalFormat df = new DecimalFormat(".00");

        // format to 2 decimal after . and print
        System.out.println(df.format(d));

        // we will cover Double and its methods when we cover Wrapper class
        //d = Double.parseDouble(df.format(d));

        System.out.println(df.format(d));

        DecimalFormat df2 = new DecimalFormat(".00");
        System.out.println(df2.format(d));




    }
}
