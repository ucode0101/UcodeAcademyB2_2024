package day_43_oop_inheritance_continue;

public class CallSuperConstructor extends SuperKeywords {

    // we have to call super class's constructor
    // because it doesn't have default constructor
    // this Constructor is used to call parent class's constructor using super()
    public CallSuperConstructor(){
        //super(55);
        super("java");
    }

    public static void main(String[] args) {
        CallSuperConstructor obj = new CallSuperConstructor();
        obj.name = "API";
        System.out.println(obj.name);
    }

}
