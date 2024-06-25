package day_19_arrays_continue;

import java.util.Arrays;

public class ArraysEquals {
    public static void main(String[] args) {

        char [] c1 = {'a','d','e','b','c'};

        char [] c2 = {'a','b','c','d','e'};


        boolean isEqual = Arrays.equals(c1,c2);
        System.out.println(isEqual);



        int [] n1 = {1,2,3,4};
        int [] n2 = {1,2,3,4};
        System.out.println(Arrays.equals(n1, n2));


    }
}
