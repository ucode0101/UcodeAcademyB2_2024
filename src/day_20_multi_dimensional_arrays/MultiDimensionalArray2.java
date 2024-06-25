package day_20_multi_dimensional_arrays;

import java.util.Arrays;

public class MultiDimensionalArray2 {
    public static void main(String[] args) {


        int[][] multiDimensional = { {1,2,3}, {10,11,12,5,20,30}, {5,4,77,12,0} };
        System.out.println(Arrays.deepToString(multiDimensional));

        System.out.println("==========================================");

        for (int i =0; i<multiDimensional.length; i++){

            for (int j=0; j<multiDimensional[i].length; j++){
                System.out.print(multiDimensional[i][j]+" ");

            }
            System.out.println();

        }

        System.out.println("========================================");
        // write a program to find max number from two-dimensional array
        int max = multiDimensional[0][0];

        for (int i =0; i< multiDimensional.length; i++){

            for (int j=0; j< multiDimensional[i].length; j++){
                int x = multiDimensional[i][j];

                if (x > max){
                    max = x;
                }


            }

        }
        System.out.println("The max number is: "+ max);




    }
}
