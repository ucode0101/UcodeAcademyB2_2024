package day_04_ascii_comparison_operators;

public class ComparisonOperators {

    public static void main(String[] args) {

        // Compare/Check if one number is greater than other number

        System.out.println(5 > 10);
        System.out.println(10 > 8);

        System.out.println("==============================");

        boolean isGreaterThan = 50 > 29;
        System.out.println(isGreaterThan);

        boolean isGreaterThan2 = 89 >189;
        System.out.println(isGreaterThan2);

        System.out.println("=============================================");

        boolean isGreaterOrEqualTo = 8 >= 8; // will be true or false?
        boolean isGreaterOrEqualTo2 = 99 >98; // will be true or false?

        System.out.println(isGreaterOrEqualTo);
        System.out.println(isGreaterOrEqualTo2);

       boolean isAEqualToa = 'A' >= 'a'; // we will do this with == as well
        System.out.println(isAEqualToa);


        System.out.println("+++++++==========+++++++++++++");

       // System.out.println(1 < 10);

        boolean isLessThan = 109 < 190;
        boolean isLessThan2 = 298 < 139;

        System.out.println(isLessThan+"\n"+isLessThan2);

        boolean isLessOrEqual = 190 <= 192;

        boolean isLessOrEqual2 = 8989 <=199;

        System.out.println(isLessOrEqual);
        System.out.println(isLessOrEqual2);

        System.out.println("=======================");

        int a = 27;

        boolean check = a > 24;
        System.out.println(check);

        char ch3 = 'a';
        boolean b2 = ch3 >= 97;
        System.out.println(b2);




    }

}
