package day_50_oop_polymorphism_intro;

public class AnimalObject2 {
    public static void main(String[] args) {
        Dog2 dog2 = new Dog2(3, "Dog Name", "My Dog2");
        System.out.println(dog2.dogName);

        Cat2 cat2 = new Cat2(1, "Cat Name","My Cat2");

        System.out.println(cat2.catName);
    }
}
