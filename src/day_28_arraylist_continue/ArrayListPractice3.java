package day_28_arraylist_continue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice3 {

    public static void main(String[] args) {




        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Sara","James","Kudrat","Mike","Jackson"));



        System.out.println(findLongestName(names));


    }

    // Write a method/program to find the longest name/string from ArrayList
    public static String findLongestName(ArrayList<String> nameList){

        String longName ="";

        for(String eachName : nameList){

            if (eachName.length() > longName.length()){

                longName = eachName;
            }
        }

        return longName;

    }

    public static String findLongestName2(ArrayList<String> names){
        String longName ="";

        for (int i=0; i< names.size(); i++){

            //String eachName = names.get(i);

            if (names.get(i).length() > longName.length()){
                //longName = eachName;
                longName = names.get(i);
            }

        }

        return longName;


    }


    public static String findLongName(String [] names){

        String longName ="";

        for (String eachName : names){

            if (eachName.length() > longName.length()){

                longName = eachName;

            }

        }
        return longName;
    }



}
