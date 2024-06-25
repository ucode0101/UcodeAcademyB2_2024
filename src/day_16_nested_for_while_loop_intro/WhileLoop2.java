package day_16_nested_for_while_loop_intro;

public class WhileLoop2 {
    public static void main(String[] args) {
        // write a program to print from 10 to 1

        int number =10;
        while (number >=1){
            System.out.println(number);
            number --;
        }

        System.out.println("==================================");

        // continue statement in while loop
        // write to print even number from 1 to 50
        int n = 1;
        while (n <=50){

            if (n % 2 !=0){
                n++;

                continue;
            }
            System.out.println(n);
            n++;
        }

        // Making infinite while loop
//        int m =10;
//        while (m >5){
//            System.out.println(m);
//        }
//        while (true){
//            System.out.println("Hello");
//        }
    }
}
