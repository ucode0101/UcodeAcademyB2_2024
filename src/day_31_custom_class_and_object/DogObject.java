package day_31_custom_class_and_object;

public class DogObject {

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        // if we want to set object/dog1 info one by one
//        dog1.name = "Rex";
//        dog1.age = 2;
//        dog1.color = "Black";
//        dog1.size = "Medium";


       // System.out.println(dog1.name);
        dog1.setDogInfo("Rex",2,"Black","Medium");
        dog1.getDogInfo();

        dog1.eat();
        dog1.bark();


    }

}
