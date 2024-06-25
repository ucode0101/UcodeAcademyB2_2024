package day_08_if_statements_ternary_operator;

public class WarmUpTask {
    public static void main(String[] args) {

        // Write program to check if a character is upper case or lower case

        // Single if statement
        char ch = '&';
        // one way
        if (ch >='a' && ch <='z'){
            System.out.println(ch+" is lower case character");
        }
        if (ch >= 'A' && ch <='Z'){
            System.out.println(ch+" is upper case character");
        }
        System.out.println("=============================================");
        // second way using decimals that represent characters in ASCII table
//        if (ch >= 97 && ch <=122){
//            System.out.println(ch+" is a lower case character");
//        }
//        if (ch >=65 && ch <=90){
//            System.out.println(ch+" is upper case character");
//        }

        System.out.println("==================================");
        // with if else


        if (ch >='a' && ch<='z'){  // this will work if char is only character
            System.out.println("It is lower case");
        }
        else{
            System.out.println("It is upper case");
        }

        System.out.println("=======================================");
        // with if else-if statement

        if (ch >='a' && ch <='z'){
            System.out.println("It is lower case char");
        }
        else if (ch >='A' && ch <='Z'){
            System.out.println("It is upper case char");
        }
        else {
            System.out.println("It is not a character");
        }



    }
}
