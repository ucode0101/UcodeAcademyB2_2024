package day_50_oop_polymorphism_intro;

public class OverrideMethodCalling {

    public void method1(){
        System.out.println("I am in parent class");
    }
}

class TestOverride extends OverrideMethodCalling{

//    public void method1(){
//        System.out.println("I am in child class");
//    }


    public static void main(String[] args) {

        OverrideMethodCalling obj = new TestOverride();
        obj.method1();

        TestOverride obj2 = new TestOverride();
        obj2.method1();
    }
}
