package day_38_statics_continue_instance_block;

public class RecursiveMethod1 {
    public static void main(String[] args) {
        // Factorial number is multiplication of positive number
        // 5 -> 120; 5*4*3*2*1

        int result = 1;
        int num = 5;

        while( num >=1){

            result *= num;
            num --;
        }
        System.out.println(result);
        System.out.println(factorial(7));
    }

    public static int factorial(int num){

        if (num <=2){
            return num;
        }

        return num * factorial(num - 1);
    }

}
