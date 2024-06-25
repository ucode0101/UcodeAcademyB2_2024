package day_21_multi_d_array_for_each_loop;

import java.util.Scanner;

public class WarmUpTaskPrimeNumber {
    public static void main(String[] args) {

        // Warm up task prime number:
        //Prime number is the positive number that's evenly divisible by 1 and itself
        //Write a program to check if the number is prime
        // prime numbers are 3, 5, 7, 11, 13, etc..
        System.out.println("Enter a number please");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number < 2){
            System.out.println("It is not a prime number");
        }
        for (int i=2; i< number; i++){

            if (number % i ==0){
                System.out.println("It is not a prime number");
                break;
            }
        }



    }
}
