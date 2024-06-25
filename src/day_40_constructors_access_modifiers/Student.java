package day_40_constructors_access_modifiers;

public class Student {
    String name;
    int age;
    String school;

    public Student(){
        System.out.println("Constructor runs whenever an object of Student class is created");
    }
    {

        System.out.println("Instance block run whenever an object of Student class is created");
    }

    static {
        System.out.println("Static block always runs first and once only");
    }


    public static void main(int a){

    }

}

class StudentObject{
    public static void main(String[] args) {
        Student obj = new Student();
        System.out.println("==============================");
        Student obj2 = new Student();
        System.out.println("====================================");
        Student obj3 = new Student();
    }
}