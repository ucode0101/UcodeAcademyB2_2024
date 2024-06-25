package day_39_constructor_intro;

public class MethodCalls {

    public void method1(){

        System.out.println("Method 1");
        method2();
        method3();
        //method1(); // it can call itself even though will get error in the run time
    }

    public void method2(){
        System.out.println("Method 2");
        method3();
    }

    public void method3(){
        System.out.println("Method 3");

    }


    public static void main(String[] args) {
        MethodCalls obj = new MethodCalls();
        obj.method1();

    }


}
