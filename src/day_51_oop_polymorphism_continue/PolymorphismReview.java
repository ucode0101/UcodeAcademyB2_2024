package day_51_oop_polymorphism_continue;

public class PolymorphismReview {

    public void sound(){
        System.out.println("Sound in Parent class");
    }

}

class TestPolymorphism extends PolymorphismReview{

    public void sound(){
        System.out.println("Sound in child class");
    }

    public static void main(String[] args) {

        TestPolymorphism obj1 = new TestPolymorphism();

        PolymorphismReview obj2 = new PolymorphismReview();

        obj1.sound();
        obj2.sound();


    }
}
