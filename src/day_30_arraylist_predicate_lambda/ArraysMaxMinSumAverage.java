package day_30_arraylist_predicate_lambda;

import java.util.Arrays;

public class ArraysMaxMinSumAverage {

    public static void main(String[] args) {
        // Find max number from in Array
        int [] num1 = {1,12,9,2,25,88,3,4,5,6};

        int max = num1[0];
        int min = num1[0];
        for (int eachNum : num1){
            if (eachNum >  max ){
                max = eachNum;
            }
            if (eachNum < min){
                min = eachNum;
            }
        }
        System.out.println(max);
        System.out.println(min);

        // find max, min, sum, average numbers using Stream API/ Java Stream
        int max2 = Arrays.stream(num1).max().getAsInt();
        int min2 = Arrays.stream(num1).min().getAsInt();
        int sum = Arrays.stream(num1).sum();
        double average = Arrays.stream(num1).average().getAsDouble();

        System.out.println("=================================");
        System.out.println(max2);
        System.out.println(min2);


    }

}
