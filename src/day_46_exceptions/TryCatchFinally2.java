package day_46_exceptions;

import java.security.spec.ECField;

public class TryCatchFinally2 {

    public static void main(String[] args) {

        String str = "java";

        // using try & catch block
        try {
            System.out.println(str.charAt(19));
        }
        catch (Exception e){
            System.out.println("Hello");
        }

        System.out.println("==============================");

        // using try & finally block
        try {
            System.out.println(str.substring(1));
        }
        finally {
            System.out.println("I always run");
        }



    }
}
