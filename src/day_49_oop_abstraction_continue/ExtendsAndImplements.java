package day_49_oop_abstraction_continue;

public interface ExtendsAndImplements {

    void method1();
}

interface A1 {

}

// this interface inheriting two interface, it can inherit more than
// we use 'extends' keyword when interface inheriting another interface -> same type
interface A2 extends A1, ExtendsAndImplements{

}

class C1 implements ExtendsAndImplements, A1,A2{

    public void method1(){
        System.out.println("Hello");
    }
}

// Abstract class inheriting multiple interfaces
abstract class Ab1 implements ExtendsAndImplements, A1, A2{

}

// abstract class can also inherit concrete/regular class
abstract class Ab2 extends C1{

}