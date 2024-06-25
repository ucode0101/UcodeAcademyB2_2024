package day_38_statics_continue_instance_block;

public class RecursiveMethod2 {
    public static void main(String[] args) {

        // write a method to print from 1 to given number
        printOneToNum(10);
        printOneToX(10);

    }

    public static void printOneToNum(int num){
        for (int i=1; i<=num; i++){
            System.out.print(i);
        }
    }

    public static void printOneToX(int num){
       if (num >= 1){
           printOneToX(num -1);
           System.out.print(num);
       }
       else {
           System.out.println(num);
       }

    }
}
