package day_46_exceptions;

public class MultipleCatchBlocks {

    public static void main(String[] args) {

        try {
            System.out.println(5/0);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Hello 1");
        }
        catch (ArithmeticException ab){
            System.out.println("Hello 2");
        }
        catch (Exception abc){
            System.out.println("Hello 3");
        }

        System.out.println("=================================");

        try {
            System.out.println(5/0);
            System.out.println("Hello 0");
        }
        catch (Exception ab){ // after this, we can have any other exception that inherits this one
            System.out.println("Hello 1");
        }
//        catch (ArithmeticException e){
//
//        }



    }
}
