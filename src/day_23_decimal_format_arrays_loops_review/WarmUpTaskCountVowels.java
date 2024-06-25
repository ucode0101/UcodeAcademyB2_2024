package day_23_decimal_format_arrays_loops_review;

public class WarmUpTaskCountVowels {
    public static void main(String[] args) {
       // Task 10:
        //Write a program to count number of vowels in Three-Dimensional Array

        char[][][] chars = { { {'a','b','i','c'},{'o','i','u','y'} }, { {'a','o','y','e','t'}, {'t','i','n'} } };

        String vowels = "aeiou";
        int countVowels =0;

        // with For Each loop / Enhanced for
        for (char[][] twoD :chars){

            for (char[] oneD : twoD){

                for (char eachChar : oneD){

                    if (vowels.contains(""+ eachChar)){
                        countVowels++;
                    }


                }

            }

        }
        System.out.println("Number of vowels: "+ countVowels);

        System.out.println("===============================");

        int count =0;

        for (int i=0; i< chars.length; i++){

            for (int j=0; j< chars[i].length; j++){

                for (int k=0; k < chars[i][j].length; k++){

                    if (vowels.contains(""+ chars[i][j][k])){

                        count++;
                    }

                }

            }

        }

        System.out.println("Count of vowels: "+ count);



    }
}
