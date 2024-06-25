package day_50_oop_polymorphism_intro;

public class Cat2 extends Animal2{

    String catName;

    public Cat2(int age, String name, String catName){
        this.age = age;
        this.name = name;
        this.catName = catName;
    }

    @Override
    public void eat(){
        System.out.println(catName+" is eating");
    }
    @Override
    public void sleep(){
        System.out.println(catName+" is sleeping");
    }
    @Override
    public void method1(){
        System.out.println("Cat class");
    }
}
