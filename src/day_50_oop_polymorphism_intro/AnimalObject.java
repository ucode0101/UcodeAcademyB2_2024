package day_50_oop_polymorphism_intro;

public class AnimalObject {
    public static void main(String[] args) {

        Tiger tiger = new Tiger(1, "Super Tiger","My Tiger");

        System.out.println(tiger.tigerName);

        Dog dog = new Dog(2, "Shiba","My Shiba");

        System.out.println(dog.dogName);

    }
}
