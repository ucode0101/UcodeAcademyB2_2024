package day_16_nested_for_while_loop_intro;

public class NestedForLoop {
    public static void main(String[] args) {

        // print from 1 to 10
//        for (int i=1; i<=10; i++){
//            System.out.println(i);
//        }
        System.out.println("=============================");
        // print from 1 to 10, five times

        for (int i=1; i<=5; i++){ // is 2 < 10 == true

            for (int j=1; j<=10; j++){ // starts running from 1 to 10
                System.out.println(j);
            }

        }

    }
}
