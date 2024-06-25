package day_40_constructors_access_modifiers;

public class ConstructorCall {
    String name;
    int age;

    public void method1(){
        System.out.println("Instance Method");

    }
    public static void method2(){
        System.out.println("Static method");
    }

    // a custom method that we use to initialization
    public void setInfo(String name, int age){
        this.name = name;
        this.age = age;
    }

    public ConstructorCall(String name, int age){
        this.name = name;
        this.age = age;
    }
    public ConstructorCall(){

        this("Hello");
        System.out.println("Default Constructor");
        this.method1();
        method2();

    }
    public ConstructorCall(String name){
        this(35);
        this.name = name;
        System.out.println("Constructor with String Parameter");
    }

    public ConstructorCall(int age){
        //this();
        this.age = age;
        System.out.println("Constructor with int parameter");
        method2();

    }

    public int getAge(){
        return  this.age;
    }

    public static void main(String[] args) {
        ConstructorCall object = new ConstructorCall(); // Default Constructor gets invoked/executed
        ConstructorCall object2 = new ConstructorCall("Java", 123);
    }

}
