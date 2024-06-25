package day_04_ascii_comparison_operators;

public class VariablesReview {


    public static void main(String[] args) {
        int number; // variable declaration
        number = 10; // initializing variable/ assigning a value to variable
        System.out.println(number);

        number = number - 2;
        System.out.println(number);

        boolean myBoolean = true;
        boolean myBoolean2 = false;

        // one way to cast to double
        double d = (double) 10 / 3;
        // second way to cast to double
        double d2 = 10.0 / 3.0;

        // third way to cast to double
        double d3 = 10d / 3d;

        System.out.println(d);
        System.out.println(d2);
        System.out.println(d3);

        System.out.println("==================================");

        char ch = 61;

        int num = 'a';
        System.out.println("This is char variable "+ch);
        System.out.println("This is int variable "+num);

        int sumOfAandB = 'a'+'b';
        System.out.println(sumOfAandB);

        char ch2 = 10 + 112;
        System.out.println(ch2);

    }
}
