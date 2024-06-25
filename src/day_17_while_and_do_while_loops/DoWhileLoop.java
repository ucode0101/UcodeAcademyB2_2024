package day_17_while_and_do_while_loops;

public class DoWhileLoop {
    public static void main(String[] args) {

        int i=2;
        // it goes inside the body if the condition is true
        while ( i >=5 ){
            System.out.println("Hello");
            i++;
        }

        // it goes inside the body if the condition is true
        for (int j=2; j>=5; j++){
            System.out.println("Hello");
        }

        int num = 2;

        // the code inside the body of the do-while loop
        // gets executed first and then the condition is checked
        // Even if the condition is false, the statement gets execute once
        do{
            System.out.println("Hello");
            num++;
        } while (num >=5);

    }
}
