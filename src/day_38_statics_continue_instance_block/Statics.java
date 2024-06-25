package day_38_statics_continue_instance_block;

public class Statics {

    String name1; // instance variable, belongs to object
    static String name2; // static variable, belongs to class

    static {
        System.out.println("Hello");
        testStatic();
       // testMethod(); -> static block cannot access instance method

        name2 = "abc";
        // this.name2 ="zyx"; we cannot use 'this' keyword in static block or static method
        // name1 = "aaa"; instance variable cannot be accessed from static block directly
    }

    public static void testStatic(){
        System.out.println("Hello Static method");
    }

    public static void testStatic2(){
        testStatic();
        // testMethod(); -> static method cannot access instance method directly

        Statics s = new Statics();
        s.testMethod();


    }

    public void testMethod(){
        System.out.println("Hello instance method");

        name2 = "test"; // instance method can access static variable directly
        testStatic2(); // instance method can access static method directly


    }
    public static void main(String[] args) {

    }


}
