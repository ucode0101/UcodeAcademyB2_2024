package day_22_arrays_loops_string_builder_buffer_intro;

import java.util.Arrays;

public class WarmUpTask1 {
    public static void main(String[] args) {

        //Task 1:
        //Write a program to store all even numbers in one array
        //and odd numbers in another array from two-dimensional array

        int [][] arr = { {1,12,3,5,62,20}, { 22,43,8,6,89,90} };

        int evenCount = 0;
        int oddCount = 0;

        for (int [] num : arr){

            for (int eachElement : num){

                if (eachElement % 2 ==0){
                    evenCount ++;
                } else {
                    oddCount ++;
                }

            }

        }

        int [] evenArr = new int[evenCount];
        int [] oddArr = new int[oddCount];
        int evenX =0;
        int oddX =0;

        for (int [] eachArr : arr){

            for (int i : eachArr){

                if (i % 2 ==0){
                    evenArr[evenX] = i;
                    evenX ++;
                } else {
                    oddArr[oddX] = i;
                    oddX++;
                }

            }

        }

        System.out.println("Even Array: "+ Arrays.toString(evenArr));
        System.out.println("Odd Array: "+ Arrays.toString(oddArr));



    }
}
