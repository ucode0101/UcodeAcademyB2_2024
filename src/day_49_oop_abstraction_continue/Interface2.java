package day_49_oop_abstraction_continue;

public interface Interface2 {

    //public Interface2(){} creating Constructor is not allowed in Interface

    //public void testMethod(){} Instance method is not allowed in Interface

    // static method is allowed in Interface
    static void method3(){
        System.out.println("Static method");
    }

    // default method is allowed in Interface
    default void method4(){
        System.out.println("Default method");
    }

    // public static final by default
     int num = 190;

    public static void main(String[] args) {

        System.out.println("Hello there ");

        // directly or through the interface
        System.out.println(num);
        System.out.println(Interface2.num);

        // accessing static method directly or through the interface
        method3();
        Interface2.method3();



    }

}
