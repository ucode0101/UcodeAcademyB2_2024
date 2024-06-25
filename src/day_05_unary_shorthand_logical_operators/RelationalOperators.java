package day_05_unary_shorthand_logical_operators;

public class RelationalOperators {
    public static void main(String[] args) {
        // declare variable
        byte b;
        int a;
        // Initialize variable -> means assign value
        b = 45;
        a = 90;
        // Declare and Initialize
        char ch = 'a';
        int y = 40;


        int num1 = 379;
        int num2 = 209;

        // We need to surround num1 > num2 in parentheses
        System.out.println("num1 is greater than num2: "+ (num1 > num2));

        // or assign the boolean result in a boolean variable
        boolean isGreater = num1 > num2;
        System.out.println("num1 is greater than num 2: " + isGreater);
    }
}
