package day_05_unary_shorthand_logical_operators;

public class LogicalAndOrOperators {

    public static void main(String[] args) {
        float f = 50.5f;

        boolean isTrue = f > 40;
        System.out.println(isTrue);

        int num = 887;
        System.out.println("================================");

        // check if num variable is greater than 500 and less than 1000

        // we are checking if the num is greater AND less
        //                  true  and   true
        boolean isRange = num > 500 && num < 1000; // true
        System.out.println(isRange);
                        // true   and    false
        boolean range = num > 500 && num < 700; // false
        System.out.println(range);

        System.out.println("============================");
        //                    true     and  false
        boolean myBoolean = num < 1000 && num % 2 == 0;  // false
        System.out.println(myBoolean);
        //                    false   and  true
        boolean myBoolean2 = num > 990 && num % 2 !=0;
        System.out.println(myBoolean2);
    }
}
