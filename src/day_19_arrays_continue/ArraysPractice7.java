package day_19_arrays_continue;

import java.util.Arrays;

public class ArraysPractice7 {
    public static void main(String[] args) {
        int [] nums = {3,2,4,5,6,87,2,11,22};
        // print each element in reverse order
        for (int i = nums.length-1; i>=0; i--){
            System.out.print(nums[i]+" ");
        }
        System.out.println("\n========================================");

        // Write a program to reverse Array [1,2,3,4] -> [4,3,2,1]

        int [] reverse = new int[nums.length];
        int index = 0;

        for (int i= nums.length-1; i>=0; i--){
            reverse[index] = nums[i];
            index++;
        }

        System.out.println("Original: "+ Arrays.toString(nums));
        System.out.println("Reversed: "+Arrays.toString(reverse));


    }
}
