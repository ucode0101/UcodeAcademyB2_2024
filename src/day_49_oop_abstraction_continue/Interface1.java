package day_49_oop_abstraction_continue;

public interface Interface1 {

    // public & abstract are given by default
      void sayHello();

     // public access modifier is given by default, static method must have body
     static void staticMethod(){
         System.out.println("static method in interface");
     }

     default void defaultMethod(){
         System.out.println("default method in interface");
     }

     //  public static final -> are given by default, you don't have to provide
      String name = "java";

    //  public static final -> are given by default, you don't have to provide
     int num = 211;


}

class TestInterface implements Interface1{
    public void sayHello(){
        System.out.println("Hello, hi, how are you ?");
    }

    public static void main(String[] args) {
        TestInterface object = new TestInterface();

        object.sayHello();
        System.out.println(name); // it can be printed directly, because it is static
        System.out.println(num); // it can be printed directly, because it is static

        // calling static method and variable from/through interface
        Interface1.staticMethod();
        System.out.println(Interface1.name);
        System.out.println(Interface1.num);
    }

}