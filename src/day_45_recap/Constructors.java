package day_45_recap;

public class Constructors {
    public Integer num;

    public static void method1(){

        System.out.println("Method 1");
    }

    public void method2(){
        System.out.println("Method 2");
    }

    public Constructors(){
        this("java");

        num = 123;

    }

    public Constructors(String str){
        System.out.println(str);
        method1();
        method2();
    }

    public static void main(String[] args) {
        Constructors obj = new Constructors();
        System.out.println(obj.num);

        new Constructors("java");
    }
}


class Test2 extends Constructors{

    // using super() to call parent class's constructor from child class's constructor
    public Test2(){
        super();
    }

}