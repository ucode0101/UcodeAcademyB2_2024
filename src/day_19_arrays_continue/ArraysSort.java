package day_19_arrays_continue;

import java.util.Arrays;

public class ArraysSort {

    public static void main(String[] args) {
        char[] chars = {'c','i','b','a','d','j','f'};

        System.out.println("Original Array: "+Arrays.toString(chars));

        // sort chars Array in alphabetical/ascending order using Arrays.sort() method
        Arrays.sort(chars);

        System.out.println("Sorted Array: "+ Arrays.toString(chars));

        System.out.println("==============================================");

        int [] numbers = {3,1,6,4,2,5};
        System.out.println(Arrays.toString(numbers));

        // sort int Array in ascending order
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println("=====================================");

        int [] nums = {44,12,23,19,2,22,109,33,1,3};


        // write a program to find max/highest number from Array
        // sort the Array and get the element at the last
        Arrays.sort(nums); // sorting array in ascending order lower to higher

        int max = nums[nums.length-1];


        // Write a program to find min/lowest number from Array
        int min = nums[0];

        System.out.println("Max number: "+ max);
        System.out.println("Min number: "+ min);


    }
}
