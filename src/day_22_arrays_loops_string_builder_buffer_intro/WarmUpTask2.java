package day_22_arrays_loops_string_builder_buffer_intro;

import java.util.Arrays;

public class WarmUpTask2 {
    public static void main(String[] args) {
        //Task 2:
        //Write a program to combine and sort two arrays into one array

        int [] arr1 = {4,1,7,2,3,6,4};
        int [] arr2 = {9,7,8,10,12,13,11};

        int [] result = new int[arr1.length + arr2.length];

        for (int i=0; i< arr1.length; i++){
            result[i]=arr1[i];
        }

        int index =0;

       for (int i=arr1.length; i<result.length; i++){
           result[i] = arr2[index];
           index++;
       }

       // Sort Array
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));

        System.out.println("============================================");

        // Combine 2 arrays into 1 array using System.arraycopy()
        int [] arr3 = new int[arr1.length + arr2.length];

        // Adding/copying arr1 to arr3
        System.arraycopy(arr1,0,arr3,0,arr1.length);

        // Adding/copying arr2 to arr3
        System.arraycopy(arr2,0,arr3,arr1.length, arr2.length);

        // Sort Array
       // Arrays.sort(arr3);

        // Sort Array in ascending with loop
        int temp =0;
        for (int i=0; i< arr3.length; i++){

            for (int j = i+1; j< arr3.length; j++){

                if (arr3[i] > arr3[j]){
                    temp = arr3[i]; // arr[i] is 2
                    arr3[i] = arr3[j];
                    arr3[j] = temp;
                }

            }
        }



        System.out.println(Arrays.toString(arr3));








    }
}
