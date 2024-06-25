package day_21_multi_d_array_for_each_loop;

public class NestedForAndForEachLoop {
    public static void main(String[] args) {

        // write a program to reverse each word in String Array
        // Reverse each Element in place in String Array

        String [] array = {"java", "api","selenium"};

        for (String each : array){

            for (int i=each.length()-1; i>=0; i--){
                System.out.print(each.charAt(i));
            }
            System.out.println();

        }



    }
}
