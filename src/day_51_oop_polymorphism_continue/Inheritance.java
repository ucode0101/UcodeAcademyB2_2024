package day_51_oop_polymorphism_continue;

public class Inheritance {

    String name;
    public void sum(int x, int y){
        System.out.println(x + y);
    }

}

class TestInheritance extends Inheritance{

    public static void main(String[] args) {
        TestInheritance obj1 = new TestInheritance();

        obj1.name = "java";
        obj1.sum(19, 11);
        System.out.println(obj1.name);

        Inheritance obj2 = new Inheritance();
        System.out.println(obj2.name); // what will be printed

    }
}