package day_47_exceptions_continue;

public class Exception2 {

    public static void wait3Seconds() throws Exception{
        Thread.sleep(3000);
    }

    public static void wait4Seconds(){
        try {
            Thread.sleep(4000);
        } catch (Exception e){
            e.getStackTrace();
            System.out.println("Hello");
        }
    }


    public static void main(String[] args) {

        System.out.println("Hello");
        //wait3Seconds(); // we need to handle exception in this because we used 'throws' in the methods
        wait4Seconds(); // we don't to
        System.out.println("Hello 2");
    }
}
