package day_23_decimal_format_arrays_loops_review;

public class TaskFibonacciSequence {
    public static void main(String[] args) {
        // Write a program to return Fibonacci sequence of number
        // fibonacci number next number is sum of two previous numbers
        // 0 0 1 2 3 5 8 13 21 34

        int number = 9;
        int left=0, right =1, sum =0;


        for (int i=1; i<number; i++){

            sum = left + right;
            left = right;
            right = sum;

            System.out.println(sum);


        }

    }
}
