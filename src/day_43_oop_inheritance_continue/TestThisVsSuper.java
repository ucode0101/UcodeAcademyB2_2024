package day_43_oop_inheritance_continue;

public class TestThisVsSuper extends ThisVsSuper{

    String str = "Current class's instance variable";


    public TestThisVsSuper(String str){
        //this.str = str;  // if we want to initialize current class's instance variable
        ///super.str = str; // if we want to initialize super class's instance variable
    }

    public TestThisVsSuper(){

    }

    public String getName(){
        //return this.str; // if we want to return current class's instance variable
        return super.str; // if we want to return super class's instance variable
    }


    public static void main(String[] args) {
        TestThisVsSuper obj = new TestThisVsSuper("java");
        System.out.println(obj.getName());

        System.out.println("======================================");

        TestThisVsSuper obj2 = new TestThisVsSuper();
        System.out.println(obj2.getName());
    }

}
