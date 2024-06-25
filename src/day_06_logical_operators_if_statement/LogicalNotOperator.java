package day_06_logical_operators_if_statement;

public class LogicalNotOperator {
    public static void main(String[] args) {

        System.out.println(!true); // true will be false because of ! Not Operator
        System.out.println(!false);

        System.out.println("==========================");

        boolean b = !true;
        boolean b1 = !b;

        System.out.println(b1);

        boolean b2 = true == false;

        b2 = !b2;
        System.out.println(b2);

       boolean b3 = !true == false;
        System.out.println(b3);





    }
}
