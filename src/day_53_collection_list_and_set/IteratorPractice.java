package day_53_collection_list_and_set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorPractice {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(11,9,3,98,20,5,1));
        // remove numbers that are less than 10


//        for (Integer each : nums){
//            if (each< 10){
//                nums.remove(each);
//            }
//        }

        // this works
//        for (int i=0; i< nums.size(); i++){
//            if (nums.get(i) < 10){
//                nums.remove(nums.get(i));
//               i--;
//            }
//        }

        Iterator<Integer> iterator = nums.iterator();

        // this works
        while (iterator.hasNext()){

            Integer x = iterator.next();
            if (x < 10){
                iterator.remove();;
            }
        }

        System.out.println(nums);

    }
}
