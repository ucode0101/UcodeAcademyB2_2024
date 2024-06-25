package day_20_multi_dimensional_arrays;

import java.util.Arrays;

public class WarmUpTask {

    public static void main(String[] args) {
        //1: Find average number from int array
        // [10,2,4,2,2] -> average number is 4

        int [] arr = {20, 33, 10, 32, 20, 20, 98, 15};
        int sum =0;
        for (int i=0; i< arr.length; i++){

            sum += arr[i];
        }

        int average = sum / arr.length;
        System.out.println("The sum is: "+ sum);
        System.out.println("Average number is: "+ average);

        System.out.println("=====================================");

        //2: Reverse each word in String Array / Reverse each word in place in Arrays
        // ["java", "api"] -> ["avaj","ipa"]

        String [] str = {"java","api","testng","jenkins","selenium"};
        System.out.println("Original: "+ Arrays.toString(str));

        for (int i=0; i< str.length; i++){
            String temp = str[i];
            String reverse ="";

            for (int j= temp.length()-1; j>=0; j--){
                reverse +=""+ temp.charAt(j);

            }
            str[i] = reverse;

        }
        System.out.println("Reversed: "+ Arrays.toString(str));

    }
}
