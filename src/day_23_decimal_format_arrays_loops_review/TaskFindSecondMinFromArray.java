package day_23_decimal_format_arrays_loops_review;

public class TaskFindSecondMinFromArray {

    public static void main(String[] args) {

        // Task 5:
        //Write a program to find second min number from array
        //don't use Arrays.sort() method

        int [] nums = { -12, -2, 11, -9, 3,5,7,1,8,9,33,65,2,11,243};

//        int min1 = nums[0];
//        int min2 = nums[0];

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i=0; i< nums.length; i++){

            if (nums[i] < min1){
                min2 = min1;
                min1 = nums[i];

            }
            else if (nums[i] < min2 && nums[i] !=min1){
                min2 = nums[i];
            }

        }

        System.out.println(min2);



    }
}
