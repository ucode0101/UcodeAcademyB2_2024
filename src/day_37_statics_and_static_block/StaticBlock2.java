package day_37_statics_and_static_block;

public class StaticBlock2 {


    public static void main(String[] args) {

    }



    int x;  // instance variable
    public void test(){  // instance method
        System.out.println("Hello");
    }

    static int a;
    static int b;

    static {
        //x = 5; static can Not access instance variables
        //test(); static can Not access instance methods
        a = 10;
        b = 20;

        if (a > b){
            a = 100;
        } else {
            b = 100;
        }

        System.out.println("A is: "+a+" B is: "+b);

        Student student = new Student();

        student.setInfo("Dave Jack", 90 );
        System.out.println(student);
        student.displaySchoolName();

    }




}
