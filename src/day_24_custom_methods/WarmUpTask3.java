package day_24_custom_methods;

import java.util.Scanner;

public class WarmUpTask3 {
    public static void main(String[] args) {
        // Task 3:
        //Write a program to insert 'A' in front of each 'a' in a string -> java => jAavAav

        System.out.println("Please enter something");
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        StringBuilder str2 = new StringBuilder(str);

        for (int i=0; i< str.length(); i++){
            if (str2.charAt(i) == 'a'){
                str2.insert(i, 'A');
                i++;
            }
        }

        System.out.println(str2);

    }
}
