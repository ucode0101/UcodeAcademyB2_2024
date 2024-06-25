package day_15_for_loop_continue;

import java.util.Scanner;

public class WarmUpTask7 {
    public static void main(String[] args) {
        //Task 7:
    //Write a program to take String input from the user and count the number of vowels
    //(a, e, i, o, u) in it using for loop and the charAt() method.
    //Hint: create one String variable and store all vowels in it, and use contains() method to check if it contains.
    //Or you can use logical OR (||) to check

        System.out.println("Please enter a word or sentence");
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();
        String vowels = "aeiou";
        int countVowels =0;

        for (int i=0; i<= word.length()-1; i++){  // i< word.length() means -> i<= word.length()-1

            // one way
//            if (vowels.contains(""+word.charAt(i))){
//               // countVowels ++;
//                countVowels +=1;
//            }
            //another
//            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) =='o' || word.charAt(i) == 'u'){
//                countVowels ++;
//            }
            // another way
            String temp = word.substring(i,i+1);
            if (vowels.contains(temp)){
                countVowels ++;
            }


        }

        System.out.println("count of vowels: "+ countVowels);
        //System.out.println(word.length());




    }
}
