package day_50_oop_polymorphism_intro;

public class Tiger extends Animal{

    protected String tigerName;

    public Tiger(int age, String name,String tigerName){

        this.age = age;
        this.name = name;
        this.tigerName = tigerName;

    }

    @Override
    public void eat(){
        System.out.println(tigerName+ " is eating");
    }

    @Override
    public void sleep(){
        System.out.println(tigerName+ " is sleeping");
    }

    @Override
    public void method1(){
        System.out.println("Tiger class");
    }

}
