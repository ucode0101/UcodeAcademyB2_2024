package day_47_exceptions_continue;

public class FinalMethod {

    final public void sayHi(){
        System.out.println("Hi");
    }
    final public void sayBye(){
        System.out.println("Bye");
    }
}


class TestFinalMethod extends FinalMethod{

//  public void sayHi(){} // cannot override final method

// public void sayBye(){ } // cannot override final method

    public static void main(String[] args) {
        TestFinalMethod obj = new TestFinalMethod();
        obj.sayHi();
        obj.sayBye();
    }
}