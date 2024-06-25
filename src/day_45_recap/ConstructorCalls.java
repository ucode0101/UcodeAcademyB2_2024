package day_45_recap;

public class ConstructorCalls {

    public ConstructorCalls(){
        this("Java");
        System.out.println("Default constructor");
    }

    public ConstructorCalls(int num){

       this(); // calling the default constructor
        System.out.println(num);
    }

    public ConstructorCalls(String str){
        System.out.println(str);
    }

}


// using multiple classes in the file. They are two different classes

class Test extends ConstructorCalls{
    // used to call parent class's constructor
    public Test(){
        super("str");
    }

    public Test(int num){
        super();
    }

    public static void main(String[] args) {
        ConstructorCalls obj = new ConstructorCalls(5);
    }

}