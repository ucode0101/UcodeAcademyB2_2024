package day_43_oop_inheritance_continue;

public class SuperKeywords {
    protected String name;
    protected String title;

//    public SuperKeywords(){
//        System.out.println("I am super/parent class constructor");
//    }
//
    public SuperKeywords(int num){
        System.out.println("Super class Constructor");
        System.out.println(num);
    }
    public SuperKeywords(String str){
        System.out.println(str);
    }
}

class TestSuperKeyword extends SuperKeywords{
    public TestSuperKeyword(){
        super(22);
        //super("test");
    }
}