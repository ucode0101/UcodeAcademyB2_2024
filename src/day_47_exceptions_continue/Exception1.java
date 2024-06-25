package day_47_exceptions_continue;

import java.util.ArrayList;
import java.util.Arrays;

public class Exception1 {
    public static void main(String[] args)  {

        // Handling checked exception

        //Thread.sleep(3000); throws InterruptedException

        System.out.println("Hello");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.getStackTrace();
            System.out.println("some message");
        }

        System.out.println("Hello again");

        System.out.println("======================================");

        int [] arr = {1,2,3,4,5};
        String str = "test";
        ArrayList<String> list = new ArrayList<>(Arrays.asList("test","abc"));


        // handling unchecked exception

        try {
            System.out.println(arr[10]);
        } catch (Exception e){
            e.getStackTrace();
            System.out.println("The index is out of bound");
        }

        System.out.println("===========================");

        try {
            System.out.println(str.charAt(11));
        } catch (IndexOutOfBoundsException abc){
            abc.getStackTrace();
            System.out.println("Index is out of bound for charAt");
        }

        // using multiple catch blocks

        try {
            System.out.println(5/0);
        } catch (IndexOutOfBoundsException e){
            e.getStackTrace();
        }
        catch (ClassCastException  b){
            b.getStackTrace();
        }
        catch (ArithmeticException e){
            e.getStackTrace();
        }
        catch (Exception e){
            e.getStackTrace();
        }

    }
}
