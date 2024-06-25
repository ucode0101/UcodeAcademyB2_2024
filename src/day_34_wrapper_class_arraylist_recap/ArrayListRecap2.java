package day_34_wrapper_class_arraylist_recap;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRecap2 {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};

        ArrayList<Character> ch = new ArrayList<>();

        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(nums);

        //nums.addAll(Arrays.asList(arr)); we cannot


        System.out.println(nums.get(4));

        for (int i=0; i< nums.size(); i++){
            System.out.println(nums.get(i));
        }

        System.out.println("===========================");
        for (int j : nums){
            System.out.println(j);
        }












    }
}
