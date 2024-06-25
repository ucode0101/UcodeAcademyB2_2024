package day_20_multi_dimensional_arrays;

import java.util.Arrays;

public class MultiDimensionalArray4 {

    public static void main(String[] args) {

        int[] arr = {4,2,1,3};
        Arrays.sort(arr); // it sorts one dimensional array
        System.out.println(Arrays.toString(arr));

        System.out.println("=========================================");


        int [][] nums = { {4,1,3,2}, {7,2,5,1,3,4}, {8,4,7,5,3,6}, {4,1,3,2}, {7,2,6,5,1,3,4}, {8,4,7,1,5,3,6} };

        //Arrays.sort(nums); // it does not sort multidimensional array

        for (int i=0; i<nums.length; i++){
            Arrays.sort(nums[i]);
        }



        System.out.println(Arrays.deepToString(nums));
    }

}
