package day_08_if_statements_ternary_operator;

public class TernaryOperator {

    public static void main(String[] args) {

        // write a program to find the max number
        int num1 = 445;
        int num2 = 48;
        int maxNum = 0;

        // using if else
        if (num1 > num2){
            maxNum = num1;
        }
        else {
            maxNum = num2;
        }
        System.out.println(maxNum);
        System.out.println("===============================");

        // using ternary operator

        int maxNum2;

        maxNum2 = (num1 > num2) ? num1 : num2;

        System.out.println(maxNum2);

        System.out.println("============================================");
        // write a program to find max number out of three numbers

        int n1 = 78;
        int n2 = 99;
        int n3 = 82;
        int max =0;

        // Using if else-if
        if (n1 > n2 && n1> n3){
            max = n1;
        }
        else if (n2 > n1 && n2 >n3){
            max = n2;
        }
        else {
            max = n3;
        }
        System.out.println(max);

        System.out.println("========================================");
        // using ternary operator

        int max2 = (n1 > n2 && n1 > n3) ? n1 : (n2 > n1 && n2 > n3) ? n2 : n3;

        System.out.println(max2);

        String str = (n1 > n2 && n1 >n3) ? n1+" is max" : (n2 > n1 && n2 > n3) ? n2+" is max" : n3+" is max";

        System.out.println(str);







    }

}
