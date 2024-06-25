package day_14_string_methods_and_for_loop;

public class ForLoopPractice1 {
    public static void main(String[] args) {
        // write a program to print even numbers between 1 and 40



        for (int number = 1; number<=40; number++){

            if (number % 2 ==0){
                System.out.println("Even number: "+ number);
            }

        }
        System.out.println("====================Print odd number===========================");

        for (int number =1; number<=40; number++){
            if (number % 2 !=0){
                System.out.println("Odd number: "+number);
            }
        }

        System.out.println("================================");
        // print all even numbers by updating the number by 2
        for (int number =2; number<=40; number+=2){
            System.out.println("Even: "+number);
        }

        System.out.println("====================================");

        // print all odd numbers by updating the number by 2

        for (int number =1; number <=40; number +=2){
            System.out.println("Odd: "+number);
        }

    }
}
