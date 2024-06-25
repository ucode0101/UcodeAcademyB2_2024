package day_29_predicate_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethods2 {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>(Arrays.asList('a','b','a','c','a','d','e'));

        //frequency()
        int countA=0;

        for (int i=0; i< list.size(); i++){
            if (list.get(i) == 'a'){
                countA++;
            }
        }


        System.out.println(countA);

        System.out.println("============================================");

        int countAA =0;
        countAA = Collections.frequency(list, 'a'); // return type int/Integer

        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(1,11,2,33,3,33,3,3,4,4,5,1,56,1,90));
        int countOne=0;
        for (int eachNum : numList){
            if (eachNum == 4){
                countOne++;
            }
        }
        System.out.println(countOne);
        System.out.println("===========================");

        int countOneWithFrequency = 0;

        countOneWithFrequency = Collections.frequency(numList, 1);
        System.out.println(countOneWithFrequency);

        System.out.println("===========================");


        ArrayList<String> strList = new ArrayList<>(Arrays.asList("java","api","java","selenium","js"));

        int countJava = Collections.frequency(strList, "api");

        System.out.println(countJava);





    }
}
