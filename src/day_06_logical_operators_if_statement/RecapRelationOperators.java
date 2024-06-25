package day_06_logical_operators_if_statement;

public class RecapRelationOperators {
    public static void main(String[] args) {



        int num1 = 10;
        int num2 = 20;

        String str = "java"+ num1 + num2; // java1020

        String str2 = "java" + (num1 + num2); // java30
        System.out.println(str);
        System.out.println(str2);

        System.out.println("=====================");

        boolean isEven = (10 + 6) % 2 == 0;
        System.out.println(isEven);

        boolean isEven2 = (5 * 4) % 2 ==0;

        System.out.println(isEven2);

        boolean isOdd = (58 - 12) % 2 !=0;
        System.out.println(isOdd);



        boolean isOdd2 = 59 + 22 >=100;

       boolean isEqual = str != str2;

       int num3 = 13;
       num3 += 'a' + 10;

        System.out.println(num3);




    }
}
