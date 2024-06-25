package day_30_arraylist_predicate_lambda;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {

    public static void main(String[] args) {

        // Write a program to find the longest word from ArrayList
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Java","API","Selenium","JUnit","TestNG"));

        // Write a program to check if a number is even or odd
        // If a number is even multiply it by 2, if it is odd multiply it by 3
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(12,3,2,5,7,8,9,11,54,22));

        for (int i=0; i< numList.size(); i++){

            if (numList.get(i) % 2 == 0){

               // int byTwo = numList.get(i) * 2;
               // numList.set(i, byTwo);
                numList.set(i, numList.get(i) * 2);

            }
            else {
                int byThree = numList.get(i) * 3;
                numList.set(i, byThree);
            }

        }
        System.out.println(numList);

        System.out.println("=====================================");

        // Write a program to move all Zeros to the end in Array & ArrayList

        int [] arr = {0,2,0,5,6,0,6,0,0,1,2,2};

        int [] res = new int[arr.length];

        // add any number greater than 0, the remain elements will be zero by default
        int index =0;
        // This is not an officiant sine we are not moving any zeros
        for (int i=0; i<arr.length; i++ ){
            if (arr[i] > 0){
                res[index] = arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(res));

        System.out.println("============================================");
        // Write a program to move all Zeros to the end in Array & ArrayList
        // {0,2,0,5,6,0,6,0,0,1,2,2};
        for (int i=0; i< arr.length; i++){  //

            for (int j =i; j< arr.length; j++){
                if (arr[i] == 0){

                    int zero = arr[i]; // 0 temp
                    arr[i] = arr[j]; // 2
                    arr[j]= zero; // 0
                }


            }
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("===============================================");

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(0,2,0,5,6,0,6,0,0,1,2,2));

        for (int i=0; i< list2.size(); i++){

            for (int j = i; j< list2.size(); j++){

                if (list2.get(i) ==0 ){ // == 0 and equals() will work
                     int zero = list2.get(i);

                     list2.set(i, list2.get(j));

                     list2.set(j, zero);


                }

            }

        }
        System.out.println(list2);










    }
}
