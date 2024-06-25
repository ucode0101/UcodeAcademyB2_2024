package day_46_exceptions;

public class WaitClass {

    public static void wait1(long waitTime){

        try {
            Thread.sleep(waitTime);
        }
        catch (Exception e){
            e.getStackTrace();
        }
    }

    public static void wait2(long waitTime) throws Exception{
        Thread.sleep(waitTime);
    }
}
