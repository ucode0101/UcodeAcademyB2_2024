package day_05_unary_shorthand_logical_operators;

public class UnaryOperators2 {
    public static void main(String[] args) {
        int x =2;
        int y = x++; // the old value of x will be assigned to y, and then x will be increased by 1
        System.out.println("the value of y: "+y);
        // the value of x 3 now
        System.out.println(x);

        System.out.println("====================");
        // to assign a new value to variable
        int x1 = 2; // the new value of x1 is 2
        System.out.println(x1++); // the old value will be printed, and it will be increased by 1

        System.out.println("======================");
        int x2 = 2;
        System.out.println(--x2); // the value will be decreased by and then it will be print

        System.out.println("==========================");

        int n = 8;
        int m = n --; // the old value of n will be assigned to m, and then it will be decreased by 1
        System.out.println(m); // the old value which is 8

        System.out.println("===========================");
        // Task 1:
        int a = 1;
        a = - a-- + a++ / -a-- * --a;
        System.out.println(a);

        System.out.println("=======================================");

        // Task
        a = 50; // assigning a new value to a
       a = --a + a++ + a-- + a++;

        System.out.println(a);
        System.out.println(49 + 49 + 50 + 49);

        // the value of a should be 50

        // Task

       int i = 4;
       int j = i * 4 - i++;
        System.out.println(j);



    }
}
