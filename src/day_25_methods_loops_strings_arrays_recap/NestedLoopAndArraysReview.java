package day_25_methods_loops_strings_arrays_recap;

public class NestedLoopAndArraysReview {
    public static void main(String[] args) {

        int [] groupA = {1,2,3,4};
        int [] groupB = {5,6,7,8};
        int [] groupC = {9,10,11,12};

        int [][] allGroups = {groupA, groupB, groupC};

        int a = groupA[0] ;

        for (int i=0; i<groupA.length; i++){

            System.out.println(groupA[i]);
            int b = groupA[i];
        }

        for(int  ab : groupA){
            System.out.println(ab);
            int xyz = ab;
        }


        int n1= 1, n2 =2, n3=3, n4=4;

        int [][] numbers2 = { {1,2,3,4,5,6}, {5,4,3,33,23434,343,34,34,3}, {9898,8989,343,34,34,34,34}};

        for (int i=0; i< numbers2.length; i++){

            for (int j =0; j<numbers2[i].length; j++){

                System.out.print(numbers2[i][j]+" ");

            }
            System.out.println();

        }



    }
}
