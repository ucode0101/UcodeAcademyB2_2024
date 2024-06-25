package day_39_constructor_intro;

public class ConstructorCalls2 {

    // Instance method, Not a constructor
    public void method1(){
        //this("java"); methods cannot call constructor
        System.out.println("Hello method 1");
    }

    public void method2(int num){
        System.out.println("Hello method 2");
    }
    public static void method3(){

        System.out.println("Hello method 3");
    }

    public ConstructorCalls2(){

        this("Hello Constructor");
        method1();
        method2(10);
        method3();
    }

    public ConstructorCalls2(String str){
        method1();
        System.out.println(str);
    }

    public static void main(String[] args) {
        ConstructorCalls2 object = new ConstructorCalls2("java");
    }
}
