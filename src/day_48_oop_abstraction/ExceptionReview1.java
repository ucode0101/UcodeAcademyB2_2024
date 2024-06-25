package day_48_oop_abstraction;

public class ExceptionReview1 {



    public static void main(String[] args) throws Exception {

        // if you use 'throws' keyword in the method signature, you only use it once
        System.out.println("Hello");
        Thread.sleep(2000);
        System.out.println("Hello2");
        Thread.sleep(2000);

        // if you want to use try catch block, you need to use for every exception
//        try{
//            Thread.sleep(2000);
//        } catch (Exception e){
//            System.out.println("Hello");
//        }
//
//        System.out.println("Hello again");
//
//       try {
//           Thread.sleep(2000);
//       } catch (Exception e){
//           System.out.println("Hi there");
//       }

       // customWait(2000);


    }

    public static void customWait(long waitTime){

        try {
            Thread.sleep(waitTime);
        } catch (Exception e){
            System.out.println("Hello");
        }
    }

}


class TestClass{

    public static void main(String[] args){
        System.out.println("Hello there");

        ExceptionReview1.customWait(200);
    }
}