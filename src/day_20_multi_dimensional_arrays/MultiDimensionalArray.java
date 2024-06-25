package day_20_multi_dimensional_arrays;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        int[][] twoDArray = new int[3][4];


        // adding value/element to 2D arrays
        twoDArray[0][0] = 1;
        twoDArray[0][1] = 2;
        twoDArray[0][2] = 3;
        twoDArray[0][3] = 4;


        twoDArray[1][0] = 10;
        twoDArray[1][1] = 20;
        twoDArray[1][2] = 30;
        twoDArray[1][3] = 40;

        twoDArray[2][0] = 100;
        twoDArray[2][1] = 200;
        twoDArray[2][2] = 300;
        twoDArray[2][3] = 400;

        // Accessing Element from 2D Arrays
        // Access/get first element/value from first Arrays
        int num = twoDArray[0][0];

        System.out.println(num);

        // second element from third Array
        int n2 = twoDArray[2][1];

        System.out.println(n2);

        // assign a new value to the second Array third element
        twoDArray[1][2] = 99;

        System.out.println(twoDArray[1][2]);

        System.out.println("===========================================");

        // Create new Arrays, and add them directly to Multidimensional Arrays
        char [] c1 = {'a','b','c','x'};
        char [] c2 = {'d','e','f','y'};
        char [] c3 = {'g','h','i','g'};
        char [] c4 = {'g','h','i','g'};

        char [][] chars = new char[3][4];
        chars[0] = c1;
        chars[1] = c2;
        chars[2] = c3;


        // print the first array from Multidimensional Arrays
        System.out.println(Arrays.toString(chars[0]));

        // print multidimensional array
        System.out.println(Arrays.deepToString(chars));

        // get the length of multidimensional arrays
        // check how many arrays chars array has in it
        int len = chars.length;

        // find the length of first array in multidimensional array
        int len2 = chars[0].length;

        System.out.println("Length of multidimensional array: "+ len); // what is the length ?
        System.out.println("Length of first array in multidimensional array: "+ len2);













    }
}
