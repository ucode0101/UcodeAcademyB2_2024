package day_48_oop_abstraction;

public class ExceptionReview2 {

    public static void main(String[] args) {
        String str = "selenium";

      try {
          System.out.println(str.charAt(17));
      } catch (Exception e){

          System.out.println("Index is out or range:");
          System.out.println("Try lower index in the next try block");

          try {
              System.out.println(str.charAt(4));
          } catch (Exception a){

              System.out.println("Try lower number again");
          }
      }
      finally {
          System.out.println("I always run");
      }
    }

}
