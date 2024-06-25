package day_49_oop_abstraction_continue;

public abstract class Animal {

    public abstract void sound();

    public void testMethod(){
        System.out.println("Hell test method");
    }
}


class Dog extends Animal{

    public void sound(){
        System.out.println("Woof woof");
    }
}


class Cat extends Animal{

    public void sound(){
        System.out.println("Mew mew");
    }
}


class TestAnimals{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();
    }
}
