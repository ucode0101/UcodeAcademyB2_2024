package day_17_while_and_do_while_loops;

public class NestedWhileLoop {

    public static void main(String[] args) {


        // print from 1 to 10 ten times using while

        int i =1;


        while (i <=10){
            int j = 1;
            while (j <=10){
                System.out.println(j);
                j++;
            }
            i++;
            //System.out.println();
        }

    }

}
