package day_46_exceptions;

public class CheckedException1 {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello");

        Thread.sleep(5000); // Used to stop/sleep/ the code from executing for the given time

        System.out.println("Hello again in 5 second");

        Thread.sleep(5000);

        System.out.println("Hello again in 5 second");


    }
}
