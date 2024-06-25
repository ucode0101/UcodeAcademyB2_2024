package day_04_ascii_comparison_operators;

public class UnaryOperators {
    public static void main(String[] args) {

        int unaryPlus = +10;
        System.out.println(unaryPlus);

        int unaryMinus = -10;
        System.out.println(unaryMinus);

        System.out.println("==================");

        int number = +unaryPlus;
        System.out.println(number);
        System.out.println(10 - 19);

        System.out.println("==============================================");

        byte b = 5;
        ++b; // increment/adds 1 to b
        System.out.println(b);

        --b; // decrement/deducts one from b
        System.out.println(b);

        System.out.println("===================");

        int var = 100;

        var = var + 1; // take the value of var which 100 and add 1 to it = 101;
        System.out.println(var);

        // Increment var by 1
        var ++;
        System.out.println(var);

        // Decrement var by 1
        var --;
        System.out.println(var);





    }
}
