package day_06_logical_operators_if_statement;

public class LogicalAndOrOperators {

    public static void main(String[] args) {

        // write a program to check if the number is greater than 20, and it is even
        // or the number is less than 20 and it is odd

        int number = 25;

        boolean isTrue = number > 20 && number % 2 != 0 || number < 20 && number % 2 !=0;

        boolean isTrue2 = (number > 20 && number % 2 == 0) || (number < 20 && number % 2 != 0);

        System.out.println(isTrue);
        System.out.println(isTrue2);

        System.out.println("==============================================");

        boolean isGreater = 50 > 49 || 10 % 2 ==0 && 20 <14;

        boolean isGreater2 = 20 < 14 && 10 > 49 || 10 % 2 ==0;


        System.out.println(isGreater);
        System.out.println(isGreater2);
    }
}
