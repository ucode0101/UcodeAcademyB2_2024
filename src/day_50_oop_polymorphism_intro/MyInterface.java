package day_50_oop_polymorphism_intro;

public interface MyInterface {

    public default void test(){
        System.out.println("Default method");
    }


}

class ClassA implements MyInterface{

    String nameA = "javaA";


}

class ClassB implements MyInterface{
    String nameB = "JavaB";

}

class TestClass{
    public static void main(String[] args) {

        // Normal object creation
        ClassA a = new ClassA();
        ClassB b = new ClassB();

        // Using Interface as a reference type to refer to child class's object
        // Polymorphism happening here

        MyInterface a1 = new ClassA();  // Polymorphism happening here
        MyInterface b1 = new ClassB();  // Polymorphism happening here

        System.out.println(a.nameA);
        //System.out.println(a1.nameA);
        a.test();
        a1.test();

        // Using parent class's reference to refer to child class's object
        Object obj1 = new ClassA(); // Polymorphism happening here
        Object obj2 = new ClassB(); // Polymorphism happening here



    }
}