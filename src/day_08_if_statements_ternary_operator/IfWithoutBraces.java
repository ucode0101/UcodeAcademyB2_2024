package day_08_if_statements_ternary_operator;

public class IfWithoutBraces {
    public static void main(String[] args) {

        int num1 = 2;
        int num2 = 5;

        if (num1 > num2) System.out.println(num1);
        else System.out.println(num2);
        // use ternary operator
        // write a program to check if the number is greater than 60 and it even
        // multiply by 2 and assign it to a varible
        // if it is less than 60 or it is odd multiply by 3


        int number = 62;
        if (number >60 && number % 2 ==0){
            number *= 2;
        }
        else{
            number *= 3;
        }
        System.out.println(number);

        System.out.println("=======================");

        int number2 = 60;

        int total = (number2 > 60 && number2 % 2 ==0) ? number2 * 2 : number2 * 3;
        System.out.println(total);
    }
}
