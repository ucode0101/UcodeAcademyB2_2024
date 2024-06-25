package day_21_multi_d_array_for_each_loop;

public class ForEachLoop {
    public static void main(String[] args) {
        int [] arr = { 1,2,3,4,5,6};
        for (int i =0; i < arr.length; i++) {

            System.out.print(arr[i]+" ");
        }

        System.out.println("\n==================================");

        for (int each : arr){
            System.out.print(each+" ");

        }

        System.out.println("\n===================================");

        char[] chars = {'a','b','c','d'};

        for (int i=0; i< chars.length; i++){

            System.out.print(chars[i]+" ");

        }

        System.out.println("\n======================================");

        for (char ch : chars){

            System.out.print(ch+" ");
        }

        System.out.println("\n==========================================");






    }
}
