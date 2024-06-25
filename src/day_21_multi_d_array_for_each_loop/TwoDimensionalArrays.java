package day_21_multi_d_array_for_each_loop;

public class TwoDimensionalArrays {

    public static void main(String[] args) {
        // write a program to check if all numbers are prime in Array (one dimensional array)

        int [] nums = {3,7,5,3,11,13,19,23};

        for (int i =0; i< nums.length; i++){
            if (nums[i] < 2){
                break;
            }
            else {
                for (int j=2; j< nums[i]; j++){
                    if (nums[i] % j == 0){
                        System.out.println("It is not a prime number");
                        break;
                    }
                }
            }
            System.out.println(nums[i]+" is prime number");
        }
    }
}
