package day_37_statics_and_static_block;

public class StaticBlock {

    public static void main(String[] args) {
        method1();
        System.out.println("Hello there");
        System.out.println("Hello there again");
    }


    public static void method1(){

        System.out.println("Custom Static method1");

    }

    static {
        System.out.println("Hello, I get executed as soon as class is loaded");
        System.out.println("I get executed only once");
    }

}
