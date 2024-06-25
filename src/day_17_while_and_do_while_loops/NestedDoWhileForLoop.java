package day_17_while_and_do_while_loops;

public class NestedDoWhileForLoop {
    public static void main(String[] args) {
        // print 1 to 10 ten times using nested do while with for loop

        int i =1;
        do {
            for (int j=1; j<=10; j++){
                System.out.print(j);
            }
            System.out.println();
            i++;
        } while (i <=10);
    }
}
