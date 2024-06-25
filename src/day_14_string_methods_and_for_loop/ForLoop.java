package day_14_string_methods_and_for_loop;

public class ForLoop {
    public static void main(String[] args) {


        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);

        System.out.println("=============================");

        for (int number = 1; number <=5; number ++){

            System.out.println(number);
        }

        System.out.println("===================================");
        // print "Hello" 15 times
       for (int i =1; i<=15; i++){
           System.out.println(i +": Hello");
       }

        System.out.println("================================");
       // infinite loop
//       for (int i=1; i>0; i++){
//           System.out.println("I am infinite loop");
//       }

        // write a for to multiply the number by itself
        for (int i= 1; i<=10; i++){
            System.out.println(i * i);
        }
        System.out.println("===========================================");

        // write a program to print each character from String one by one

        String str ="write a program to print";

        int index =0;

        System.out.println(str.charAt(index));
        index++;

        System.out.println(str.charAt(index));

        index++;
        System.out.println(str.charAt(index));

        System.out.println("==================================");


        for (int i =0;i <=str.length()-1; i++){
            System.out.println(str.charAt(i)); // i =
        }



    }
}
