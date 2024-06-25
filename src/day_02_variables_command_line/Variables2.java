package day_02_variables_command_line;

public class Variables2 {

    public static void main(String[] args) {
        // create variables -> declare and assign value directly

        // one variable
        int number = 1234;

        // multiple variable
        byte b1=10, b2=13, b3=89;

        System.out.println(number);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        // declare multiple variables of the same data type at same time
        char c1 = 't', c2 = 'y', c3 = 'm';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        // create a String variable and include escape sequence
        String myString = "I\nlike\tjava\ncoding";

        System.out.println(myString);

        double myDouble = number;
        System.out.println(myDouble);

        float myFloat = b3;
        System.out.println(myFloat);

        double d = 7.9;
        float f = 9.8F;
        System.out.println(d);
        System.out.println(f);

        //



    }
}
