package day_47_exceptions_continue;

public class CustomException4 {
    public static void main(String[] args) {

        try {
            throw new RuntimeException("Run time Exception");
        }
        catch (RuntimeException e){
            throw new IndexOutOfBoundsException("Out of bound");
        }
        finally {
            throw new NullPointerException("Null Pointer");
        }


    }
}
