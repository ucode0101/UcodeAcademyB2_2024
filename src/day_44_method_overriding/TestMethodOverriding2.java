package day_44_method_overriding;

public class TestMethodOverriding2 extends MethodOverriding {

    @Override
    public void sayHi(){
        System.out.println("Hi Hi Hi bye bye bye");

    }

    @Override
    public void sayBye(){
        System.out.println("Bye Bye Bye");
    }

    @Override
    public String returnInput(String str){
        return "Bye Hi good bye "+ str;
    }

    public static void main(String[] args) {
        TestMethodOverriding2 obj = new TestMethodOverriding2();

        obj.sayHi();
        obj.sayBye();
        System.out.println(obj.returnInput("John"));
    }

}
