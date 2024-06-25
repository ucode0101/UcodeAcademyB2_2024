package day_46_exceptions;

public class TryCatchFinally {
    public static void main(String[] args) {

        // Using finally block with Checked/Compile-time exception
        System.out.println("Hi");
        try {
            Thread.sleep(4000);
        }
        catch (Exception e){
            System.out.println("Hello");
        }
        finally {
            System.out.println("I always run no matter what");
        }

        System.out.println("=============================================================");


        try {
            System.out.println(18 / 0);
            System.out.println("try block");
        }
        catch (Exception a){
            System.out.println("Catch block");
            a.getStackTrace();
        }
        finally {
            System.out.println("finally block always runs");
        }

    }
}
