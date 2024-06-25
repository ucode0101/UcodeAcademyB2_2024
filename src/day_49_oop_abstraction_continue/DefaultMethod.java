package day_49_oop_abstraction_continue;

public interface DefaultMethod {
    default void method1(){
        System.out.println("Default method");
    }
}

class TestDefaultMethod implements DefaultMethod{

    public void method1(){
        System.out.println("Not default method");
    }



    public static void main(String[] args) {
        TestDefaultMethod object = new TestDefaultMethod();
        object.method1();
    }

}