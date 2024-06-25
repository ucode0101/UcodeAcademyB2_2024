package day_38_statics_continue_instance_block;

public class RecursiveMethod {


    public static void test1(){
        test1();
    }

    public void test2(){
        test2();
    }

    public static void main(String[] args) {
        //test1();

        //RecursiveMethod obj = new RecursiveMethod(); // create object first
        //obj.test2(); // call test2() through object

        //new RecursiveMethod().test2(); // calling instance method using without creating an object
    }
}
