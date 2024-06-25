package day_28_arraylist_continue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice5 {

    public static void main(String[] args) {

        // write a program to replace all odd number with 1 and all even numbers with 2 in ArrayList


        int [] num1 = {11,3,5,22,4,6,10,15,90,75};

        for (int i=0; i< num1.length; i++){
            int x = num1[i];

            if (x % 2 !=0){
                num1[i]=1;
            }
            else {
                num1[i] = 2;
            }
        }

        System.out.println(Arrays.toString(num1));
        System.out.println("=================================");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(13,22,15,76,4,65,45,99,100,19));

        for (int i=0; i< list.size(); i++){
            int x = list.get(i);

            if (x % 2 !=0){

                list.set(i, 1);

            }
            else {
                list.set(i, 2);
            }
        }
        System.out.println(list);

    }


}
