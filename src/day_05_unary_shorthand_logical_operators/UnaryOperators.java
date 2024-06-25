package day_05_unary_shorthand_logical_operators;

public class UnaryOperators {

    public static void main(String[] args) {


        int a = 25;

        //a = a + 1;

        // Pre increment
        // the value of a will be increased/incremented by 1 before it the print statement takes place
        System.out.println(++a); // the value of a will be 26
        //System.out.println(a); // the value of a is still 26

        // Pre decrement
        // the value of a will be decreased/decremented by 1 before it the print statement takes place
        System.out.println(--a); // the value of a will be 25

        System.out.println("===================================");

        int b = 25;

        // Post Increment
        // The value of b will be increased by after it is printed. (we don't see 26 in the console)
        System.out.println(b++); // 25

        // the value of b is 26
        // Post Decrement
        // The value of b will decrement/decreased by  1 after it is printed
        System.out.println(b--); // 26

        // the value of b is 25
        System.out.println(b); // what will be the value


        System.out.println("==============================================");

        int num = 10;
        int num2 = ++num;  // it is the same as int num2 = num + 1;
        // num is increased by 1 before assigning it to num2, and the value of num will be 11
        System.out.println(num2);

        int num3 = 15;
        int num4 = --num3; // is is the same as int num4 = num3 - 1;
        // num3 is decreased by 1 before assigning to num4 and the value of num3 will be 14
        System.out.println(num4);

        System.out.println("==============================================");

        // Post decrement
        byte myByte = 19;
        byte myByte2 = myByte--;  // myByte will be assigned to myByte2 and then the value will be decremented by 1

        // Now the value of myByte is 18
        System.out.println(myByte2);
        System.out.println(myByte);

        // Post Increment
        short sh = 12;
        short sh2 = sh++; // sh will be assigned to sh2 and then the value will be incremented by 1
        // now the value of sh is 13
        System.out.println("sh2: "+sh2); // 12 will be printed
        System.out.println("sh: "+sh); // 13 will be printed

        System.out.println("==============================================");

        int n = 15;
        n = n + 5;

        ++n;
        ++n;
        n++;
        --n;
        n--;
        n++;
        ++n;
        --n;
        ++n;
        System.out.println(n);






    }

}
