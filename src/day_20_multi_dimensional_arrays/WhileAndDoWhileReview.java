package day_20_multi_dimensional_arrays;

public class WhileAndDoWhileReview {

    public static void main(String[] args) {

        int x = 10;

        // the statement/code inside while loop will run as long as the condition is true
        // first it checks the condition, if the condition is true the code will run
        while ( x < 10){
            System.out.println("Hello");
            x++;
        }

        System.out.println("=======================================");
        // do while loop runs the code/statement first only once and then checks the condition
        // if the condition is ture it keeps running until the condition is false
        // do while loop is guaranteed to run the code/statement at least once even if the condition is false
        do {
            System.out.println("Hello");
            x++;
        } while ( x < 10);



    }
}
