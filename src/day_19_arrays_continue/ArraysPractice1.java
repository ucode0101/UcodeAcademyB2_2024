package day_19_arrays_continue;

import java.util.Arrays;

public class ArraysPractice1 {
    public static void main(String[] args) {
        // declare and instantiate Array with length of 5
        int [] nums = new int[5];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 35;
        nums[3] = 33;

        int x = nums[0];

        System.out.println(x);

        int y = nums[2];
        System.out.println(y);

        int len = nums.length;
        System.out.println(len);

        // get the element/value from nums array

        int lastElm = nums[nums.length-1];
        System.out.println(lastElm);

        System.out.println("=====================================");

        int [] nums2 = {30, 40, 50,60,70};
        System.out.println(nums2.length);

        System.out.println(nums2[2]);



        nums2[2] = 99;

        System.out.println(nums2[2]);

        // printing nums2 directly
        System.out.println(Arrays.toString(nums2));





















    }
}
