package day_21_multi_d_array_for_each_loop;

public class WarmUpTask2 {
    public static void main(String[] args) {
        // Task 1:
        //Write a program to find the longest and the shortest word from a sentence

        String str = "java is fun but not always";

        String [] array = str.split(" ");

        String longestWord =array[0];
        String shortestWord =array[0];

        for (int i =0; i< array.length; i++){

            String temp = array[i];
            if (temp.length() > longestWord.length()){
                longestWord = temp;
            }
            if (temp.length() < shortestWord.length()){
                shortestWord = temp;
            }

        }
        System.out.println("Shortest: "+ shortestWord);
        System.out.println("Longest: "+ longestWord);

        System.out.println("=======================================");


        String sWord = str.split(" ")[0];
        String lWord = str.split(" ")[0];

        for (int i=0; i< str.split(" ").length; i++){
            String temp = str.split(" ")[i];

            if (temp.length()< sWord.length()){
                sWord = temp;

            }
            if (temp.length() > longestWord.length()){
                lWord = temp;
            }
        }

        System.out.println(sWord);
        System.out.println(lWord);






    }
}
