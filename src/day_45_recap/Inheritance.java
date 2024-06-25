package day_45_recap;

public class Inheritance {

    public Inheritance(int num){

    }
    protected String name;

    public void method1(){
        System.out.println("Method 1");
    }
}

class Test1 extends Inheritance{

    public Test1(){
        super(4);
    }
    public String name2;
    public int num;

    public static void main(String[] args) {
        Test1 obj = new Test1();

        obj.name = "James";
        obj.name2 = "Sara";
        obj.num = 222;

        System.out.println(obj.name);
        System.out.println(obj.name2);
        System.out.println(obj.num);
        obj.method1();

    }
}

class Test3 extends Test1{

    public static void main(String[] args) {
        Test3  obj = new Test3();
        obj.name = "java";
        obj.name2 = "selenium";
        obj.num = 55;
        System.out.println(obj.name);
        System.out.println(obj.name2);
        System.out.println(obj.num);
        obj.method1();



    }

}