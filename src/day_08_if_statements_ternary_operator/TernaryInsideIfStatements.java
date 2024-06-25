package day_08_if_statements_ternary_operator;

public class TernaryInsideIfStatements {

    public static void main(String[] args) {


        char ch = '%';
        String result = "";
        if ((ch >='a' && ch <='z') || (ch >='A' && ch <='Z')){

            result = (ch >= 'a' && ch <='z') ? "Lower case" : "Upper case";
        }
        else {
            System.out.println("It is not character");
        }
        System.out.println(result);

        System.out.println("=======================================");

        String result2 ="";

        if (ch >='a' && ch <='z'){
           result2 = "It is lower case char";
        }
        else {

          result2 = (ch >='A' && ch <='Z') ? "It is upper case char" : "It is not character";
        }
        System.out.println(result2);

    }
}
