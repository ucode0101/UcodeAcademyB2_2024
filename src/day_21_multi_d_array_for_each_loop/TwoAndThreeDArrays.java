package day_21_multi_d_array_for_each_loop;

import java.util.Arrays;

public class TwoAndThreeDArrays {
    public static void main(String[] args) {

        int [] a = { 1,2,3,4};
        int [] b = { 1,2,3,4};

        String s = Arrays.toString(a);
        System.out.println(s);


        System.out.println("======================");

        boolean b1 = Arrays.equals(a,b);
        System.out.println(b1);

        System.out.println("===========================");

        int [][] arr1 = { {1,2,3}, {4,5,6} };

        int [][] arr2 = { {1,2,3}, {4,5,6} };

        boolean b2 = Arrays.deepEquals(arr1,arr2);

        System.out.println(b2);

        System.out.println("==============================================");

        int [][][] multiD3 =  {  { {1,2,3}, {1,2,3} }, {  {1,2,3}, {1,2,3} },  { {1,2,3}, {1,2,3} } };

        int [][][] multiD32 =  {  { {1,2,3}, {1,2,3} }, {  {1,2,3}, {1,2,3} },  { {1,2,3}, {1,2,3} } };

        boolean b3 = Arrays.deepEquals(multiD3, multiD32);
        System.out.println(b3);




    }
}
