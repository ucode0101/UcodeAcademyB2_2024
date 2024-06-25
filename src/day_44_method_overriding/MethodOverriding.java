package day_44_method_overriding;

public class MethodOverriding {

    public void sayHi(){
        System.out.println("Hi");
    }

    public void sayBye(){
        System.out.println("Bye");
    }


    public String returnInput(String str){
        return str;
    }
}


class TestMethodOverriding extends MethodOverriding{

    @Override
     public void sayHi(){
        System.out.println("Hi, how are you?");
        //super.sayHi(); // if we want to call super class's method/original method
    }

    @Override
    public void sayBye(){
        System.out.println("Bye, have a nice day!");
    }

    @Override
    public String returnInput(String str){
        return "Hello, Welcome "+str;
    }

    //@Override // it will not compile/compilation error because it is not Override method
    public void testMethod(){
        System.out.println("Hello");
    }


    public static void main(String[] args) {
        TestMethodOverriding2 obj = new TestMethodOverriding2();
        obj.sayHi();
        obj.sayBye();

        System.out.println(obj.returnInput("Mike"));
    }
}
