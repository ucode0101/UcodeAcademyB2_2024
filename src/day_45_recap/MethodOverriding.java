package day_45_recap;

public class MethodOverriding {

    public String name = "name 1";

    public void saySomething(){
        System.out.println("Saying something");
    }
}


class TestOverriding1 extends MethodOverriding{

    @Override
    public void saySomething(){

        System.out.println("Saying something in TestOverriding1 class");
        System.out.println("Hello");

    }

    public static void main(String[] args) {
        TestOverriding1 obj = new TestOverriding1();

        obj.saySomething();
    }
}

class TestOverriding2 extends MethodOverriding{

    @Override
    public void saySomething(){

        System.out.println("Hello, I'm in TestOverriding2");

    }

    public static void main(String[] args) {
        TestOverriding2 obj = new TestOverriding2();
        obj.saySomething();
    }
}