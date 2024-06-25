package day_23_decimal_format_arrays_loops_review;

import java.util.Arrays;

public class TaskMoveZerosToTheEnd {
    public static void main(String[] args) {
        // Task:
        // Write a program to move all zeros to the end in int Array
        // [0,3,0,1,0,2] ->[3,1,0,0,0]

        int [] nums = {0,45,0, 22,0,3,0,1,0,2};

        int [] arr = new int[nums.length];
        int index =0; // this will be used as index for arr

        // With this logic, we only add numbers to arr that are not zero
        for (int i=0; i< nums.length; i++){
            if (nums[i] != 0){
                arr[index] = nums[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("==============================================");

        // with this logic we move zeros to the end in existing array (nums)
        for (int i=0; i< nums.length; i++){
            int temp =0;
            for (int j =i+1; j< nums.length; j++){

                if (nums[i] ==0 ){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;

                }

            }

        }

        System.out.println(Arrays.toString(nums));




    }
}
