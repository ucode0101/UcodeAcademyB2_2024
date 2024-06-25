package day_21_multi_d_array_for_each_loop;

public class Task2WithForEachLoop {
    public static void main(String[] args) {
        // Task 1:
        //Write a program to find the longest and the shortest word from a sentence

        String str = "java is fun but not always";

        String [] arr = str.split(" ");

        String longest = arr[0];
        String shortest = arr[0];

        for (String eachWord : arr){

            if (eachWord.length() > longest.length()){
                longest = eachWord;
            }
            if (eachWord.length() < shortest.length()){
                shortest = eachWord;
            }

        }
        System.out.println("longest: "+longest);
        System.out.println("shortest: "+shortest);

        System.out.println("======================================");

        // write a program to print each word from sentence
        String sentence = "Java and selenium is best for automation";

        for (String eachWord : sentence.split(" ")){

            System.out.println(eachWord);
        }

        System.out.println("=====================================");








    }
}
