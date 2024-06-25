package day_16_nested_for_while_loop_intro;

public class NestedForLoop3 {
    public static void main(String[] args) {

        /*
           *
           **
           ***
           ****
         */

        for (int i=1; i<=10; i++){ // 2 <=10 == tru

            for (int j=1; j<=i; j++){ // j is 1, i is 2, j<=i == true
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("====================================");
        // 1
        // 12
        // 123
        // 1234
        for (int i=1; i<=10; i++){

            for (int j=1; j<=i; j++){
                System.out.print(j);
            }

            System.out.println();
        }

        System.out.println("====================================");
        for (char a='a'; a<='z'; a++){
            for (char b ='a'; b <=a; b++){
                System.out.print(b);
            }
            System.out.println();
        }


    }
}
