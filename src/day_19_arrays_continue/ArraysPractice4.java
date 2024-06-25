package day_19_arrays_continue;

public class ArraysPractice4 {
    public static void main(String[] args) {


        int [] numbers = {12,5,7,21,33,44,2,1,5,7};
        // Loop through numbers Array and print numbers that are greater than 6

        for (int i=0; i<=numbers.length-1; i++){
            // one way
//            int x = numbers[i];
//
//            if (x > 6 ){
//                System.out.println(x);
//            }
            if (numbers[i] > 6){
                System.out.println(numbers[i]);
            }

        }



    }
}
