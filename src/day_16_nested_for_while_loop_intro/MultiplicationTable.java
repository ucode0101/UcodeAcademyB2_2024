package day_16_nested_for_while_loop_intro;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // write a program to take a number from user and generate its multiplication table
        // 2 x 2 = 4
        // 2 x 3 = 6

        System.out.println("Please enter a number");
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        // with nested  for loop
        for (int i=number; i<=number; i++){

            for (int j=1; j<=10; j++){
                System.out.println(i +" x "+j+ " = "+ (i*j));

            }

        }
        System.out.println("==============================================");
        // with one loop

        for (int i=1; i<=10; i++){
           System.out.println(i+" x "+ number+" = "+(i*number));
            // do it with printf
            //System.out.printf("%2d x %2d = %2d\n",i,number, (i*number));
        }






    }
}
