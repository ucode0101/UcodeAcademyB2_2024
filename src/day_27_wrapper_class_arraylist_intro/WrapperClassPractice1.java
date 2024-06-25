package day_27_wrapper_class_arraylist_intro;

import java.util.Arrays;

public class WrapperClassPractice1 {

    public static void main(String[] args) {


        int intNum = 122;
        Integer numInteger = intNum; // Autoboxing

        int num2 = numInteger; // Unboxing



        int [] arr1 = {1,2,3,4,5}; // This array is holding primitive data type

        Integer [] arr2 = {3,4,5,6,7}; // This array is holding object/non-primitive data type

        int [] arr3 = arr1; // We are assigning primitive to primitive

        int [] arr4 = new int[arr2.length]; // We cannot assign Object/non-primitive array to primitive array


        for (int i=0; i< arr4.length; i++){
            arr4[i] = arr2[i];
        }

        System.out.println(Arrays.toString(arr4));




    }


}
