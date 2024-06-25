package day_16_nested_for_while_loop_intro;

public class NestedForLoop2 {
    public static void main(String[] args) {

        // print stars(*) using nested for loop
        for (int i=1; i<10; i++){

           for (int j=1; j<=10; j++){
               System.out.print("* ");
           }
            System.out.println();

        }

        System.out.println("==============================\n");

        // write a program to reverse a string

        String str = "java";
        for (int i = str.length()-1; i >=0; i--){
            System.out.print(str.charAt(i));
        }

        System.out.println("===============================");

        // write a program to reverse a string 5 times
        // outer loop here tells the inner loop how many times to run
        for (int i=1; i<=5; i++){

            for (int j = str.length()-1; j>=0; j--){
                System.out.print(str.charAt(j));
            }
            System.out.println();


        }
    }
}
