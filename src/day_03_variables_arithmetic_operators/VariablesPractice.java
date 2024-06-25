package day_03_variables_arithmetic_operators;

public class VariablesPractice {
    public static void main(String[] args) {
        byte b1 =20;
        byte b2 = 10;
        short sh =21;


//        short sh = b1 + b2; does not compile
         short sh2 =(short) (b1+b2); // we will cover it more in details after arithmetic operators



        String str = ""+23;
        System.out.println(str);

        double d = 5.5;
        float f = 6.7f;
        String str2 = ""+d+f;

        System.out.println(str2);

        char ch = 'a';
        int number = 10;

        String str3 = ""+ch+number;
        System.out.println(str3);

        boolean myBoolean = true;
        String str5 = ""+myBoolean;
        System.out.println(str5);

        char char2 = 66; // we will cover more when start learning ASCII table
        System.out.println(char2);



    }
}
