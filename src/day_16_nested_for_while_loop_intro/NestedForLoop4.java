package day_16_nested_for_while_loop_intro;

public class NestedForLoop4 {
    public static void main(String[] args) {

        for (int i=10; i>=1; i--){

            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("==============================================");
        for (int i=10; i>=0; i--){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
