package day_17_while_and_do_while_loops;

public class NestedDoWhileLoop {
    public static void main(String[] args) {
        // print from 1 to 10 ten times using Do while with While loop

        int i=1;
        do {
            int j =1;
            while (j <=10){
                System.out.print(j);
                j++;
            }
            System.out.println();

            i++;
        } while ( i <=10);


    }
}
