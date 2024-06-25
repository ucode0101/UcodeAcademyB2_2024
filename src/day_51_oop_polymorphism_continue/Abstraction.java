package day_51_oop_polymorphism_continue;

abstract public class Abstraction {


    public abstract void doMath(int a, int b);

    public void method1(){
        System.out.println("Method1");
    }

}

class TestClass extends Abstraction{

    public void doMath(int a, int b){
        System.out.println(a * b);
    }

    public static void main(String[] args) {
        TestClass obj = new TestClass();
        obj.doMath(4,4);
    }

}