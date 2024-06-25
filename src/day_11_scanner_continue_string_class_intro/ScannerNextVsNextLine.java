package day_11_scanner_continue_string_class_intro;

import java.util.Scanner;

public class ScannerNextVsNextLine {
    public static void main(String[] args) {

        // ask the user to enter first name, and last name

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");

        //String firstName= input.next();
        //input.nextLine();
        String firstName = input.nextLine();

        System.out.println("Enter your last name");
        String lastName = input.nextLine();

        System.out.println(firstName+" "+lastName);

    }
}
