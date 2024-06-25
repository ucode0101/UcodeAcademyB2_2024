package day_10_switch_statements_scanner_class;

import java.util.Scanner;

public class ScannerClassNextByte {
    public static void main(String[] args) {
        byte number;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number size of byte");

        number = input.nextByte();

        System.out.println("You entered: " +number);



    }
}
