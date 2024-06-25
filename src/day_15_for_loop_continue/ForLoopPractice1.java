package day_15_for_loop_continue;

public class ForLoopPractice1 {
    public static void main(String[] args) {
        // print from 1 to 10 using for loop
        for (int i=1; i<=10; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("============================");
        // print from 10 to 1 using for loop
        for (int i=10; i>=1; i--){
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("===============================");
        // print 'a' to 'z' using for loop
        for (char ch = 'a'; ch<='z'; ch++){
            System.out.print(ch+" ");
        }
        System.out.println();

        System.out.println("=====================================");

        // print 'z' to 'z' using for loop
        for (char ch ='z'; ch>='a'; ch --){
            System.out.print(ch+" ");
        }
    }
}
