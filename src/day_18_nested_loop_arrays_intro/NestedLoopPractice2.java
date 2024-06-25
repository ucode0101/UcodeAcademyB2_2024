package day_18_nested_loop_arrays_intro;

public class NestedLoopPractice2 {
    public static void main(String[] args) {

        // while with for loop
        int i =0;
        while (i <5){


            for (int j =0; j<5; j++){

                System.out.println("Hello");
            }
            i++;

        }

        System.out.println("==============while with do while loop===============");

        int x =0;
        while ( x <5){

            int y=0;
            do {
                System.out.println("Hello");
                y++;
            } while (y <5);
            x++;
        }


    }
}
