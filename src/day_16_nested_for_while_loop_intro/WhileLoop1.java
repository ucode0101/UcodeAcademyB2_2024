package day_16_nested_for_while_loop_intro;

public class WhileLoop1 {
    public static void main(String[] args) {

        // print 1 to 5 using for loop
        for (int i=1; i<=5; i++){
            System.out.print(i);
        }
        System.out.println();
        System.out.println("=======================");

        // print 1 to 5 using while loop
        int number =1;
        while (number <=5){
            System.out.print(number);
            number ++;
        }
    }
}
