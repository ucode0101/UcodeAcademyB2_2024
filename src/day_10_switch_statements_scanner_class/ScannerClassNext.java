package day_10_switch_statements_scanner_class;

import java.util.Scanner;

public class ScannerClassNext {
    public static void main(String[] args) {
        // write to ask user to enter first name, last name
        // and print first name and last on the console

        String firstName;
        String lastName;
        Scanner input = new Scanner(System.in);

        System.out.println("Hello, please enter your first name");

        firstName = input.next(); // if name is Mike Jr, it will take only Mike

        System.out.println("Hi "+firstName+"! please enter your last name");
        lastName = input.next();

        System.out.println("Nice to meet you "+firstName+" "+lastName);

        input.close();;


    }
}
