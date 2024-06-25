package day_11_scanner_continue_string_class_intro;

import java.util.Scanner;

public class ScannerHasMethods {
    public static void main(String[] args) {
        // write a program to ask user to enter a number
        // and check if it is byte, short, int, long, float, or double

        Scanner input  = new Scanner(System.in);


        System.out.println("Please enter a number");
        System.out.println(input.hasNextByte());
        System.out.println(input.hasNextShort());
        System.out.println(input.hasNextInt());
        System.out.println(input.hasNextLong());
        System.out.println(input.hasNextFloat());
        System.out.println(input.hasNextDouble());

//       input.close();


        System.out.println("============================");

        // ask the user to enter a number and check if it is whole number or float -> 5.55
        // if it is whole number assign to int else assign to double
        System.out.println("Please enter any number");
        Scanner scan = new Scanner(System.in);



        int intNum=0;
        double doubleNum=0;

        if (scan.hasNextInt()){
            intNum = scan.nextInt();
        }
        else {
            doubleNum = scan.nextDouble();
        }
        System.out.println(intNum);
        System.out.println(doubleNum);
    }
}
