package day_43_oop_inheritance_continue;

public class TestSuperKeywords2 extends SuperKeywords2{

    public TestSuperKeywords2(){

        //super(); // call super class's default constructor
        //super(10); // call super class's constructor with int parameter
        //super("Java"); // call super class's constructor with String parameter

        //this(66); // call current class's constructor with int parameter
    }

    public TestSuperKeywords2(int num){
        System.out.println("Current class's Constructor with Int Parameter");
        System.out.println(num);
    }




    public static void main(String[] args) {
        //TestSuperKeywords2 obj = new TestSuperKeywords2();

    }



}
