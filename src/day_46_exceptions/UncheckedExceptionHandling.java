package day_46_exceptions;

public class UncheckedExceptionHandling {

    public static void main(String[] args)  {

        int a = 10;
        int b = 0;

        try {
            System.out.println(a / b);
            System.out.println("Hi there");
        }
        catch (ArithmeticException e){

            System.out.println("Hello there");
            e.getCause();
        }

        System.out.println("=================================");

        String str = "java";

        try {
            System.out.println(str.charAt(10));
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("you gave higher index");
        }

        System.out.println("=================================");

        String s = "test";

       try {
           System.out.println(s.substring(9));
           if (true){
               System.out.println("");
           }
       }
       catch (Exception abc){
           System.out.println("You gave high index for substring");
       }
    }
}
