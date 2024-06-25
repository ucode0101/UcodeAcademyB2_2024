package day_50_oop_polymorphism_intro;

public abstract class Animal {
    protected int age;
    protected String name;


    public void eat(){
        System.out.println("Animal is eating");
    }
    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    public void method1(){
        System.out.println("Animal class");
    }

}
