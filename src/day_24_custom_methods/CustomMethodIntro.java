package day_24_custom_methods;

public class CustomMethodIntro {

    public static void main(String[] args) {

        // write a program to print "hello" 10 times
//       for (int i=1; i<=10;i++){
//           System.out.println("Hello");
//       }

        // calling our own custom method
        sayHelloTenTimes();

        System.out.println("=============================");
        sayHelloTenTimes();

        System.out.println("==============================");
        sayHelloTenTimes();

        System.out.println("===============================");

        sayHello();

    }

    // we created our own custom method so can reuse it as much as we want
    public static void sayHelloTenTimes(){

        for (int i=1; i<=10; i++){
            System.out.println(i+ " Hello");
        }

    }

    // we created our own method that prints "Hello"

    public static void sayHello(){
        System.out.println("Hello");
    }


}
