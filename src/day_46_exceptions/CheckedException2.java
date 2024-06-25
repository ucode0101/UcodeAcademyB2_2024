package day_46_exceptions;

public class CheckedException2 {

    public static void main(String[] args) {

        System.out.println("Hello");

       try {
           Thread.sleep(5000);
       }
       catch (InterruptedException abc){

           abc.getStackTrace();
       }

        System.out.println("Hello again in 5 seconds");

       try {
           Thread.sleep(5000);
       } catch (InterruptedException abc){
           abc.getStackTrace();
       }

        System.out.println("Hello again in 5 seconds");
    }
}
