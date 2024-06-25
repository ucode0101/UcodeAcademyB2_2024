package day_21_multi_d_array_for_each_loop;

public class TwoDArrayNestedForEachLoop {
    public static void main(String[] args) {

        int [] arr = {33,1,11,65,4,33,89};

        for (int each : arr){

            for (int num : arr){
                System.out.print(num+" ");
            }
            System.out.println();

        }
        System.out.println("================================================");


        int [][] arr2 = { {1,2,3,4}, {5,6,7,8,9} };

        for (int [] eachArray : arr2){

            for (int eachElement : eachArray){
                System.out.print(eachElement+" ");
            }
            System.out.println();


        }


    }
}
