package office_hours.day_01_java_reveiw;

public class Task4 {
    public static void main(String[] args) {
        // Remainder / Modulus review

        // Any number that is evenly divisible by 2 is even number

        int num1 = 36;


        if (num1 % 2 == 0){ // to check if the number is even
            System.out.println(num1 + " is even number");
        }
        if (num1 % 2 !=0){ // to check if the number is odd
            System.out.println(num1 + " is not even number");
        }

        // we can also check if a number is evenly divisible by another number
        int num2 = 68;

        System.out.println(num2 % 2);

        System.out.println("============================");

        // write a program to check if a number is evenly divisible by 3 and 5

        int num3 = 15;

        if (num3 % 3 == 0 && num3 % 5 ==0){
            System.out.println(num3+" is evenly divisible by 3 and 5");
        }



    }
}
