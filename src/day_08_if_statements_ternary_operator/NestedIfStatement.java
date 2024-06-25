package day_08_if_statements_ternary_operator;

public class NestedIfStatement {
    public static void main(String[] args) {

        char ch = '9';

        // Using nested if else in else block
        if (ch >='a' && ch<='z'){
            System.out.println("It is lower case char");
        }
        else{
            if (ch >='A' && ch <='Z'){
                System.out.println("It is upper case");
            }
            else{
                System.out.println("It is not a character");
            }

        }

        System.out.println("============================================");
        // using nested if else within if statement
        if ( (ch >= 'A' && ch <='Z') || (ch >='a' && ch <='z') ){

            if (ch >='a' && ch <='z'){
                System.out.println("It is lower case character");
            }
            else {
                System.out.println("It is upper case character");
            }


        }
        else {
            System.out.println("It is not a character");
        }

    }
}
