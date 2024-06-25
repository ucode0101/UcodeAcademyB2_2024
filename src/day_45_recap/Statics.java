package day_45_recap;

public class Statics {
    public static String name = "Java";
    public String name2 = "Java";
    public static int number ;

    static {
        number = 400; // can access static variable directly
        // name2 = "test"; cannot access instance variable

        method1();
        method2(10);
        //method3()  static block or method cannot call instance method
    }

    public static void method1(){
        System.out.println("Method 1");
        ///method3(); // static block or method cannot call instance method
    }

    public static int method2(int number){

        return number;
    }

    public void method3(){
        System.out.println("Method 3");

        method1();  // instance method can call static method directly
        name = "Selenium"; // instance method can access static variable directly
    }






}
