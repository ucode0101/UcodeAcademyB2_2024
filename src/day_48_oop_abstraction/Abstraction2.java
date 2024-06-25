package day_48_oop_abstraction;

abstract public class Abstraction2 {

    // Abstract clas can have everything that a concrete/regular can have plus abstract method
    public void sayHi(){
        System.out.println("Hi");
    }

    abstract protected void test();

    private int ssn;
    private String str;
    protected long number;

    public static void method1(){
        System.out.println("Hello 123");
    }

    static {

        System.out.println("Static block");
    }

    public static void main(String[] args) {

        System.out.println("Hello ");

    }

}
