package day_48_oop_abstraction;

public abstract class Abstraction1 {

    // This is an abstract method without the body {}
    // 'abstract' keyword can come before or after access modifier
    abstract public void saySomething();

    // abstract method with parameter
    public abstract void doSomething(int num);

    // Concrete/regular method
    public void sayWhatever(){
        System.out.println("Hello");
    }
}


class TestAbstraction extends Abstraction1{

    public void saySomething(){
        System.out.println("Hello, Override abstract method");
    }

    public void doSomething(int a){

        System.out.println("You provided: "+a);
    }

    public static void main(String[] args) {

        TestAbstraction obj = new TestAbstraction();

        obj.saySomething();
        obj.doSomething(40);

    }

}


class TestAbstraction2 extends Abstraction1{

    public void saySomething(){
        System.out.println("Hell, I am in Test class 2");
    }

    public void doSomething(int ab){
        System.out.println(ab * ab);
    }

    public static void main(String[] args) {
        TestAbstraction2 obj = new TestAbstraction2();

        obj.saySomething();
        obj.doSomething(10);
    }
}

