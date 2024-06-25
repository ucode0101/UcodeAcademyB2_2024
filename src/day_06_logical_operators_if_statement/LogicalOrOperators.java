package day_06_logical_operators_if_statement;

public class LogicalOrOperators {

    public static void main(String[] args) {

        // check if the number is greater than 30, or it is even number
        int number =55;

        boolean isTrue = number > 30 || number % 2 ==0; // true
        boolean isTrue2 = number > 100 || number % 2 == 0 || number > 30; // true

        boolean isTrue3 = number < 30 || number % 2 ==0 || number > 100; // false

        System.out.println(isTrue);
        System.out.println(isTrue2);
        System.out.println(isTrue3);


        System.out.println("===========================================");

        boolean isTrue4 = "java" == "api" || 'a' == 'A' || number >99 || number % 2 !=0; // true
        System.out.println(isTrue4);
    }
}
