package day_21_multi_d_array_for_each_loop;

public class ThreeDArrayNestedForEach {

    public static void main(String[] args) {

        int [][][] d3Array = { { {1,2,3}, {4,5,6} }, { {7,8,9,10}, {11,12,14} }, { {14,15,16}, {1,1,11} } };

        for (int [][] twoD : d3Array){

            for (int [] oneD : twoD ){

                for (int eachElement : oneD){

                    System.out.print(eachElement+" ");
                }
                System.out.println();

            }
            System.out.println("================");

        }

    }
}
