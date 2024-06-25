package day_06_logical_operators_if_statement;

public class LogicalAndOperator {
    public static void main(String[] args) {

        boolean isTrue = 10 > 5 && 7 + 4 == 11 && 7 - 2 ==5;
        System.out.println(isTrue);

        boolean isTrue2 = 45 % 2 == 2 && 5 * 5 > 20 && 199 + 20 <=300;
        System.out.println(isTrue2);

        // Check if the number is greater than 10 and it is even number

        int number = 56;
        System.out.println(number > 10 && number % 2 ==0);

        // Check if the number is greater than 10 and it is odd number
        System.out.println(number > 10 && number % 2 !=0);



    }
}
