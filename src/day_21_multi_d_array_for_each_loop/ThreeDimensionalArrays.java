package day_21_multi_d_array_for_each_loop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ThreeDimensionalArrays {
    public static void main(String[] args) {

        int [][][] threeD = new int[2][2][2];
        threeD[0][0][0] = 1;
        threeD[0][0][1] = 2;

        threeD[1][0][0]= 3;
        threeD[1][0][1] = 4;

        threeD[0][1][0] = 19;

        System.out.println(Arrays.deepToString(threeD));

        System.out.println(threeD[0][1][0]);




        int [][][] d3 = {  { {1,2,3,4}, {5,6,7,8} }, { { 9,10,11 }, { 12,13,14,15} }  };





        System.out.println("==================================");


        for (int i=0; i < d3.length; i++){

            for (int j=0; j< d3[i].length; j++){

                for (int k=0; k< d3[i][j].length; k++){

                    System.out.print(d3[i][j][k]+" ");

                }
                System.out.println();

            }


        }

        int [][][]  a = {  { {11,2,22}, {5,6,7} }, { {55,5,5,}, { 2,44,4,4,6} }  };
    }
}
